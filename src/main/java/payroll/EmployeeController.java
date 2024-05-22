package payroll;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) throws Exception {
        if (!repository.findAll().toString().contains(newEmployee.getName())) {
            return repository.save(newEmployee);
        }
        throw new Exception();
    }

    // Single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @GetMapping("/employees/dept")
    List<String> allUniqueDept() {
        List<String> dept = new ArrayList<>();
        for (Employee i: repository.findAll()) {
            if (!dept.contains(i.getRole())) {
                dept.add(i.getRole());
            }
        }
        return dept;
    }

    @GetMapping("/employees/moreThan50")
    List<Employee> getMoreThan50() {
        return repository.findAll().stream()
                .filter(e -> e.getAge() > 50)
                .collect(Collectors.toList());
    }

    @GetMapping("/employees/lessThan30")
    List<Employee> getLessThan30() {
        return repository.findAll().stream()
                .filter(e -> e.getAge() < 30)
                .collect(Collectors.toList());
    }

    @GetMapping("/employees/fullReport")
    Map<String, Integer>fullReport() {

        Map<String, Integer> report = new HashMap();

        int totalEmployees = repository.findAll().size();
        List<Integer> listOfAges = new ArrayList<>();
        List<Integer> listOfSalaries = new ArrayList<>();

        for (Employee i: repository.findAll()) {
            listOfAges.add(i.getAge());
            listOfSalaries.add(i.getSalary());
        }

        int sumOfAges = listOfAges.stream().mapToInt(Integer::intValue).sum();
        int avgOfAges = Math.floorDiv(sumOfAges, totalEmployees);

        int sumOfSalaries = listOfSalaries.stream().mapToInt(Integer::intValue).sum();
        int avgOfSalaries = Math.floorDiv(sumOfSalaries, totalEmployees);

        int maxSalary = Collections.max(listOfSalaries);
        int minSalary = Collections.min(listOfSalaries);

        report.put("Total Employees", totalEmployees);
        report.put("Average Age", avgOfAges);
        report.put("Average Salary", avgOfSalaries);
        report.put("Maximum Salary", maxSalary);
        report.put("Minimum Salary", minSalary);

        return report;
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    employee.setAge(newEmployee.getAge());
                    employee.setSalary(newEmployee.getSalary());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
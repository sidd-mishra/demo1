package payroll;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTests {

    @Autowired
    private MockMvc mvc;


    @Test
    public void testSomeEmployees() throws Exception {

//        Testing employees
        mvc.perform(get("/employees").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[0].name", is("Bilbo Baggins")))
                .andExpect(jsonPath("[0].role", is("burglar")));

    }

    @Test
    public void testAddingEmployees() throws Exception {
        //        Adding an employee
        mvc.perform(post("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Samwise Gamgee\",\"role\":\"gardener\"}"));

        mvc.perform(get("/employees").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[2].name", is("Samwise Gamgee")))
                .andExpect(jsonPath("[2].role", is("gardener")));

    }


    @Test
    public void testUpdatingEmployees() throws Exception {

        //        Updating an employee

        mvc.perform(put("/employees/3")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Samwise Gamgee\",\"role\":\"ring bearer\"}"));

        mvc.perform(get("/employees").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[2].name", is("Samwise Gamgee")))
                .andExpect(jsonPath("[2].id", is(3)))
                .andExpect(jsonPath("[2].role", is("ring bearer")));

    }

    @Test
    public void testDeletingEmployee() throws Exception {
        //        Deleting an employee
        mvc.perform(delete("/employees/1"))
                .andExpect(status().isOk());

        mvc.perform(get("/employees/1"))
                .andExpect(status().isNotFound());

        mvc.perform(get("/employees").accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("[0].name", is("Frodo Baggins")))
                .andExpect(jsonPath("[0].id", is(2)));

    }

}

import com.jefferies.fidessa.controller.TradeSummaryController;
import com.jefferies.fidessa.model.TradeSummary;
import com.jefferies.fidessa.repository.TradeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TradeSummaryServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TradeSummaryService tradeSummaryService;

    @MockBean
    private TradeRepository tradeRepository;

    @InjectMocks
    private TradeSummaryController tradeSummaryController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveTradeSummary() throws Exception {
        TradeSummary tradeSummary = new TradeSummary();
        when(tradeSummaryService.save(any(TradeSummary.class))).thenReturn(tradeSummary);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/tradeSummary")
                        .contentType("application/json")
                        .content("{\"field\":\"value\"}"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Trade summary saved successfully"));
    }

    @Test
    public void testGetTradeSummaries() throws Exception {
        List<TradeSummary> tradeSummaries = Collections.singletonList(new TradeSummary());
        when(tradeSummaryService.findAll()).thenReturn(tradeSummaries);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/tradeSummary"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].field").value("value"));
    }

    @Test
    public void testReadFileAndInsertRecords() throws Exception {
        when(tradeSummaryService.ProcessFile()).thenReturn(new TradeSummaryResponse("Success"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/tradeSummary/file")
                        .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Success"));
    }
}
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

        String jsonContent = "{\"timestamp\": \"Dummy\","
                + "\"tradeId\": \"Dummy\","
                + "\"tradePartIndex\": \"Dummy\","
                + "\"version\": \"Dummy\","
                + "\"backOfficeNoteId\": \"Dummy\","
                + "\"bookCode\": \"Dummy\","
                + "\"clearingServiceId\": \"Dummy\","
                + "\"counterpartyCode\": \"Dummy\","
                + "\"giveupCounterparty\": \"Dummy\","
                + "\"dealtCurrencyId\": \"Dummy\","
                + "\"enteredBy\": \"Dummy\","
                + "\"frontOfficeNoteId\": \"Dummy\","
                + "\"instrumentCurrencyId\": \"Dummy\","
                + "\"instrumentCode\": \"Dummy\","
                + "\"marketId\": \"Dummy\","
                + "\"reportDestinationId\": \"Dummy\","
                + "\"paymentMethodId\": \"Dummy\","
                + "\"positionCurrencyId\": \"Dummy\","
                + "\"representativeId\": \"Dummy\","
                + "\"settlementCurrencyId\": \"Dummy\","
                + "\"trader\": \"Dummy\","
                + "\"tradingEntityId\": \"Dummy\","
                + "\"exchangeTradeCode\": \"Dummy\","
                + "\"accruedInterest\": \"Dummy\","
                + "\"brokerage\": \"Dummy\","
                + "\"businessTransaction\": \"Dummy\","
                + "\"buySell\": \"Dummy\","
                + "\"buySellSense\": \"Dummy\","
                + "\"clientGrossBasis\": \"Dummy\","
                + "\"commission\": \"Dummy\","
                + "\"counterpartyChargingRole\": \"Dummy\","
                + "\"counterpartyReportingRole\": \"Dummy\","
                + "\"firmChargingRole\": \"Dummy\","
                + "\"dealingCapacity\": \"Dummy\","
                + "\"initialPrice\": \"Dummy\","
                + "\"initialPriceType\": \"Dummy\","
                + "\"isMargin\": \"Dummy\","
                + "\"dealtPrice\": \"Dummy\","
                + "\"dealtPriceType\": \"Dummy\","
                + "\"averageMarketGrossPrice\": \"Dummy\","
                + "\"averageMarketNetLocalPrice\": \"Dummy\","
                + "\"averageMarketPriceCurrencyId\": \"Dummy\","
                + "\"dealtToSettlementRate\": \"Dummy\","
                + "\"dealtToSettlementSense\": \"Dummy\","
                + "\"deliveryMechanism\": \"Dummy\","
                + "\"enteredDatetime\": \"Dummy\","
                + "\"facilitation\": \"Dummy\","
                + "\"flags\": \"Dummy\","
                + "\"grossConsideration\": \"Dummy\","
                + "\"grossPrice\": \"Dummy\","
                + "\"instrumentToDealtRate\": \"Dummy\","
                + "\"instrumentToDealtSense\": \"Dummy\","
                + "\"marketCharges\": \"Dummy\","
                + "\"markup\": \"Dummy\","
                + "\"netConsideration\": \"Dummy\","
                + "\"netNetConsideration\": \"Dummy\","
                + "\"netNetPrice\": \"Dummy\","
                + "\"netPrice\": \"Dummy\","
                + "\"quantity\": \"Dummy\","
                + "\"reportScenario\": \"Dummy\","
                + "\"reportScenarioQualifier\": \"Dummy\","
                + "\"salescredit\": \"Dummy\","
                + "\"settlementConsideration\": \"Dummy\","
                + "\"settlementDays\": \"Dummy\","
                + "\"state\": \"Dummy\","
                + "\"tradedFlatOfAccrued\": \"Dummy\","
                + "\"tradeDatetime\": \"Dummy\","
                + "\"valueDate\": \"Dummy\","
                + "\"exchangeSpecific1\": \"Dummy\","
                + "\"exchangeSpecific2\": \"Dummy\","
                + "\"exchangeSpecific3\": \"Dummy\","
                + "\"exchangeSpecific4\": \"Dummy\","
                + "\"exchangeSpecific5\": \"Dummy\","
                + "\"exchangeSpecific6\": \"Dummy\","
                + "\"exchangeSpecific7\": \"Dummy\","
                + "\"minLegalShortSellPrice\": \"Dummy\","
                + "\"bidPrice\": \"Dummy\","
                + "\"offerPrice\": \"Dummy\","
                + "\"rootTradeVersion\": \"Dummy\","
                + "\"isFlipTrade\": \"Dummy\","
                + "\"settlementToFlipRate\": \"Dummy\","
                + "\"settlementToFlipSense\": \"Dummy\","
                + "\"estimatedCommission\": \"Dummy\","
                + "\"is_swingTrade\": \"Dummy\","
                + "\"tradeSource\": \"Dummy\","
                + "\"cptyTraderId\": \"Dummy\","
                + "\"amendedBy\": \"Dummy\","
                + "\"orderId\": \"Dummy\","
                + "\"crossingOrderId\": \"Dummy\","
                + "\"shortSell\": \"Dummy\","
                + "\"badShortSell\": \"Dummy\","
                + "\"contributorId\": \"Dummy\","
                + "\"reportNotes\": \"Dummy\","
                + "\"reportPriceType\": \"Dummy\","
                + "\"reportFlags\": \"Dummy\","
                + "\"commissionArg\": \"Dummy\","
                + "\"commissionMethod\": \"Dummy\","
                + "\"markupArg\": \"Dummy\","
                + "\"markupMethod\": \"Dummy\","
                + "\"salescreditArg\": \"Dummy\","
                + "\"salescreditMethod\": \"Dummy\","
                + "\"brokerageArg\": \"Dummy\","
                + "\"brokerageMethod\": \"Dummy\","
                + "\"orderAvgPrice\": \"Dummy\","
                + "\"clearingFlags\": \"Dummy\","
                + "\"actFirmRole\": \"Dummy\","
                + "\"parentOrderId\": \"Dummy\","
                + "\"clearingCode\": \"Dummy\","
                + "\"foreignCurrency\": \"Dummy\","
                + "\"foreignSettlementCurrency\": \"Dummy\","
                + "\"specialcreditArg\": \"Dummy\","
                + "\"specialcreditMethod\": \"Dummy\","
                + "\"brokerId1\": \"Dummy\","
                + "\"brokerBid1\": \"Dummy\","
                + "\"brokerAsk1\": \"Dummy\","
                + "\"brokerId2\": \"Dummy\","
                + "\"brokerBid2\": \"Dummy\","
                + "\"brokerAsk2\": \"Dummy\","
                + "\"brokerId3\": \"Dummy\","
                + "\"brokerBid3\": \"Dummy\","
                + "\"brokerAsk3\": \"Dummy\","
                + "\"locateInfo\": \"Dummy\","
                + "\"contributorRef\": \"Dummy\","
                + "\"isStoppedFill\": \"Dummy\","
                + "\"autoHouseSplit\": \"Dummy\","
                + "\"autoHouseDesired\": \"Dummy\","
                + "\"autoHouseAllowed\": \"Dummy\","
                + "\"autoHouseActual\": \"Dummy\","
                + "\"executionVenue\": \"Dummy\","
                + "\"executionId\": \"Dummy\","
                + "\"fillcommissionArg\": \"Dummy\","
                + "\"fillcommissionMethod\": \"Dummy\","
                + "\"fillcommission\": \"Dummy\","
                + "\"liquidityIndicator\": \"Dummy\","
                + "\"countryCode\": \"Dummy\","
                + "\"tradeThroughExemptionReason\": \"Dummy\","
                + "\"bookingCapacity\": \"Dummy\","
                + "\"instrumentId\": \"Dummy\","
                + "\"originatingCounterparty\": \"Dummy\","
                + "\"shortSellExemptionReason\": \"Dummy\","
                + "\"sedlCode\": \"Dummy\","
                + "\"isinCode\": \"Dummy\","
                + "\"lastMkt\": \"Dummy\","
                + "\"tradeThroughSweepId\": \"Dummy\","
                + "\"senderSubId\": \"Dummy\","
                + "\"serviceId\": \"Dummy\","
                + "\"executorId\": \"Dummy\","
                + "\"custAllocationCounterpartyId\": \"Dummy\","
                + "\"linkedBrokerCptyId\": \"Dummy\","
                + "\"minimumTradePrice\": \"Dummy\","
                + "\"maximumTradePrice\": \"Dummy\","
                + "\"rootOrderId\": \"Dummy\","
                + "\"orderVersion\": \"Dummy\","
                + "\"globalOrderId\": \"Dummy\","
                + "\"routedOrderCode\": \"Dummy\","
                + "\"custContraBranchSeq\": \"Dummy\","
                + "\"orderFillNotificationId\": \"Dummy\","
                + "\"priceStrategy\": \"Dummy\","
                + "\"tradeTickExemptionReason\": \"Dummy\","
                + "\"tradeAtExemptionReason\": \"Dummy\","
                + "\"displayExemptionOrderIds\": \"Dummy\","
                + "\"postTradeShortSellPosition\": \"Dummy\","
                + "\"normLiquidityIndicator\": \"Dummy\","
                + "\"quantityFilled\": \"Dummy\","
                + "\"parentQuantityFilled\": \"Dummy\","
                + "\"oatsOrderVersion\": \"Dummy\","
                + "\"orderBookingType\": \"Dummy\","
                + "\"hedgedOrderId\": \"Dummy\","
                + "\"orderLegId\": \"Dummy\","
                + "\"siteContractingEntity\": \"Dummy\""
                + "}";

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
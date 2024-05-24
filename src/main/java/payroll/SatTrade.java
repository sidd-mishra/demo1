package payroll;

public class SatTrade extends HubTrade {

    private int tradePartIndex;
    private String version;
    private String backOfficeNoteId;
    private String clearingServiceId;
    private String giveUpCounterparty;
    private String dealtCurrencyId;
    private String enteredBy;
    private String frontOfficeNoteId;
    private String instrumentCurrencyId;
    private String reportDestinationId;
    private String paymentMethodId;
    private String positionCurrencyId;
    private String representativeId;
    private String settlementCurrencyId;
    private String tradingEntityId;
    private String exchangeTradeCode;
    private float accruedInterest;
    private String brokerage;
    private String businessTransaction;
    private String buySell;
    private String buySellSense;
    private String clientGrossBasis;
    private float commission;
    private String counterpartyChargingRole;
    private String counterpartyReportingRole;
    private String firmChargingRole;
    private String dealingCapacity;
    private float initialPrice;
    private String initialPriceType;
    private String isMargin;
    private float dealtPrice;
    private String dealtPriceType;
    private float averageMarketGrossPrice;
    private float averageMarketNetLocalPrice;
    private String averageMarketPriceCurrencyId;
    private float dealtToSettlementRate;
    private String dealtToSettlementSense;
    private String deliveryMechanism;
    private String enteredDatetime;
    private float facilitation;
    private String flags;
    private float grossConsideration;
    private float grossPrice;
    private float instrumentToDealtRate;
    private String instrumentToDealtSense;
    private float marketCharges;
    private float markup;
    private float netConsideration;
    private float netNetConsideration;
    private float netNetPrice;
    private float netPrice;
    private float quantity;
    private String reportScenario;
    private String reportScenarioQualifier;
    private float salesCredit;
    private float settlementConsideration;
    private int settlementDays;
    private String state;
    private String tradedFlatOfAccrued;
    private String tradeDatetime;
    private String valueDate;
    private String exchangeSpecific;
    private String exchangeSpecific2;
    private String exchangeSpecific4;
    private String exchangeSpecific5;
    private float minLegalShortSellPrice;
    private float bidPrice;
    private float offerPrice;
    private int rootTradeVersion;
    private String isFlipTrade;
    private float settlementToFlipRate;
    private String settlementToFlipSense;
    private float estimatedCommission;
    private String isSwingTrade;
    private String tradeSource;
    private String cptyTraderId;
    private String amendedBy;
    private String orderId;
    private String crossingOrderId;
    private String shortSell;
    private String badShortSell;
    private String contributorId;
    private String reportNotes;
    private String reportPriceType;
    private String reportFlags;
    private float commissionArg;
    private String commissionMethod;
    private float markupArg;
    private String markupMethod;
    private float salesCreditArg;
    private String salesCreditMethod;
    private float brokerageArg;
    private String brokerageMethod;
    private String orderAvgPrice;
    private String clearingFlags;
    private String actFirmRole;
    private String parentOrderId;
    private String clearingCode;
    private String foreignCurrency;
    private String foreignSettlementCurrency;
    private float specialCreditArg;
    private String specialCreditMethod;
    private float brokerId1;
    private float brokerBid1;
    private float brokerAsk1;
    private float brokerId2;
    private float brokerBid2;
    private float brokerAsk2;
    private float brokerId3;
    private float brokerBid3;
    private float brokerAsk3;
    private String locateInfo;
    private String contributorRef;
    private String isStoppedFill;
    private String autoHouseSplit;
    private int autoHouseDesired;
    private float autoHouseAllowed;
    private float autoHouseActual;
    private String executionVenue;
    private String executionId;
    private float fillCommissionArg;
    private String fillCommissionMethod;
    private int liquidityIndicator;
    private String countryCode;
    private String tradeThroughExemptionReason;
    private String bookingCapacity;
    private String originatingCounterparty;
    private String shortSellExemptionReason;
    private String sedlCode;
    private String isInCode;
    private String lastMkt;
    private String tradeThroughSweepId;
    private String senderSubId;
    private String serviceId;
    private String executorId;
    private String custAllocationCounterpartyId;
    private String linkedBrokerCptyId;
    private float minimumTradePrice;
    private float maximumTradePrice;
    private String rootOrderId;
    private String orderVersion;
    private String globalOrderId;
    private String routedOrderCode;
    private String custContraBranchSea;
    private String orderFillNotificationId;
    private String priceStrategy;
    private String tradeTickExemptionReason;
    private String tradeAlExemptionReason;
    private String displayExemptionOrderIds;
    private String postTradeShortSellPosition;
    private String normLiquidityIndicator;
    private String quantityFilled;
    private String parentQuantityFilled;
    private String oatsOrderVersion;
    private String orderBookingType;
    private String hedgedOrderId;
    private String orderLegId;
    private String siteContractingEntity;

    // Getters for all instance variables

    public int getTradePartIndex() {
        return tradePartIndex;
    }

    public String getVersion() {
        return version;
    }

    public String getBackOfficeNoteId() {
        return backOfficeNoteId;
    }

    public String getClearingServiceId() {
        return clearingServiceId;
    }

    public String getGiveUpCounterparty() {
        return giveUpCounterparty;
    }

    public String getDealtCurrencyId() {
        return dealtCurrencyId;
    }

    public String getEnteredBy() {
        return enteredBy;
    }

    public String getFrontOfficeNoteId() {
        return frontOfficeNoteId;
    }

    public String getInstrumentCurrencyId() {
        return instrumentCurrencyId;
    }

    public String getReportDestinationId() {
        return reportDestinationId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public String getPositionCurrencyId() {
        return positionCurrencyId;
    }

    public String getRepresentativeId() {
        return representativeId;
    }

    public String getSettlementCurrencyId() {
        return settlementCurrencyId;
    }

    public String getTradingEntityId() {
        return tradingEntityId;
    }

    public String getExchangeTradeCode() {
        return exchangeTradeCode;
    }

    public float getAccruedInterest() {
        return accruedInterest;
    }

    public String getBrokerage() {
        return brokerage;
    }

    public String getBusinessTransaction() {
        return businessTransaction;
    }

    public String getBuySell() {
        return buySell;
    }

    public String getBuySellSense() {
        return buySellSense;
    }

    public String getClientGrossBasis() {
        return clientGrossBasis;
    }

    public float getCommission() {
        return commission;
    }

    public String getCounterpartyChargingRole() {
        return counterpartyChargingRole;
    }

    public String getCounterpartyReportingRole() {
        return counterpartyReportingRole;
    }

    public String getFirmChargingRole() {
        return firmChargingRole;
    }

    public String getDealingCapacity() {
        return dealingCapacity;
    }

    public float getInitialPrice() {
        return initialPrice;
    }

    public String getInitialPriceType() {
        return initialPriceType;
    }

    public String getIsMargin() {
        return isMargin;
    }

    public float getDealtPrice() {
        return dealtPrice;
    }

    public String getDealtPriceType() {
        return dealtPriceType;
    }

    public float getAverageMarketGrossPrice() {
        return averageMarketGrossPrice;
    }

    public float getAverageMarketNetLocalPrice() {
        return averageMarketNetLocalPrice;
    }

    public String getAverageMarketPriceCurrencyId() {
        return averageMarketPriceCurrencyId;
    }

    public float getDealtToSettlementRate() {
        return dealtToSettlementRate;
    }

    public String getDealtToSettlementSense() {
        return dealtToSettlementSense;
    }

    public String getDeliveryMechanism() {
        return deliveryMechanism;
    }

    public String getEnteredDatetime() {
        return enteredDatetime;
    }

    public float getFacilitation() {
        return facilitation;
    }

    public String getFlags() {
        return flags;
    }

    public float getGrossConsideration() {
        return grossConsideration;
    }

    public float getGrossPrice() {
        return grossPrice;
    }

    public float getInstrumentToDealtRate() {
        return instrumentToDealtRate;
    }

    public String getInstrumentToDealtSense() {
        return instrumentToDealtSense;
    }

    public float getMarketCharges() {
        return marketCharges;
    }

    public float getMarkup() {
        return markup;
    }

    public float getNetConsideration() {
        return netConsideration;
    }

    public float getNetNetConsideration() {
        return netNetConsideration;
    }

    public float getNetNetPrice() {
        return netNetPrice;
    }

    public float getNetPrice() {
        return netPrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getReportScenario() {
        return reportScenario;
    }

    public String getReportScenarioQualifier() {
        return reportScenarioQualifier;
    }

    public float getSalesCredit() {
        return salesCredit;
    }

    public float getSettlementConsideration() {
        return settlementConsideration;
    }

    public int getSettlementDays() {
        return settlementDays;
    }

    public String getState() {
        return state;
    }

    public String getTradedFlatOfAccrued() {
        return tradedFlatOfAccrued;
    }

    public String getTradeDatetime() {
        return tradeDatetime;
    }

    public String getValueDate() {
        return valueDate;
    }

    public String getExchangeSpecific() {
        return exchangeSpecific;
    }

    public String getExchangeSpecific2() {
        return exchangeSpecific2;
    }

    public String getExchangeSpecific4() {
        return exchangeSpecific4;
    }

    public String getExchangeSpecific5() {
        return exchangeSpecific5;
    }

    public float getMinLegalShortSellPrice() {
        return minLegalShortSellPrice;
    }

    public float getBidPrice() {
        return bidPrice;
    }

    public float getOfferPrice() {
        return offerPrice;
    }

    public int getRootTradeVersion() {
        return rootTradeVersion;
    }

    public String getIsFlipTrade() {
        return isFlipTrade;
    }

    public float getSettlementToFlipRate() {
        return settlementToFlipRate;
    }

    public String getSettlementToFlipSense() {
        return settlementToFlipSense;
    }

    public float getEstimatedCommission() {
        return estimatedCommission;
    }

    public String getIsSwingTrade() {
        return isSwingTrade;
    }

    public String getTradeSource() {
        return tradeSource;
    }

    public String getCptyTraderId() {
        return cptyTraderId;
    }

    public String getAmendedBy() {
        return amendedBy;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCrossingOrderId() {
        return crossingOrderId;
    }

    public String getShortSell() {
        return shortSell;
    }

    public String getBadShortSell() {
        return badShortSell;
    }

    public String getContributorId() {
        return contributorId;
    }

    public String getReportNotes() {
        return reportNotes;
    }

    public String getReportPriceType() {
        return reportPriceType;
    }

    public String getReportFlags() {
        return reportFlags;
    }

    public float getCommissionArg() {
        return commissionArg;
    }

    public String getCommissionMethod() {
        return commissionMethod;
    }

    public float getMarkupArg() {
        return markupArg;
    }

    public String getMarkupMethod() {
        return markupMethod;
    }

    public float getSalesCreditArg() {
        return salesCreditArg;
    }

    public String getSalesCreditMethod() {
        return salesCreditMethod;
    }

    public float getBrokerageArg() {
        return brokerageArg;
    }

    public String getBrokerageMethod() {
        return brokerageMethod;
    }

    public String getOrderAvgPrice() {
        return orderAvgPrice;
    }

    public String getClearingFlags() {
        return clearingFlags;
    }

    public String getActFirmRole() {
        return actFirmRole;
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public String getClearingCode() {
        return clearingCode;
    }

    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public String getForeignSettlementCurrency() {
        return foreignSettlementCurrency;
    }

    public float getSpecialCreditArg() {
        return specialCreditArg;
    }

    public String getSpecialCreditMethod() {
        return specialCreditMethod;
    }

    public float getBrokerId1() {
        return brokerId1;
    }

    public float getBrokerBid1() {
        return brokerBid1;
    }

    public float getBrokerAsk1() {
        return brokerAsk1;
    }

    public float getBrokerId2() {
        return brokerId2;
    }

    public float getBrokerBid2() {
        return brokerBid2;
    }

    public float getBrokerAsk2() {
        return brokerAsk2;
    }

    public float getBrokerId3() {
        return brokerId3;
    }

    public float getBrokerBid3() {
        return brokerBid3;
    }

    public float getBrokerAsk3() {
        return brokerAsk3;
    }

    public String getLocateInfo() {
        return locateInfo;
    }

    public String getContributorRef() {
        return contributorRef;
    }

    public String getIsStoppedFill() {
        return isStoppedFill;
    }

    public String getAutoHouseSplit() {
        return autoHouseSplit;
    }

    public int getAutoHouseDesired() {
        return autoHouseDesired;
    }

    public float getAutoHouseAllowed() {
        return autoHouseAllowed;
    }

    public float getAutoHouseActual() {
        return autoHouseActual;
    }

    public String getExecutionVenue() {
        return executionVenue;
    }

    public String getExecutionId() {
        return executionId;
    }

    public float getFillCommissionArg() {
        return fillCommissionArg;
    }

    public String getFillCommissionMethod() {
        return fillCommissionMethod;
    }

    public int getLiquidityIndicator() {
        return liquidityIndicator;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getTradeThroughExemptionReason() {
        return tradeThroughExemptionReason;
    }

    public String getBookingCapacity() {
        return bookingCapacity;
    }

    public String getOriginatingCounterparty() {
        return originatingCounterparty;
    }

    public String getShortSellExemptionReason() {
        return shortSellExemptionReason;
    }

    public String getSedlCode() {
        return sedlCode;
    }

    public String getIsInCode() {
        return isInCode;
    }

    public String getLastMkt() {
        return lastMkt;
    }

    public String getTradeThroughSweepId() {
        return tradeThroughSweepId;
    }

    public String getSenderSubId() {
        return senderSubId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getExecutorId() {
        return executorId;
    }

    public String getCustAllocationCounterpartyId() {
        return custAllocationCounterpartyId;
    }

    public String getLinkedBrokerCptyId() {
        return linkedBrokerCptyId;
    }

    public float getMinimumTradePrice() {
        return minimumTradePrice;
    }

    public float getMaximumTradePrice() {
        return maximumTradePrice;
    }

    public String getRootOrderId() {
        return rootOrderId;
    }

    public String getOrderVersion() {
        return orderVersion;
    }

    public String getGlobalOrderId() {
        return globalOrderId;
    }

    public String getRoutedOrderCode() {
        return routedOrderCode;
    }

    public String getCustContraBranchSea() {
        return custContraBranchSea;
    }

    public String getOrderFillNotificationId() {
        return orderFillNotificationId;
    }

    public String getPriceStrategy() {
        return priceStrategy;
    }

    public String getTradeTickExemptionReason() {
        return tradeTickExemptionReason;
    }

    public String getTradeAlExemptionReason() {
        return tradeAlExemptionReason;
    }

    public String getDisplayExemptionOrderIds() {
        return displayExemptionOrderIds;
    }

    public String getPostTradeShortSellPosition() {
        return postTradeShortSellPosition;
    }

    public String getNormLiquidityIndicator() {
        return normLiquidityIndicator;
    }

    public String getQuantityFilled() {
        return quantityFilled;
    }

    public String getParentQuantityFilled() {
        return parentQuantityFilled;
    }

    public String getOatsOrderVersion() {
        return oatsOrderVersion;
    }

    public String getOrderBookingType() {
        return orderBookingType;
    }

    public String getHedgedOrderId() {
        return hedgedOrderId;
    }

    public String getOrderLegId() {
        return orderLegId;
    }

    public String getSiteContractingEntity() {
        return siteContractingEntity;
    }

    // Setters for all instance variables

    public void setTradePartIndex(int tradePartIndex) {
        this.tradePartIndex = tradePartIndex;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBackOfficeNoteId(String backOfficeNoteId) {
        this.backOfficeNoteId = backOfficeNoteId;
    }

    public void setClearingServiceId(String clearingServiceId) {
        this.clearingServiceId = clearingServiceId;
    }

    public void setGiveUpCounterparty(String giveUpCounterparty) {
        this.giveUpCounterparty = giveUpCounterparty;
    }

    public void setDealtCurrencyId(String dealtCurrencyId) {
        this.dealtCurrencyId = dealtCurrencyId;
    }

    public void setEnteredBy(String enteredBy) {
        this.enteredBy = enteredBy;
    }

    public void setFrontOfficeNoteId(String frontOfficeNoteId) {
        this.frontOfficeNoteId = frontOfficeNoteId;
    }

    public void setInstrumentCurrencyId(String instrumentCurrencyId) {
        this.instrumentCurrencyId = instrumentCurrencyId;
    }

    public void setReportDestinationId(String reportDestinationId) {
        this.reportDestinationId = reportDestinationId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setPositionCurrencyId(String positionCurrencyId) {
        this.positionCurrencyId = positionCurrencyId;
    }

    public void setRepresentativeId(String representativeId) {
        this.representativeId = representativeId;
    }

    public void setSettlementCurrencyId(String settlementCurrencyId) {
        this.settlementCurrencyId = settlementCurrencyId;
    }

    public void setTradingEntityId(String tradingEntityId) {
        this.tradingEntityId = tradingEntityId;
    }

    public void setExchangeTradeCode(String exchangeTradeCode) {
        this.exchangeTradeCode = exchangeTradeCode;
    }

    public void setAccruedInterest(float accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public void setBrokerage(String brokerage) {
        this.brokerage = brokerage;
    }

    public void setBusinessTransaction(String businessTransaction) {
        this.businessTransaction = businessTransaction;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public void setBuySellSense(String buySellSense) {
        this.buySellSense = buySellSense;
    }

    public void setClientGrossBasis(String clientGrossBasis) {
        this.clientGrossBasis = clientGrossBasis;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public void setCounterpartyChargingRole(String counterpartyChargingRole) {
        this.counterpartyChargingRole = counterpartyChargingRole;
    }

    public void setCounterpartyReportingRole(String counterpartyReportingRole) {
        this.counterpartyReportingRole = counterpartyReportingRole;
    }

    public void setFirmChargingRole(String firmChargingRole) {
        this.firmChargingRole = firmChargingRole;
    }

    public void setDealingCapacity(String dealingCapacity) {
        this.dealingCapacity = dealingCapacity;
    }

    public void setInitialPrice(float initialPrice) {
        this.initialPrice = initialPrice;
    }

    public void setInitialPriceType(String initialPriceType) {
        this.initialPriceType = initialPriceType;
    }

    public void setIsMargin(String isMargin) {
        this.isMargin = isMargin;
    }

    public void setDealtPrice(float dealtPrice) {
        this.dealtPrice = dealtPrice;
    }

    public void setDealtPriceType(String dealtPriceType) {
        this.dealtPriceType = dealtPriceType;
    }

    public void setAverageMarketGrossPrice(float averageMarketGrossPrice) {
        this.averageMarketGrossPrice = averageMarketGrossPrice;
    }

    public void setAverageMarketNetLocalPrice(float averageMarketNetLocalPrice) {
        this.averageMarketNetLocalPrice = averageMarketNetLocalPrice;
    }

    public void setAverageMarketPriceCurrencyId(String averageMarketPriceCurrencyId) {
        this.averageMarketPriceCurrencyId = averageMarketPriceCurrencyId;
    }

    public void setDealtToSettlementRate(float dealtToSettlementRate) {
        this.dealtToSettlementRate = dealtToSettlementRate;
    }

    public void setDealtToSettlementSense(String dealtToSettlementSense) {
        this.dealtToSettlementSense = dealtToSettlementSense;
    }

    public void setDeliveryMechanism(String deliveryMechanism) {
        this.deliveryMechanism = deliveryMechanism;
    }

    public void setEnteredDatetime(String enteredDatetime) {
        this.enteredDatetime = enteredDatetime;
    }

    public void setFacilitation(float facilitation) {
        this.facilitation = facilitation;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public void setGrossConsideration(float grossConsideration) {
        this.grossConsideration = grossConsideration;
    }

    public void setGrossPrice(float grossPrice) {
        this.grossPrice = grossPrice;
    }

    public void setInstrumentToDealtRate(float instrumentToDealtRate) {
        this.instrumentToDealtRate = instrumentToDealtRate;
    }

    public void setInstrumentToDealtSense(String instrumentToDealtSense) {
        this.instrumentToDealtSense = instrumentToDealtSense;
    }

    public void setMarketCharges(float marketCharges) {
        this.marketCharges = marketCharges;
    }

    public void setMarkup(float markup) {
        this.markup = markup;
    }

    public void setNetConsideration(float netConsideration) {
        this.netConsideration = netConsideration;
    }

    public void setNetNetConsideration(float netNetConsideration) {
        this.netNetConsideration = netNetConsideration;
    }

    public void setNetNetPrice(float netNetPrice) {
        this.netNetPrice = netNetPrice;
    }

    public void setNetPrice(float netPrice) {
        this.netPrice = netPrice;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setReportScenario(String reportScenario) {
        this.reportScenario = reportScenario;
    }

    public void setReportScenarioQualifier(String reportScenarioQualifier) {
        this.reportScenarioQualifier = reportScenarioQualifier;
    }

    public void setSalesCredit(float salesCredit) {
        this.salesCredit = salesCredit;
    }

    public void setSettlementConsideration(float settlementConsideration) {
        this.settlementConsideration = settlementConsideration;
    }

    public void setSettlementDays(int settlementDays) {
        this.settlementDays = settlementDays;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTradedFlatOfAccrued(String tradedFlatOfAccrued) {
        this.tradedFlatOfAccrued = tradedFlatOfAccrued;
    }

    public void setTradeDatetime(String tradeDatetime) {
        this.tradeDatetime = tradeDatetime;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public void setExchangeSpecific(String exchangeSpecific) {
        this.exchangeSpecific = exchangeSpecific;
    }

    public void setExchangeSpecific2(String exchangeSpecific2) {
        this.exchangeSpecific2 = exchangeSpecific2;
    }

    public void setExchangeSpecific4(String exchangeSpecific4) {
        this.exchangeSpecific4 = exchangeSpecific4;
    }

    public void setExchangeSpecific5(String exchangeSpecific5) {
        this.exchangeSpecific5 = exchangeSpecific5;
    }

    public void setMinLegalShortSellPrice(float minLegalShortSellPrice) {
        this.minLegalShortSellPrice = minLegalShortSellPrice;
    }

    public void setBidPrice(float bidPrice) {
        this.bidPrice = bidPrice;
    }

    public void setOfferPrice(float offerPrice) {
        this.offerPrice = offerPrice;
    }

    public void setRootTradeVersion(int rootTradeVersion) {
        this.rootTradeVersion = rootTradeVersion;
    }

    public void setIsFlipTrade(String isFlipTrade) {
        this.isFlipTrade = isFlipTrade;
    }

    public void setSettlementToFlipRate(float settlementToFlipRate) {
        this.settlementToFlipRate = settlementToFlipRate;
    }

    public void setSettlementToFlipSense(String settlementToFlipSense) {
        this.settlementToFlipSense = settlementToFlipSense;
    }

    public void setEstimatedCommission(float estimatedCommission) {
        this.estimatedCommission = estimatedCommission;
    }

    public void setIsSwingTrade(String isSwingTrade) {
        this.isSwingTrade = isSwingTrade;
    }

    public void setTradeSource(String tradeSource) {
        this.tradeSource = tradeSource;
    }

    public void setCptyTraderId(String cptyTraderId) {
        this.cptyTraderId = cptyTraderId;
    }

    public void setAmendedBy(String amendedBy) {
        this.amendedBy = amendedBy;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCrossingOrderId(String crossingOrderId) {
        this.crossingOrderId = crossingOrderId;
    }

    public void setShortSell(String shortSell) {
        this.shortSell = shortSell;
    }

    public void setBadShortSell(String badShortSell) {
        this.badShortSell = badShortSell;
    }

    public void setContributorId(String contributorId) {
        this.contributorId = contributorId;
    }

    public void setReportNotes(String reportNotes) {
        this.reportNotes = reportNotes;
    }

    public void setReportPriceType(String reportPriceType) {
        this.reportPriceType = reportPriceType;
    }

    public void setReportFlags(String reportFlags) {
        this.reportFlags = reportFlags;
    }

    public void setCommissionArg(float commissionArg) {
        this.commissionArg = commissionArg;
    }

    public void setCommissionMethod(String commissionMethod) {
        this.commissionMethod = commissionMethod;
    }

    public void setMarkupArg(float markupArg) {
        this.markupArg = markupArg;
    }

    public void setMarkupMethod(String markupMethod) {
        this.markupMethod = markupMethod;
    }

    public void setSalesCreditArg(float salesCreditArg) {
        this.salesCreditArg = salesCreditArg;
    }

    public void setSalesCreditMethod(String salesCreditMethod) {
        this.salesCreditMethod = salesCreditMethod;
    }

    public void setBrokerageArg(float brokerageArg) {
        this.brokerageArg = brokerageArg;
    }

    public void setBrokerageMethod(String brokerageMethod) {
        this.brokerageMethod = brokerageMethod;
    }

    public void setOrderAvgPrice(String orderAvgPrice) {
        this.orderAvgPrice = orderAvgPrice;
    }

    public void setClearingFlags(String clearingFlags) {
        this.clearingFlags = clearingFlags;
    }

    public void setActFirmRole(String actFirmRole) {
        this.actFirmRole = actFirmRole;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public void setClearingCode(String clearingCode) {
        this.clearingCode = clearingCode;
    }

    public void setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }

    public void setForeignSettlementCurrency(String foreignSettlementCurrency) {
        this.foreignSettlementCurrency = foreignSettlementCurrency;
    }

    public void setSpecialCreditArg(float specialCreditArg) {
        this.specialCreditArg = specialCreditArg;
    }

    public void setSpecialCreditMethod(String specialCreditMethod) {
        this.specialCreditMethod = specialCreditMethod;
    }

    public void setBrokerId1(float brokerId1) {
        this.brokerId1 = brokerId1;
    }

    public void setBrokerBid1(float brokerBid1) {
        this.brokerBid1 = brokerBid1;
    }

    public void setBrokerAsk1(float brokerAsk1) {
        this.brokerAsk1 = brokerAsk1;
    }

    public void setBrokerId2(float brokerId2) {
        this.brokerId2 = brokerId2;
    }

    public void setBrokerBid2(float brokerBid2) {
        this.brokerBid2 = brokerBid2;
    }

    public void setBrokerAsk2(float brokerAsk2) {
        this.brokerAsk2 = brokerAsk2;
    }

    public void setBrokerId3(float brokerId3) {
        this.brokerId3 = brokerId3;
    }

    public void setBrokerBid3(float brokerBid3) {
        this.brokerBid3 = brokerBid3;
    }

    public void setBrokerAsk3(float brokerAsk3) {
        this.brokerAsk3 = brokerAsk3;
    }

    public void setLocateInfo(String locateInfo) {
        this.locateInfo = locateInfo;
    }

    public void setContributorRef(String contributorRef) {
        this.contributorRef = contributorRef;
    }

    public void setIsStoppedFill(String isStoppedFill) {
        this.isStoppedFill = isStoppedFill;
    }

    public void setAutoHouseSplit(String autoHouseSplit) {
        this.autoHouseSplit = autoHouseSplit;
    }

    public void setAutoHouseDesired(int autoHouseDesired) {
        this.autoHouseDesired = autoHouseDesired;
    }

    public void setAutoHouseAllowed(float autoHouseAllowed) {
        this.autoHouseAllowed = autoHouseAllowed;
    }

    public void setAutoHouseActual(float autoHouseActual) {
        this.autoHouseActual = autoHouseActual;
    }

    public void setExecutionVenue(String executionVenue) {
        this.executionVenue = executionVenue;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public void setFillCommissionArg(float fillCommissionArg) {
        this.fillCommissionArg = fillCommissionArg;
    }

    public void setFillCommissionMethod(String fillCommissionMethod) {
        this.fillCommissionMethod = fillCommissionMethod;
    }

    public void setLiquidityIndicator(int liquidityIndicator) {
        this.liquidityIndicator = liquidityIndicator;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setTradeThroughExemptionReason(String tradeThroughExemptionReason) {
        this.tradeThroughExemptionReason = tradeThroughExemptionReason;
    }

    public void setBookingCapacity(String bookingCapacity) {
        this.bookingCapacity = bookingCapacity;
    }

    public void setOriginatingCounterparty(String originatingCounterparty) {
        this.originatingCounterparty = originatingCounterparty;
    }

    public void setShortSellExemptionReason(String shortSellExemptionReason) {
        this.shortSellExemptionReason = shortSellExemptionReason;
    }

    public void setSedlCode(String sedlCode) {
        this.sedlCode = sedlCode;
    }

    public void setIsInCode(String isInCode) {
        this.isInCode = isInCode;
    }

    public void setLastMkt(String lastMkt) {
        this.lastMkt = lastMkt;
    }

    public void setTradeThroughSweepId(String tradeThroughSweepId) {
        this.tradeThroughSweepId = tradeThroughSweepId;
    }

    public void setSenderSubId(String senderSubId) {
        this.senderSubId = senderSubId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public void setCustAllocationCounterpartyId(String custAllocationCounterpartyId) {
        this.custAllocationCounterpartyId = custAllocationCounterpartyId;
    }

    public void setLinkedBrokerCptyId(String linkedBrokerCptyId) {
        this.linkedBrokerCptyId = linkedBrokerCptyId;
    }

    public void setMinimumTradePrice(float minimumTradePrice) {
        this.minimumTradePrice = minimumTradePrice;
    }

    public void setMaximumTradePrice(float maximumTradePrice) {
        this.maximumTradePrice = maximumTradePrice;
    }

    public void setRootOrderId(String rootOrderId) {
        this.rootOrderId = rootOrderId;
    }

    public void setOrderVersion(String orderVersion) {
        this.orderVersion = orderVersion;
    }

    public void setGlobalOrderId(String globalOrderId) {
        this.globalOrderId = globalOrderId;
    }

    public void setRoutedOrderCode(String routedOrderCode) {
        this.routedOrderCode = routedOrderCode;
    }

    public void setCustContraBranchSea(String custContraBranchSea) {
        this.custContraBranchSea = custContraBranchSea;
    }

    public void setOrderFillNotificationId(String orderFillNotificationId) {
        this.orderFillNotificationId = orderFillNotificationId;
    }

    public void setPriceStrategy(String priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public void setTradeTickExemptionReason(String tradeTickExemptionReason) {
        this.tradeTickExemptionReason = tradeTickExemptionReason;
    }

    public void setTradeAlExemptionReason(String tradeAlExemptionReason) {
        this.tradeAlExemptionReason = tradeAlExemptionReason;
    }

    public void setDisplayExemptionOrderIds(String displayExemptionOrderIds) {
        this.displayExemptionOrderIds = displayExemptionOrderIds;
    }

    public void setPostTradeShortSellPosition(String postTradeShortSellPosition) {
        this.postTradeShortSellPosition = postTradeShortSellPosition;
    }

    public void setNormLiquidityIndicator(String normLiquidityIndicator) {
        this.normLiquidityIndicator = normLiquidityIndicator;
    }

    public void setQuantityFilled(String quantityFilled) {
        this.quantityFilled = quantityFilled;
    }

    public void setParentQuantityFilled(String parentQuantityFilled) {
        this.parentQuantityFilled = parentQuantityFilled;
    }

    public void setOatsOrderVersion(String oatsOrderVersion) {
        this.oatsOrderVersion = oatsOrderVersion;
    }

    public void setOrderBookingType(String orderBookingType) {
        this.orderBookingType = orderBookingType;
    }

    public void setHedgedOrderId(String hedgedOrderId) {
        this.hedgedOrderId = hedgedOrderId;
    }

    public void setOrderLegId(String orderLegId) {
        this.orderLegId = orderLegId;
    }

    public void setSiteContractingEntity(String siteContractingEntity) {
        this.siteContractingEntity = siteContractingEntity;
    }

}
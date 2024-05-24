package payroll;

import java.util.Date;

public class HubTrade {
    private int tradeId;         // DB field TRADE_ID (Primary Key)
    private Date timestamp;      // DB field TIMESTAMP
    private String recordSource; // DB field RECORD_SOURCE

    // Getters and Setters
    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getRecordSource() {
        return recordSource;
    }

    public void setRecordSource(String recordSource) {
        this.recordSource = recordSource;
    }
}

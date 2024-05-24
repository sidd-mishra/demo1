package payroll;

import java.util.Date;

public class HubCounterparty {
    private String counterpartyCode; // DB field COUNTERPARTY_CODE (Primary Key)
    private Date timestamp;          // DB field TIMESTAMP
    private String recordSource;     // DB field RECORD_SOURCE

    // Getters and Setters
    public String getCounterpartyCode() {
        return counterpartyCode;
    }

    public void setCounterpartyCode(String counterpartyCode) {
        this.counterpartyCode = counterpartyCode;
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

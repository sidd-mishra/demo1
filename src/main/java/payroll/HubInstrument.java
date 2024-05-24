package payroll;

import java.util.Date;

public class HubInstrument {
    private int instrumentId;    // DB field INSTRUMENT_ID (Primary Key)
    private Date timestamp;      // DB field TIMESTAMP
    private String recordSource; // DB field RECORD_SOURCE

    // Getters and Setters
    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
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


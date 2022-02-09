package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class PrizingInfo {
    private boolean enablePrizing;
    private Object markdown;
    private Object payoutType;
    private Object payoutTotal;
    private List<Prizing> prizing;

    @JsonProperty("enablePrizing")
    public boolean getEnablePrizing() { return enablePrizing; }
    @JsonProperty("enablePrizing")
    public void setEnablePrizing(boolean value) { this.enablePrizing = value; }

    @JsonProperty("markdown")
    public Object getMarkdown() { return markdown; }
    @JsonProperty("markdown")
    public void setMarkdown(Object value) { this.markdown = value; }

    @JsonProperty("payoutType")
    public Object getPayoutType() { return payoutType; }
    @JsonProperty("payoutType")
    public void setPayoutType(Object value) { this.payoutType = value; }

    @JsonProperty("payoutTotal")
    public Object getPayoutTotal() { return payoutTotal; }
    @JsonProperty("payoutTotal")
    public void setPayoutTotal(Object value) { this.payoutTotal = value; }

    @JsonProperty("prizing")
    public List<Prizing> getPrizing() { return prizing; }
    @JsonProperty("prizing")
    public void setPrizing(List<Prizing> value) { this.prizing = value; }
}

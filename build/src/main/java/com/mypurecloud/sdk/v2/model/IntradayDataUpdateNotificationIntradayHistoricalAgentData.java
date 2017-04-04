package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotificationIntradayHistoricalAgentData
 */

public class IntradayDataUpdateNotificationIntradayHistoricalAgentData  implements Serializable {
  
  private BigDecimal onQueueTimeSeconds = null;
  private BigDecimal interactingTimeSeconds = null;

  
  /**
   **/
  public IntradayDataUpdateNotificationIntradayHistoricalAgentData onQueueTimeSeconds(BigDecimal onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onQueueTimeSeconds")
  public BigDecimal getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(BigDecimal onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayHistoricalAgentData interactingTimeSeconds(BigDecimal interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interactingTimeSeconds")
  public BigDecimal getInteractingTimeSeconds() {
    return interactingTimeSeconds;
  }
  public void setInteractingTimeSeconds(BigDecimal interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotificationIntradayHistoricalAgentData intradayDataUpdateNotificationIntradayHistoricalAgentData = (IntradayDataUpdateNotificationIntradayHistoricalAgentData) o;
    return Objects.equals(this.onQueueTimeSeconds, intradayDataUpdateNotificationIntradayHistoricalAgentData.onQueueTimeSeconds) &&
        Objects.equals(this.interactingTimeSeconds, intradayDataUpdateNotificationIntradayHistoricalAgentData.interactingTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds, interactingTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationIntradayHistoricalAgentData {\n");
    
    sb.append("    onQueueTimeSeconds: ").append(toIndentedString(onQueueTimeSeconds)).append("\n");
    sb.append("    interactingTimeSeconds: ").append(toIndentedString(interactingTimeSeconds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


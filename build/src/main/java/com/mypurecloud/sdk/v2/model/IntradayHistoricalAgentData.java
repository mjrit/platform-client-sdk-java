package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayHistoricalAgentData
 */

public class IntradayHistoricalAgentData  implements Serializable {
  
  private Double onQueueTimeSeconds = null;
  private Double interactingTimeSeconds = null;

  
  /**
   * The total on-queue time in seconds for all agents in this group
   **/
  public IntradayHistoricalAgentData onQueueTimeSeconds(Double onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total on-queue time in seconds for all agents in this group")
  @JsonProperty("onQueueTimeSeconds")
  public Double getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(Double onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }

  
  /**
   * The total time spent interacting in seconds for all agents in this group
   **/
  public IntradayHistoricalAgentData interactingTimeSeconds(Double interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total time spent interacting in seconds for all agents in this group")
  @JsonProperty("interactingTimeSeconds")
  public Double getInteractingTimeSeconds() {
    return interactingTimeSeconds;
  }
  public void setInteractingTimeSeconds(Double interactingTimeSeconds) {
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
    IntradayHistoricalAgentData intradayHistoricalAgentData = (IntradayHistoricalAgentData) o;
    return Objects.equals(this.onQueueTimeSeconds, intradayHistoricalAgentData.onQueueTimeSeconds) &&
        Objects.equals(this.interactingTimeSeconds, intradayHistoricalAgentData.interactingTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds, interactingTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayHistoricalAgentData {\n");
    
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


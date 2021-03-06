package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotificationIntradayScheduleData
 */

public class IntradayDataUpdateNotificationIntradayScheduleData  implements Serializable {
  
  private Integer onQueueTimeSeconds = null;
  private Integer scheduledTimeSeconds = null;

  
  /**
   **/
  public IntradayDataUpdateNotificationIntradayScheduleData onQueueTimeSeconds(Integer onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onQueueTimeSeconds")
  public Integer getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(Integer onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }

  
  /**
   **/
  public IntradayDataUpdateNotificationIntradayScheduleData scheduledTimeSeconds(Integer scheduledTimeSeconds) {
    this.scheduledTimeSeconds = scheduledTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledTimeSeconds")
  public Integer getScheduledTimeSeconds() {
    return scheduledTimeSeconds;
  }
  public void setScheduledTimeSeconds(Integer scheduledTimeSeconds) {
    this.scheduledTimeSeconds = scheduledTimeSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotificationIntradayScheduleData intradayDataUpdateNotificationIntradayScheduleData = (IntradayDataUpdateNotificationIntradayScheduleData) o;
    return Objects.equals(this.onQueueTimeSeconds, intradayDataUpdateNotificationIntradayScheduleData.onQueueTimeSeconds) &&
        Objects.equals(this.scheduledTimeSeconds, intradayDataUpdateNotificationIntradayScheduleData.scheduledTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds, scheduledTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationIntradayScheduleData {\n");
    
    sb.append("    onQueueTimeSeconds: ").append(toIndentedString(onQueueTimeSeconds)).append("\n");
    sb.append("    scheduledTimeSeconds: ").append(toIndentedString(scheduledTimeSeconds)).append("\n");
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


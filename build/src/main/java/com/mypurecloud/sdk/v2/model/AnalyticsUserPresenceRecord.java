package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsUserPresenceRecord
 */

public class AnalyticsUserPresenceRecord  implements Serializable {
  
  private Date startTime = null;
  private Date endTime = null;

  /**
   * The user's system presence
   */
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("AVAILABLE"),
    AWAY("AWAY"),
    BUSY("BUSY"),
    OFFLINE("OFFLINE"),
    IDLE("IDLE"),
    ON_QUEUE("ON_QUEUE"),
    MEAL("MEAL"),
    TRAINING("TRAINING"),
    MEETING("MEETING"),
    BREAK("BREAK");

    private String value;

    SystemPresenceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemPresenceEnum fromString(String key) {
      if (key == null) return null;

      for (SystemPresenceEnum value : SystemPresenceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemPresenceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemPresenceEnum systemPresence = null;
  private String organizationPresenceId = null;
  private Long durationMilliseconds = null;

  
  /**
   * The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsUserPresenceRecord startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  /**
   * The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsUserPresenceRecord endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  /**
   * The user's system presence
   **/
  public AnalyticsUserPresenceRecord systemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's system presence")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
  }


  /**
   * The identifier for the user's organization presence
   **/
  public AnalyticsUserPresenceRecord organizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier for the user's organization presence")
  @JsonProperty("organizationPresenceId")
  public String getOrganizationPresenceId() {
    return organizationPresenceId;
  }
  public void setOrganizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
  }


  /**
   * The duration of the status (in milliseconds)
   **/
  public AnalyticsUserPresenceRecord durationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration of the status (in milliseconds)")
  @JsonProperty("durationMilliseconds")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }
  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsUserPresenceRecord analyticsUserPresenceRecord = (AnalyticsUserPresenceRecord) o;
    return Objects.equals(this.startTime, analyticsUserPresenceRecord.startTime) &&
        Objects.equals(this.endTime, analyticsUserPresenceRecord.endTime) &&
        Objects.equals(this.systemPresence, analyticsUserPresenceRecord.systemPresence) &&
        Objects.equals(this.organizationPresenceId, analyticsUserPresenceRecord.organizationPresenceId) &&
        Objects.equals(this.durationMilliseconds, analyticsUserPresenceRecord.durationMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, systemPresence, organizationPresenceId, durationMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsUserPresenceRecord {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    organizationPresenceId: ").append(toIndentedString(organizationPresenceId)).append("\n");
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
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

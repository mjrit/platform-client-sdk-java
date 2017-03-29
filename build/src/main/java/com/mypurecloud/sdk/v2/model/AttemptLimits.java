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
 * AttemptLimits
 */

public class AttemptLimits  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxAttemptsPerContact = null;
  private Integer maxAttemptsPerNumber = null;
  private String timeZoneId = null;

  /**
   * After how long the number of attempts will be set back to 0
   */
  public enum ResetPeriodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEVER("NEVER"),
    TODAY("TODAY");

    private String value;

    ResetPeriodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResetPeriodEnum fromString(String key) {
      if (key == null) return null;

      for (ResetPeriodEnum value : ResetPeriodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResetPeriodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResetPeriodEnum resetPeriod = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public AttemptLimits name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public AttemptLimits version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   **/
  public AttemptLimits maxAttemptsPerContact(Integer maxAttemptsPerContact) {
    this.maxAttemptsPerContact = maxAttemptsPerContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxAttemptsPerContact")
  public Integer getMaxAttemptsPerContact() {
    return maxAttemptsPerContact;
  }
  public void setMaxAttemptsPerContact(Integer maxAttemptsPerContact) {
    this.maxAttemptsPerContact = maxAttemptsPerContact;
  }


  /**
   **/
  public AttemptLimits maxAttemptsPerNumber(Integer maxAttemptsPerNumber) {
    this.maxAttemptsPerNumber = maxAttemptsPerNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxAttemptsPerNumber")
  public Integer getMaxAttemptsPerNumber() {
    return maxAttemptsPerNumber;
  }
  public void setMaxAttemptsPerNumber(Integer maxAttemptsPerNumber) {
    this.maxAttemptsPerNumber = maxAttemptsPerNumber;
  }


  /**
   * The timezone is necessary to define when \"today\" starts and ends
   **/
  public AttemptLimits timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timezone is necessary to define when \"today\" starts and ends")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  /**
   * After how long the number of attempts will be set back to 0
   **/
  public AttemptLimits resetPeriod(ResetPeriodEnum resetPeriod) {
    this.resetPeriod = resetPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "After how long the number of attempts will be set back to 0")
  @JsonProperty("resetPeriod")
  public ResetPeriodEnum getResetPeriod() {
    return resetPeriod;
  }
  public void setResetPeriod(ResetPeriodEnum resetPeriod) {
    this.resetPeriod = resetPeriod;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttemptLimits attemptLimits = (AttemptLimits) o;
    return Objects.equals(this.id, attemptLimits.id) &&
        Objects.equals(this.name, attemptLimits.name) &&
        Objects.equals(this.dateCreated, attemptLimits.dateCreated) &&
        Objects.equals(this.dateModified, attemptLimits.dateModified) &&
        Objects.equals(this.version, attemptLimits.version) &&
        Objects.equals(this.maxAttemptsPerContact, attemptLimits.maxAttemptsPerContact) &&
        Objects.equals(this.maxAttemptsPerNumber, attemptLimits.maxAttemptsPerNumber) &&
        Objects.equals(this.timeZoneId, attemptLimits.timeZoneId) &&
        Objects.equals(this.resetPeriod, attemptLimits.resetPeriod) &&
        Objects.equals(this.selfUri, attemptLimits.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxAttemptsPerContact, maxAttemptsPerNumber, timeZoneId, resetPeriod, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptLimits {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxAttemptsPerContact: ").append(toIndentedString(maxAttemptsPerContact)).append("\n");
    sb.append("    maxAttemptsPerNumber: ").append(toIndentedString(maxAttemptsPerNumber)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    resetPeriod: ").append(toIndentedString(resetPeriod)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

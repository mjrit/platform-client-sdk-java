package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutboundSettings
 */

public class OutboundSettings  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxCallsPerAgent = null;
  private Double maxLineUtilization = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public OutboundSettings name(String name) {
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
  public OutboundSettings version(Integer version) {
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
   * The maximum number of calls that can be placed per agent on any campaign
   **/
  public OutboundSettings maxCallsPerAgent(Integer maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of calls that can be placed per agent on any campaign")
  @JsonProperty("maxCallsPerAgent")
  public Integer getMaxCallsPerAgent() {
    return maxCallsPerAgent;
  }
  public void setMaxCallsPerAgent(Integer maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
  }

  
  /**
   * The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0]
   **/
  public OutboundSettings maxLineUtilization(Double maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0]")
  @JsonProperty("maxLineUtilization")
  public Double getMaxLineUtilization() {
    return maxLineUtilization;
  }
  public void setMaxLineUtilization(Double maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
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
    OutboundSettings outboundSettings = (OutboundSettings) o;
    return Objects.equals(this.id, outboundSettings.id) &&
        Objects.equals(this.name, outboundSettings.name) &&
        Objects.equals(this.dateCreated, outboundSettings.dateCreated) &&
        Objects.equals(this.dateModified, outboundSettings.dateModified) &&
        Objects.equals(this.version, outboundSettings.version) &&
        Objects.equals(this.maxCallsPerAgent, outboundSettings.maxCallsPerAgent) &&
        Objects.equals(this.maxLineUtilization, outboundSettings.maxLineUtilization) &&
        Objects.equals(this.selfUri, outboundSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxCallsPerAgent, maxLineUtilization, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    maxLineUtilization: ").append(toIndentedString(maxLineUtilization)).append("\n");
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


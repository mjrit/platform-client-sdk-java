package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueMemberNotification
 */

public class QueueMemberNotification  implements Serializable {
  
  private String id = null;
  private String queueId = null;
  private Boolean joined = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueMemberNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public QueueMemberNotification queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   **/
  public QueueMemberNotification joined(Boolean joined) {
    this.joined = joined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("joined")
  public Boolean getJoined() {
    return joined;
  }
  public void setJoined(Boolean joined) {
    this.joined = joined;
  }

  
  /**
   **/
  public QueueMemberNotification additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMemberNotification queueMemberNotification = (QueueMemberNotification) o;
    return Objects.equals(this.id, queueMemberNotification.id) &&
        Objects.equals(this.queueId, queueMemberNotification.queueId) &&
        Objects.equals(this.joined, queueMemberNotification.joined) &&
        Objects.equals(this.additionalProperties, queueMemberNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, queueId, joined, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMemberNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


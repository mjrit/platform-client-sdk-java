package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallbackConversationNotificationErrorInfoDetails;
import com.mypurecloud.sdk.v2.model.ScreenShareConversationNotificationErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ScreenShareConversationNotificationErrorInfo
 */

public class ScreenShareConversationNotificationErrorInfo  implements Serializable {
  
  private Integer status = null;
  private String code = null;
  private String entityId = null;
  private String entityName = null;
  private String message = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private List<CallbackConversationNotificationErrorInfoDetails> details = new ArrayList<CallbackConversationNotificationErrorInfoDetails>();
  private List<ScreenShareConversationNotificationErrorBody> errors = new ArrayList<ScreenShareConversationNotificationErrorBody>();

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo messageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageWithParams")
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo details(List<CallbackConversationNotificationErrorInfoDetails> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<CallbackConversationNotificationErrorInfoDetails> getDetails() {
    return details;
  }
  public void setDetails(List<CallbackConversationNotificationErrorInfoDetails> details) {
    this.details = details;
  }

  
  /**
   **/
  public ScreenShareConversationNotificationErrorInfo errors(List<ScreenShareConversationNotificationErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ScreenShareConversationNotificationErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ScreenShareConversationNotificationErrorBody> errors) {
    this.errors = errors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenShareConversationNotificationErrorInfo screenShareConversationNotificationErrorInfo = (ScreenShareConversationNotificationErrorInfo) o;
    return Objects.equals(this.status, screenShareConversationNotificationErrorInfo.status) &&
        Objects.equals(this.code, screenShareConversationNotificationErrorInfo.code) &&
        Objects.equals(this.entityId, screenShareConversationNotificationErrorInfo.entityId) &&
        Objects.equals(this.entityName, screenShareConversationNotificationErrorInfo.entityName) &&
        Objects.equals(this.message, screenShareConversationNotificationErrorInfo.message) &&
        Objects.equals(this.messageWithParams, screenShareConversationNotificationErrorInfo.messageWithParams) &&
        Objects.equals(this.messageParams, screenShareConversationNotificationErrorInfo.messageParams) &&
        Objects.equals(this.contextId, screenShareConversationNotificationErrorInfo.contextId) &&
        Objects.equals(this.details, screenShareConversationNotificationErrorInfo.details) &&
        Objects.equals(this.errors, screenShareConversationNotificationErrorInfo.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, entityId, entityName, message, messageWithParams, messageParams, contextId, details, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenShareConversationNotificationErrorInfo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


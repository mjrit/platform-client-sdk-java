package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RoutingData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CreateCallbackCommand
 */

public class CreateCallbackCommand  implements Serializable {
  
  private String scriptId = null;
  private String queueId = null;
  private RoutingData routingData = null;
  private String callbackUserName = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private Date callbackScheduledTime = null;
  private String countryCode = null;
  private Map<String, String> data = null;

  
  /**
   * The identifier of the script to be used for the callback
   **/
  public CreateCallbackCommand scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the script to be used for the callback")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   * The identifier of the queue to be used for the callback. Either queueId or routingData is required.
   **/
  public CreateCallbackCommand queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the queue to be used for the callback. Either queueId or routingData is required.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The routing data to be used for the callback. Either queueId or routingData is required.
   **/
  public CreateCallbackCommand routingData(RoutingData routingData) {
    this.routingData = routingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The routing data to be used for the callback. Either queueId or routingData is required.")
  @JsonProperty("routingData")
  public RoutingData getRoutingData() {
    return routingData;
  }
  public void setRoutingData(RoutingData routingData) {
    this.routingData = routingData;
  }

  
  /**
   * The name of the party to be called back.
   **/
  public CreateCallbackCommand callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the party to be called back.")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  
  /**
   * A list of phone numbers for the callback.
   **/
  public CreateCallbackCommand callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of phone numbers for the callback.")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  
  /**
   * The scheduled date-time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CreateCallbackCommand callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "2015-01-02T16:59:59.000Z", value = "The scheduled date-time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  
  /**
   * The country code to be associated with the callback numbers.
   **/
  public CreateCallbackCommand countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The country code to be associated with the callback numbers.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * A map of key-value pairs containing additional data that can be associated to the callback. These values will appear in the attributes property on the conversation participant. Example: { \"notes\": \"ready to close the deal!\", \"customerPreferredName\": \"Doc\" }
   **/
  public CreateCallbackCommand data(Map<String, String> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of key-value pairs containing additional data that can be associated to the callback. These values will appear in the attributes property on the conversation participant. Example: { \"notes\": \"ready to close the deal!\", \"customerPreferredName\": \"Doc\" }")
  @JsonProperty("data")
  public Map<String, String> getData() {
    return data;
  }
  public void setData(Map<String, String> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallbackCommand createCallbackCommand = (CreateCallbackCommand) o;
    return Objects.equals(this.scriptId, createCallbackCommand.scriptId) &&
        Objects.equals(this.queueId, createCallbackCommand.queueId) &&
        Objects.equals(this.routingData, createCallbackCommand.routingData) &&
        Objects.equals(this.callbackUserName, createCallbackCommand.callbackUserName) &&
        Objects.equals(this.callbackNumbers, createCallbackCommand.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, createCallbackCommand.callbackScheduledTime) &&
        Objects.equals(this.countryCode, createCallbackCommand.countryCode) &&
        Objects.equals(this.data, createCallbackCommand.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId, queueId, routingData, callbackUserName, callbackNumbers, callbackScheduledTime, countryCode, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallbackCommand {\n");
    
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    routingData: ").append(toIndentedString(routingData)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


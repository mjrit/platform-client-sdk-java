package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * RuleSetNotificationAction
 */

public class RuleSetNotificationAction  implements Serializable {
  
  private String type = null;
  private String actionTypeName = null;
  private String updateOption = null;
  private Map<String, String> properties = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public RuleSetNotificationAction type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public RuleSetNotificationAction actionTypeName(String actionTypeName) {
    this.actionTypeName = actionTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionTypeName")
  public String getActionTypeName() {
    return actionTypeName;
  }
  public void setActionTypeName(String actionTypeName) {
    this.actionTypeName = actionTypeName;
  }

  
  /**
   **/
  public RuleSetNotificationAction updateOption(String updateOption) {
    this.updateOption = updateOption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updateOption")
  public String getUpdateOption() {
    return updateOption;
  }
  public void setUpdateOption(String updateOption) {
    this.updateOption = updateOption;
  }

  
  /**
   **/
  public RuleSetNotificationAction properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  public RuleSetNotificationAction additionalProperties(Object additionalProperties) {
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
    RuleSetNotificationAction ruleSetNotificationAction = (RuleSetNotificationAction) o;
    return Objects.equals(this.type, ruleSetNotificationAction.type) &&
        Objects.equals(this.actionTypeName, ruleSetNotificationAction.actionTypeName) &&
        Objects.equals(this.updateOption, ruleSetNotificationAction.updateOption) &&
        Objects.equals(this.properties, ruleSetNotificationAction.properties) &&
        Objects.equals(this.additionalProperties, ruleSetNotificationAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, actionTypeName, updateOption, properties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetNotificationAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionTypeName: ").append(toIndentedString(actionTypeName)).append("\n");
    sb.append("    updateOption: ").append(toIndentedString(updateOption)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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


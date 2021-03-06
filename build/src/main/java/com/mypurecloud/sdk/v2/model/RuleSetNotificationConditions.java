package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RuleSetNotificationConditions
 */

public class RuleSetNotificationConditions  implements Serializable {
  
  private String type = null;
  private Boolean inverted = null;
  private String attributeName = null;
  private String value = null;

  /**
   * Gets or Sets valueType
   */
  public enum ValueTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("STRING"),
    NUMERIC("NUMERIC"),
    DATETIME("DATETIME"),
    PERIOD("PERIOD");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ValueTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ValueTypeEnum value : ValueTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ValueTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ValueTypeEnum valueType = null;

  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("EQUALS"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
    CONTAINS("CONTAINS"),
    BEGINS_WITH("BEGINS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    BEFORE("BEFORE"),
    AFTER("AFTER");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private List<String> codes = new ArrayList<String>();

  /**
   * Gets or Sets propertyType
   */
  public enum PropertyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LAST_ATTEMPT_BY_COLUMN("LAST_ATTEMPT_BY_COLUMN"),
    LAST_ATTEMPT_OVERALL("LAST_ATTEMPT_OVERALL"),
    LAST_RESULT_BY_COLUMN("LAST_RESULT_BY_COLUMN"),
    LAST_RESULT_OVERALL("LAST_RESULT_OVERALL");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PropertyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PropertyTypeEnum value : PropertyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PropertyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PropertyTypeEnum propertyType = null;
  private String property = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public RuleSetNotificationConditions type(String type) {
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
  public RuleSetNotificationConditions inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }

  
  /**
   **/
  public RuleSetNotificationConditions attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributeName")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  
  /**
   **/
  public RuleSetNotificationConditions value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  public RuleSetNotificationConditions valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valueType")
  public ValueTypeEnum getValueType() {
    return valueType;
  }
  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }

  
  /**
   **/
  public RuleSetNotificationConditions operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   **/
  public RuleSetNotificationConditions codes(List<String> codes) {
    this.codes = codes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codes")
  public List<String> getCodes() {
    return codes;
  }
  public void setCodes(List<String> codes) {
    this.codes = codes;
  }

  
  /**
   **/
  public RuleSetNotificationConditions propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("propertyType")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  
  /**
   **/
  public RuleSetNotificationConditions property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  
  /**
   **/
  public RuleSetNotificationConditions additionalProperties(Object additionalProperties) {
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
    RuleSetNotificationConditions ruleSetNotificationConditions = (RuleSetNotificationConditions) o;
    return Objects.equals(this.type, ruleSetNotificationConditions.type) &&
        Objects.equals(this.inverted, ruleSetNotificationConditions.inverted) &&
        Objects.equals(this.attributeName, ruleSetNotificationConditions.attributeName) &&
        Objects.equals(this.value, ruleSetNotificationConditions.value) &&
        Objects.equals(this.valueType, ruleSetNotificationConditions.valueType) &&
        Objects.equals(this.operator, ruleSetNotificationConditions.operator) &&
        Objects.equals(this.codes, ruleSetNotificationConditions.codes) &&
        Objects.equals(this.propertyType, ruleSetNotificationConditions.propertyType) &&
        Objects.equals(this.property, ruleSetNotificationConditions.property) &&
        Objects.equals(this.additionalProperties, ruleSetNotificationConditions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inverted, attributeName, value, valueType, operator, codes, propertyType, property, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetNotificationConditions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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


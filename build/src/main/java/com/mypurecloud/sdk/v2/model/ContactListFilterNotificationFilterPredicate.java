package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactListFilterNotificationRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactListFilterNotificationFilterPredicate
 */

public class ContactListFilterNotificationFilterPredicate  implements Serializable {
  
  private String column = null;

  /**
   * Gets or Sets columnType
   */
  public enum ColumnTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NUMERIC("NUMERIC"),
    ALPHABETIC("ALPHABETIC");

    private String value;

    ColumnTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ColumnTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ColumnTypeEnum value : ColumnTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ColumnTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ColumnTypeEnum columnType = null;

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
    AFTER("AFTER"),
    BETWEEN("BETWEEN"),
    IN("IN");

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
  private String value = null;
  private ContactListFilterNotificationRange range = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public ContactListFilterNotificationFilterPredicate column(String column) {
    this.column = column;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("column")
  public String getColumn() {
    return column;
  }
  public void setColumn(String column) {
    this.column = column;
  }


  /**
   **/
  public ContactListFilterNotificationFilterPredicate columnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("columnType")
  public ColumnTypeEnum getColumnType() {
    return columnType;
  }
  public void setColumnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
  }


  /**
   **/
  public ContactListFilterNotificationFilterPredicate operator(OperatorEnum operator) {
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
  public ContactListFilterNotificationFilterPredicate value(String value) {
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
  public ContactListFilterNotificationFilterPredicate range(ContactListFilterNotificationRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("range")
  public ContactListFilterNotificationRange getRange() {
    return range;
  }
  public void setRange(ContactListFilterNotificationRange range) {
    this.range = range;
  }


  /**
   **/
  public ContactListFilterNotificationFilterPredicate additionalProperties(Object additionalProperties) {
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
    ContactListFilterNotificationFilterPredicate contactListFilterNotificationFilterPredicate = (ContactListFilterNotificationFilterPredicate) o;
    return Objects.equals(this.column, contactListFilterNotificationFilterPredicate.column) &&
        Objects.equals(this.columnType, contactListFilterNotificationFilterPredicate.columnType) &&
        Objects.equals(this.operator, contactListFilterNotificationFilterPredicate.operator) &&
        Objects.equals(this.value, contactListFilterNotificationFilterPredicate.value) &&
        Objects.equals(this.range, contactListFilterNotificationFilterPredicate.range) &&
        Objects.equals(this.additionalProperties, contactListFilterNotificationFilterPredicate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, columnType, operator, value, range, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterNotificationFilterPredicate {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

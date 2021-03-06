package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TimeInterval
 */

public class TimeInterval  implements Serializable {
  
  private Integer days = null;
  private Integer hours = null;

  
  /**
   **/
  public TimeInterval days(Integer days) {
    this.days = days;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  
  /**
   **/
  public TimeInterval hours(Integer hours) {
    this.hours = hours;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hours")
  public Integer getHours() {
    return hours;
  }
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeInterval timeInterval = (TimeInterval) o;
    return Objects.equals(this.days, timeInterval.days) &&
        Objects.equals(this.hours, timeInterval.hours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, hours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeInterval {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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


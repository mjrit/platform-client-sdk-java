package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotificationIntradayMetric
 */

public class IntradayDataUpdateNotificationIntradayMetric  implements Serializable {
  

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HISTORICALQUEUEDATA("HistoricalQueueData"),
    HISTORICALAGENTDATA("HistoricalAgentData"),
    FORECASTDATA("ForecastData"),
    SCHEDULEDATA("ScheduleData"),
    PERFORMANCEPREDICTIONAGENTDATA("PerformancePredictionAgentData"),
    PERFORMANCEPREDICTIONQUEUEDATA("PerformancePredictionQueueData");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private String version = null;

  
  /**
   **/
  public IntradayDataUpdateNotificationIntradayMetric category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   **/
  public IntradayDataUpdateNotificationIntradayMetric version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotificationIntradayMetric intradayDataUpdateNotificationIntradayMetric = (IntradayDataUpdateNotificationIntradayMetric) o;
    return Objects.equals(this.category, intradayDataUpdateNotificationIntradayMetric.category) &&
        Objects.equals(this.version, intradayDataUpdateNotificationIntradayMetric.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationIntradayMetric {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Configuration information for the integration
 */
@ApiModel(description = "Configuration information for the integration")

public class IntegrationConfigurationInfo  implements Serializable {
  
  private IntegrationConfiguration current = null;

  
  /**
   * The current, active configuration for the integration.
   **/
  public IntegrationConfigurationInfo current(IntegrationConfiguration current) {
    this.current = current;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current, active configuration for the integration.")
  @JsonProperty("current")
  public IntegrationConfiguration getCurrent() {
    return current;
  }
  public void setCurrent(IntegrationConfiguration current) {
    this.current = current;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationConfigurationInfo integrationConfigurationInfo = (IntegrationConfigurationInfo) o;
    return Objects.equals(this.current, integrationConfigurationInfo.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationConfigurationInfo {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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


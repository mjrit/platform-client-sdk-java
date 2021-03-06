package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallForwardingNotificationTargets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CallForwardingNotificationCalls
 */

public class CallForwardingNotificationCalls  implements Serializable {
  
  private List<CallForwardingNotificationTargets> targets = new ArrayList<CallForwardingNotificationTargets>();

  
  /**
   **/
  public CallForwardingNotificationCalls targets(List<CallForwardingNotificationTargets> targets) {
    this.targets = targets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targets")
  public List<CallForwardingNotificationTargets> getTargets() {
    return targets;
  }
  public void setTargets(List<CallForwardingNotificationTargets> targets) {
    this.targets = targets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallForwardingNotificationCalls callForwardingNotificationCalls = (CallForwardingNotificationCalls) o;
    return Objects.equals(this.targets, callForwardingNotificationCalls.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallForwardingNotificationCalls {\n");
    
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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


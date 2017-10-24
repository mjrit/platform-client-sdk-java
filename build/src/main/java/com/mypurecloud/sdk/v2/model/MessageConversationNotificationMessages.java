package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.MessageConversationNotificationUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessageConversationNotificationMessages
 */

public class MessageConversationNotificationMessages  implements Serializable {
  
  private MessageConversationNotificationUriReference message = null;
  private Date messageTime = null;

  
  /**
   **/
  public MessageConversationNotificationMessages message(MessageConversationNotificationUriReference message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public MessageConversationNotificationUriReference getMessage() {
    return message;
  }
  public void setMessage(MessageConversationNotificationUriReference message) {
    this.message = message;
  }

  
  /**
   **/
  public MessageConversationNotificationMessages messageTime(Date messageTime) {
    this.messageTime = messageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageTime")
  public Date getMessageTime() {
    return messageTime;
  }
  public void setMessageTime(Date messageTime) {
    this.messageTime = messageTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageConversationNotificationMessages messageConversationNotificationMessages = (MessageConversationNotificationMessages) o;
    return Objects.equals(this.message, messageConversationNotificationMessages.message) &&
        Objects.equals(this.messageTime, messageConversationNotificationMessages.messageTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageConversationNotificationMessages {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
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


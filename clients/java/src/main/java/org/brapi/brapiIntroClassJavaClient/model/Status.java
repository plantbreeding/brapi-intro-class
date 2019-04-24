package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

public class Status   {
  private String code = null;
  private String message = null;

  /**
   * The logging level for the attached message
   */
  public enum MessageTypeEnum {
    DEBUG("DEBUG"),
    
    ERROR("ERROR"),
    
    WARNING("WARNING"),
    
    INFO("INFO");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageTypeEnum fromValue(String text) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private MessageTypeEnum messageType = null;

  public Status code(String code) {
    this.code = code;
    return this;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Status message(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Status messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.code, status.code) &&
        Objects.equals(this.message, status.message) &&
        Objects.equals(this.messageType, status.messageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, messageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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


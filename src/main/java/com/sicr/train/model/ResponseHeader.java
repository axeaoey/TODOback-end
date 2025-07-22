package com.sicr.train.model;

public class ResponseHeader {
  private String code;
  private String desc;

  public ResponseHeader() {
  }

  public String getCode() {
    return this.code;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public void setDesc(final String desc) {
    this.desc = desc;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    } else if (!(o instanceof ResponseHeader)) {
      return false;
    } else {
      ResponseHeader other = (ResponseHeader)o;
      if (!other.canEqual(this)) {
        return false;
      } else {
        Object this$code = this.getCode();
        Object other$code = other.getCode();
        if (this$code == null) {
          if (other$code != null) {
            return false;
          }
        } else if (!this$code.equals(other$code)) {
          return false;
        }

        Object this$desc = this.getDesc();
        Object other$desc = other.getDesc();
        if (this$desc == null) {
          if (other$desc != null) {
            return false;
          }
        } else if (!this$desc.equals(other$desc)) {
          return false;
        }

        return true;
      }
    }
  }

  protected boolean canEqual(final Object other) {
    return other instanceof ResponseHeader;
  }

  public int hashCode() {
    int result = 1;
    Object $code = this.getCode();
    result = result * 59 + ($code == null ? 43 : $code.hashCode());
    Object $desc = this.getDesc();
    result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
    return result;
  }

  public String toString() {
    String var10000 = this.getCode();
    return "ResponseHeader(code=" + var10000 + ", desc=" + this.getDesc() + ")";
  }
}

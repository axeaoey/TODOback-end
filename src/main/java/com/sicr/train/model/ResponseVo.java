package com.sicr.train.model;

import java.io.Serializable;

public class ResponseVo<T extends Serializable> extends ResponseBase implements Serializable {
  private static final long serialVersionUID = 5282106190451823196L;
  private T data;

  public ResponseVo() {
  }

  public T getData() {
    return this.data;
  }

  public void setData(final T data) {
    this.data = data;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    } else if (!(o instanceof ResponseVo)) {
      return false;
    } else {
      ResponseVo<?> other = (ResponseVo)o;
      if (!other.canEqual(this)) {
        return false;
      } else {
        Object this$data = this.getData();
        Object other$data = other.getData();
        if (this$data == null) {
          if (other$data != null) {
            return false;
          }
        } else if (!this$data.equals(other$data)) {
          return false;
        }

        return true;
      }
    }
  }

  protected boolean canEqual(final Object other) {
    return other instanceof ResponseVo;
  }

  public int hashCode() {
    int result = 1;
    Object $data = this.getData();
    result = result * 59 + ($data == null ? 43 : $data.hashCode());
    return result;
  }

  public String toString() {
    return "ResponseVo(data=" + String.valueOf(this.getData()) + ")";
  }
}

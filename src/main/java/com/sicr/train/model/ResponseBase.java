package com.sicr.train.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public class ResponseBase implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = -4549940090380658147L;
  private ResponseHeader header;

  public ResponseBase() {
  }

  public ResponseHeader getHeader() {
    return this.header;
  }

  public void setHeader(ResponseHeader header) {
    this.header = header;
  }

  public <T extends ResponseBase> T throwExceptionIfError() throws Exception {
    if (!ResponseType.CD2000.getValue().equalsIgnoreCase(this.header.getDesc())) {
      throw new Exception(this.header.getDesc());
    } else {
      return (T) this;
    }
  }
}

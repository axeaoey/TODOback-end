package com.sicr.train.model;

public enum ResponseType {
  CD2000("Success"),
  CD2001("Data not found"),
  CD5000("Error"),
  CD5101("Query Data Exception");

  private String value;

  private ResponseType(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}

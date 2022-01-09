package com.michowski;

import java.util.ArrayList;

import com.michowski.correlation.CorrelationResult;

public class CorrelationItem {
  private String variableX;
  private String variableY;
  private ArrayList<CorrelationResult> results;

  public CorrelationItem(String variableX, String variableY, ArrayList<CorrelationResult> results) {
    this.variableX = variableX;
    this.variableY = variableY;
    this.results = results;
  }

  public String getTitle() {
    return getVariableX() + " vs. " + getVariableY();
  }

  public String getVariableX() {
    return variableX;
  }

  public String getVariableY() {
    return variableY;
  }

  public ArrayList<CorrelationResult> getResults() {
    return results;
  }
}

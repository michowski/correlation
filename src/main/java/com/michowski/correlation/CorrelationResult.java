package com.michowski.correlation;

import java.util.ArrayList;

public class CorrelationResult {
  private CorrelationType correlationType;
  private ArrayList<Measurement> measurements;
  private ArrayList<CorrelationPoint> correlationPoints;
  private double correlation;

  public ArrayList<Measurement> getMeasurements() {
    return measurements;
  }

  public ArrayList<CorrelationPoint> getCorrelationPoints() {
    return correlationPoints;
  }

  public double getCorrelation() {
    return correlation;
  }

  public CorrelationStrength getCorrelationStrength() {
    return CorrelationStrength.NoCorrelation;
  }

  public CorrelationType getCorrelationType() {
    return correlationType;
  }
}

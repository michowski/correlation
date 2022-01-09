package com.michowski.correlation;

public class CorrelationPoint extends Point<Measurement, Double> {
  CorrelationPoint(Measurement measurement, double coefficient) {
    super(measurement, coefficient);
  }

  @Override
  public String toString() {
    return "CorrelationPoint: " + super.toString();
  }
}

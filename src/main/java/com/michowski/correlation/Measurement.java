package com.michowski.correlation;

public class Measurement extends Point<Double, Double> {
  Measurement(Double x, Double y) {
    super(x, y);
  }

  @Override
  public String toString() {
    return "Measurement: " + super.toString();
  }
}

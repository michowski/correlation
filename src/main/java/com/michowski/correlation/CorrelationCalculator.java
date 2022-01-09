package com.michowski.correlation;

import java.util.ArrayList;

public abstract class CorrelationCalculator {
  public static CorrelationType CORRELATION_TYPE;

  abstract public CorrelationResult calculate(ArrayList<Measurement> measurements);
}

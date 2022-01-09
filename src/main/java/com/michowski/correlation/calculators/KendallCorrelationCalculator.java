package com.michowski.correlation.calculators;

import java.util.ArrayList;

import com.michowski.correlation.CorrelationCalculator;
import com.michowski.correlation.CorrelationResult;
import com.michowski.correlation.CorrelationType;
import com.michowski.correlation.Measurement;

public class KendallCorrelationCalculator extends CorrelationCalculator {
  public static CorrelationType CORRELATION_TYPE = CorrelationType.Kendall;

  @Override
  public CorrelationResult calculate(ArrayList<Measurement> measurements) {
    // TODO Auto-generated method stub
    return null;
  }
}

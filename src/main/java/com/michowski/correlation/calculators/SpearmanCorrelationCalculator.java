package com.michowski.correlation.calculators;

import java.util.ArrayList;
import java.util.Collections;

import com.michowski.correlation.CorrelationCalculator;
import com.michowski.correlation.CorrelationResult;
import com.michowski.correlation.CorrelationType;
import com.michowski.correlation.Measurement;

public class SpearmanCorrelationCalculator extends CorrelationCalculator {
  public static CorrelationType CORRELATION_TYPE = CorrelationType.Spearman;

  @Override
  public CorrelationResult calculate(ArrayList<Measurement> measurements) {
    ArrayList<Integer> rankingA = new ArrayList<>();
    ArrayList<Integer> rankingB = new ArrayList<>();

    ArrayList<Double> sortedA = new ArrayList<>();
    ArrayList<Double> sortedB = new ArrayList<>();

    for (Measurement measurement : measurements) {
      sortedA.add(measurement.getX());
      sortedB.add(measurement.getY());
    }

    Collections.sort(sortedA);
    Collections.sort(sortedB);

    for (int i = 0; i < measurements.size(); i++) {
      Measurement measurement = measurements.get(i);
      double x = measurement.getX();
      double y = measurement.getY();

      rankingA.add(sortedA.indexOf(x));
      rankingB.add(sortedB.indexOf(y));
    }

    return null;
  }
}

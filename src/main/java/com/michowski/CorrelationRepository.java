package com.michowski;

import java.util.ArrayList;

import com.michowski.correlation.CorrelationCalculator;
import com.michowski.correlation.CorrelationResult;
import com.michowski.correlation.Measurement;
import com.michowski.correlation.calculators.KendallCorrelationCalculator;
import com.michowski.correlation.calculators.PearsonCorrelationCalculator;
import com.michowski.correlation.calculators.SpearmanCorrelationCalculator;

public class CorrelationRepository {
  private ArrayList<CorrelationItem> items;

  private CorrelationCalculator[] calculators = {
      new PearsonCorrelationCalculator(),
      new SpearmanCorrelationCalculator(),
      new KendallCorrelationCalculator()
  };

  public CorrelationRepository() {
    this.items = new ArrayList<>();
  }

  public void addCorrelation(String variableX, String variableY, ArrayList<Measurement> measurements) {
    ArrayList<CorrelationResult> results = new ArrayList<>();

    for (CorrelationCalculator calculator : calculators) {
      CorrelationResult result = calculator.calculate(measurements);

      results.add(result);
    }

    CorrelationItem item = new CorrelationItem(variableX, variableY, results);

    items.add(item);
  }

  public ArrayList<CorrelationItem> getItems() {
    return items;
  }
}

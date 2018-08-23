package com.pavlo.strategy.secondExample;

public class FormulaOne extends Vehicle {
  public FormulaOne() {
    setGoAlgorithm(new GoByDrivingAlgorithm());
  }
}

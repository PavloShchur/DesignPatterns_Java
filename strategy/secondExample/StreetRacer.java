package com.pavlo.strategy.secondExample;

public class StreetRacer extends Vehicle {
  public StreetRacer() 
  {
    setGoAlgorithm(new GoByDrivingAlgorithm());
  }
}

package com.pavlo.decorator.secondExample;

public class CD extends ComponentDecorator {
  Computer computer;

  public CD(Computer c) {
    computer = c;
  }

  public String description() {
    return computer.description() + " and a CD";
  }
}

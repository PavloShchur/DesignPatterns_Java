package com.pavlo.factoryMethod.secondExample;

public class OracleConnection extends Connection {
  
	public OracleConnection() {}

    public String description() {
      return "Oracle";
    }
}

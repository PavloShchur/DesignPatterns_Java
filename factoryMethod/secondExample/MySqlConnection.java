package com.pavlo.factoryMethod.secondExample;

public class MySqlConnection extends Connection {
  
	public MySqlConnection() {}
	
    public String description() {
      return "MySQL";
    }
}

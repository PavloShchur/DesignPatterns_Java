package com.pavlo.strategy.firstExample;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}

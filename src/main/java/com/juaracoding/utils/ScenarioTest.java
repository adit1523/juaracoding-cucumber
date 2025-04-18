package com.juaracoding.utils;

public enum ScenarioTest {

    T1("Successful login with valid credentials"),
    T2("Invalid login with invalid credentials"),
    T3("Admin add new candidate");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}

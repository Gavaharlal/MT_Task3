package entities;

import java.util.Collections;

public class Reading implements Statement {
    private final String variableName;

    public Reading(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return "read(" + variableName + ")" + System.lineSeparator();
    }

    @Override
    public String translate() {
        return "scanf(\"%d\", &" + variableName + ");"+System.lineSeparator();
    }

    @Override
    public String getPreps() {
        return null;
    }
}

package entities;

public class Unary implements Statement {
    private final boolean isPref;
    private final String operator;
    private final String variableName;

    public Unary(boolean isPref, String operator, String variableName) {
        this.isPref = isPref;
        this.operator = operator;
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        if (isPref) {
            return operator + variableName + System.lineSeparator();
        } else {
            return variableName + operator + System.lineSeparator();
        }
    }

    @Override
    public String translate() {
        if (isPref) {
            return operator + variableName + ";" + System.lineSeparator();
        } else {
            return variableName + operator + ";" + System.lineSeparator();
        }
    }

    @Override
    public String getPreps() {
        return null;
    }
}

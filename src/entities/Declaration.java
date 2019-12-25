package entities;

public class Declaration implements Statement {
    private final String variableName;

    public Declaration(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return variableName + " : int" + System.lineSeparator();
    }

    @Override
    public String translate() {
        return "int " + variableName + ";" + System.lineSeparator();
    }

    @Override
    public String getPreps() {
        return null;
    }
}

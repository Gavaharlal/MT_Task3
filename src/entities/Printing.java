package entities;

import java.util.List;

public class Printing implements Statement {
    private final String arg;
    private final Type type;

    public Printing(String arg, Type type) {
        this.arg = arg;
        this.type = type;
    }

    @Override
    public String toString() {
        return "print(" + arg + ")" + System.lineSeparator();
    }

    @Override
    public String translate() {
        switch (type) {
            case INT:
                return "printf(\"%d\", " + arg + ");" + System.lineSeparator();
            case STRING:
                return "printf(\"%s\", " + arg + ");" + System.lineSeparator();
            default:
                throw new RuntimeException("Unexpected type");
        }
    }

    @Override
    public String getPreps() {
        return null;
    }
}

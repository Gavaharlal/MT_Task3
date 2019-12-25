package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Assignment implements Statement {
    private static int functionID = 0;
    private final int curId;
    private final List<String> leftPart = new ArrayList<>();
    private final List<String> rightPart = new ArrayList<>();

    public Assignment(String variableName, String expression) {
        leftPart.add(variableName);
        rightPart.add(expression);
        curId = functionID++;
    }

    public Assignment addLeft(String varName) {
        leftPart.add(0, varName);
        return this;
    }

    public Assignment addRight(String expression) {
        rightPart.add(expression);
        return this;
    }

    @Override
    public String toString() {
        String variables = String.join(", ", leftPart);
        String expressions = String.join(", ", rightPart);
        return variables + " = " + expressions + System.lineSeparator();
    }

    @Override
    public String getPreps() {
        if (leftPart.size() > 1) {
            StringBuilder result = new StringBuilder();
            result.append("void swap").append(curId).append("(");
            result.append(IntStream.range(0, leftPart.size()).mapToObj(i -> "int *a" + i).collect(Collectors.joining(", ")));
            result.append(", ");
            result.append(IntStream.range(0, rightPart.size()).mapToObj(i -> "int b" + i).collect(Collectors.joining(", ")));
            result.append(") {").append(System.lineSeparator());
            for (int i = 0; i < leftPart.size(); i++) {
                result.append("    *a").append(i).append(" = ").append("b").append(i).append(";").append(System.lineSeparator());
            }
            result.append("}").append(System.lineSeparator());
            return result.toString();
        } else return null;
    }

    @Override
    public String translate() {
        if (leftPart.size() > 1) {
            return "swap" + curId + "(" +
                    leftPart.stream().map(v -> "&" + v).collect(Collectors.joining(", ")) +
                    ", " +
                    String.join(", ", rightPart) +
                    ");" + System.lineSeparator();
        } else {
            return leftPart.get(0) + " = " + rightPart.get(0) + ";" + System.lineSeparator();
        }
    }
}

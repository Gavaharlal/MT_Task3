package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Body {
    private final List<Statement> statements;

    public Body(Statement statement) {
        statements = new ArrayList<>(Collections.singletonList(statement));
    }

    public Body add(Statement statement) {
        statements.add(statement);
        return this;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return statements.stream().map(Objects::toString).collect(Collectors.joining());
    }

    public String generateProgram() {
        StringBuilder result = new StringBuilder();
        result.append("#include <stdio.h>").append(System.lineSeparator());
        statements.stream().map(Statement::getPreps).filter(Objects::nonNull).forEach(result::append);
        result.append("int main() {").append(System.lineSeparator());
        statements.stream().map(Statement::translate).forEach(result::append);
        result.append("return 0;").append(System.lineSeparator());
        result.append("}");
        return result.toString();
    }
}

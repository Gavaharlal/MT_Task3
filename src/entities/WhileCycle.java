package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class WhileCycle implements Statement {
    private final String predicate;
    private final List<Statement> body = new ArrayList<>();

    public WhileCycle(String predicateResult, Statement statementResult) {
        predicate = predicateResult;
        body.add(statementResult);
    }

    public WhileCycle(String predicateResult) {
        predicate = predicateResult;
    }

    public void add(Statement statementResult) {
        body.add(statementResult);
    }

    public void addAll(List<Statement> stats) {
        body.addAll(stats);
    }

    @Override
    public String toString() {
        return "while (" + predicate + ") {" + System.lineSeparator() +
                body.stream().map(Objects::toString).collect(Collectors.joining("\t", "\t", "")) +
                '}' + System.lineSeparator();
    }

    @Override
    public String translate() {
        return "while (" + predicate + ") {" + System.lineSeparator() +
                body.stream().map(Statement::translate).collect(Collectors.joining("\t", "\t", "")) +
                '}' + System.lineSeparator();
    }

    @Override
    public String getPreps() {
        return body.stream().map(Statement::getPreps).filter(Objects::nonNull).collect(Collectors.joining(System.lineSeparator()));
    }
}

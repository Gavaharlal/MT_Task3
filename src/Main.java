import entities.Body;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import parser.ExpressionLexer;
import parser.ExpressionParser;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromStream(new FileInputStream("inputProgram"));
        ExpressionLexer lexer = new ExpressionLexer(charStream);
        TokenStream ts = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(ts);
        Body body = parser.body().bodyResult;
        System.out.println(body.generateProgram());

    }
}

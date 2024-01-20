import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class Interpreter {
    public static void main(String[] args) throws IOException {
        var input = CharStreams.fromFileName("src/HelloWorld.orca");
        var lexer = new OrcaLexer(input);
        var tokens = new CommonTokenStream(lexer);
        var parser = new OrcaParser(tokens);

        var program = new Program(parser.program());

        for (var statement : program.statements)
            System.out.println(statement.toString());

        System.out.println();

        // compile
        var context = new EVMContext();

        for (var statement : program.statements)
            statement.compile(context);

        System.out.println(context.bytecode);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Statement> statements;

    Program(OrcaParser.ProgramContext ctx) {
        statements = new ArrayList<>();
        var visitor = new ExpressionVisitor();

        for (var assignment : ctx.assignment()) {
            var variable = new Variable(assignment.VARIABLE().getText());
            var expression = visitor.visit(assignment.expression());
            statements.add(new Assignment(variable, expression));
        }

        var expression = visitor.visit(ctx.return_());
        statements.add(new Return(expression));
    }
}

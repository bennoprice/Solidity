public class Assignment extends Statement {
    Variable variable;
    Expression expression;

    Assignment(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return variable.toString() + " = " + expression.toString();
    }

    @Override
    public void compile(EVMContext ctx) {
        expression.compile(ctx);
        ctx.stack.pop();
        ctx.stack.push(variable.name);
    }
}

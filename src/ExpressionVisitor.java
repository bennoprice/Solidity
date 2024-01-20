public class ExpressionVisitor extends OrcaBaseVisitor<Expression> {
    @Override
    public Expression visitConstant(OrcaParser.ConstantContext ctx) {
        var value = Integer.parseInt(ctx.CONSTANT().getText());
        return new Constant(value);
    }

    @Override
    public Expression visitVariable(OrcaParser.VariableContext ctx) {
        var name = ctx.VARIABLE().getText();
        return new Variable(name);
    }

    @Override
    public Expression visitAddition(OrcaParser.AdditionContext ctx) {
        var lhs = new ExpressionVisitor().visit(ctx.expression(0));
        var rhs = new ExpressionVisitor().visit(ctx.expression(1));
        return new Addition(lhs, rhs);
    }
}

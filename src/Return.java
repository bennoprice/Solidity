public class Return extends Statement {
    Expression expression;

    Return(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "return " + expression.toString();
    }

    @Override
    public void compile(EVMContext ctx) {
        expression.compile(ctx);
        ctx.bytecode += Assembler.PUSH(4, "00000000");
        ctx.stack.push();
        ctx.bytecode += Assembler.SSTORE();
        ctx.stack.pop();
        ctx.stack.pop();
    }
}

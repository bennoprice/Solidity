public class Addition extends Expression {
    Expression lhs;
    Expression rhs;

    Addition(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public String toString() {
        return lhs.toString() + " + " + rhs.toString();
    }

    @Override
    public void compile(EVMContext ctx) {
        lhs.compile(ctx);
        rhs.compile(ctx);
        ctx.bytecode += Assembler.ADD();
        ctx.stack.pop();
    }
}

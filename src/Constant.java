public class Constant extends Expression {
    int value;

    Constant(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public void compile(EVMContext ctx) {
        ctx.bytecode += Assembler.PUSH(4, String.format("%08x", value));
        ctx.stack.push();
    }
}

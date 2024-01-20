public class Variable extends Expression {
    String name;

    Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void compile(EVMContext ctx) {
        var slot = ctx.stack.getSlot(name);
        ctx.bytecode += Assembler.DUP(slot);
        ctx.stack.push();
    }
}

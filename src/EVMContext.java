import java.util.ArrayList;

class Stack {
    int size;
    ArrayList<String> variables;

    Stack() {
        variables = new ArrayList<>();
    }

    int getSlot(String variable) {
        var idx = variables.indexOf(variable);
        assert (idx != -1) : "Stack.getSlot: identifier \"" + variable + "\" undefined";
        return size - idx;
    }

    void push(String variable) {
        assert !variables.contains(variable) : "Stack.push: identifier \"" + variable + "\" duplicate declaration";
        variables.add(variable);
        size++;
    }

    void push() {
        size++;
    }
    void pop() {
        size--;
    }
}

public class EVMContext {
    Stack stack;
    String bytecode;

    EVMContext() {
        stack = new Stack();
        bytecode = "0x";
    }
}
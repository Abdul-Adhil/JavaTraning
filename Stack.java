//D3 - 3
public class Stack {
    public static void main(String[] args) throws Exception {
        FixedStack fixed = new FixedStack(3);

        System.out.println("Fixed Stack");
        fixed.push(2);

        fixed.push(3);
        fixed.push(8);
        // fixed.push(3);

        fixed.pop();
        fixed.pop();

        fixed.printElement();

        // dynamic stack
        System.out.println();
        System.out.println("Dynamic Stack");

        DynamicStack dynamic = new DynamicStack(4);
        dynamic.push(2);
        dynamic.push(9);
        dynamic.push(7);
        dynamic.push(6);
        dynamic.push(4);
        dynamic.push(8);

        dynamic.pop();
        dynamic.pop();

        dynamic.printElement();

    }
}

interface StackMethod { // interface - used to group related methods with empty bodies
    // hide certain details and only show the important details of an
    // object(interface).
    void push(int value);

    public void pop();

    public void printElement();
}

class FixedStack implements StackMethod {

    private int[] fixedStack;
    private int stackSize;
    private int top;

    public FixedStack(int size) {
        this.stackSize = size;
        this.fixedStack = new int[stackSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top >= this.stackSize)
            throw new IndexOutOfBoundsException("Stack size = " + stackSize);
        this.fixedStack[++top] = value;
        System.out.println("The value pushed" + value);

    }

    public void pop() {
        int popVal = this.fixedStack[top--];

        System.out.println("Pop value: " + popVal);
    }

    public void printElement() {
        for (int i = 0; i <= top; i++) {
            System.out.println(fixedStack[i]);
        }
    }

}

class DynamicStack implements StackMethod {

    private int[] dynamicStack;
    private int stackSize;
    private int top;

    public DynamicStack(int size) {
        this.stackSize = size;
        this.dynamicStack = new int[stackSize];
        this.top = -1;
    }

    public void push(int value) {
        // System.out.println(top + " " + value);

        if (top == stackSize - 1)
            this.increaseStackSize();

        this.dynamicStack[++top] = value;

    }

    public void pop() {

        int popVal = this.dynamicStack[top--];

        System.out.println("Pop value: " + popVal);

    }

    public void printElement() {
        for (int i = 0; i <= top; i++) {
            System.out.println(dynamicStack[i]);
        }
    }

    private void increaseStackSize() {
        int[] newStack = new int[this.stackSize + 1];
        for (int i = 0; i < stackSize; i++) {
            newStack[i] = this.dynamicStack[i];
        }
        this.dynamicStack = newStack;
        this.stackSize = this.stackSize + 1;
    }

}
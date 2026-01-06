class Stack {
    private int[] data;
    private int top;

    public Stack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean push(int value) {
        if (top == data.length - 1) return false;
        data[++top] = value;
        return true;
    }

    public Integer pop() {
        if (top < 0) return null;
        return data[top--];
    }

    public boolean isEmpty() {
        return top < 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.pop();
    }
}

package estudos.EstruturaDeDados.pilha;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);

    }
}

// leetcode 155
// time - o(1)
// space - o(n)

import java.util.*;

public class MinStack {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(-2);
        stack.push(-1);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        ;
        ;
        System.out.println(stack.getMin());
        ;
        
    }
    
}

class MyStack{

    private final Stack<Integer> eleStack;
    private final Stack<Integer> minStack;

    public MyStack(){
        this.eleStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val){

        eleStack.push(val);

        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }

    }

    public void pop(){

        if(minStack.peek().equals(eleStack.peek())){
            minStack.pop();
        }

        eleStack.pop();

    }

    public int top(){
        return eleStack.peek();

    }

    public int getMin(){
        return minStack.peek();

    }
}

package org.example.datastructures;

public class Stack {
    int[] stack;
    int capacity;
    int top;

    public Stack(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int element){
        if (top == capacity - 1) {
            System.out.println("The stack is full!");
            return;
        }
//        System.out.println("Top: " + top + "; element: " + element);
        stack[++top] = element;
    }

    public int pop(){
        if ( isEmpty() ){
            throw new IllegalStateException("The stack is empty!");
        }
        return stack[top--];
    }

    public int peek(){
        if ( isEmpty() ){
            throw new IllegalStateException("The stack is empty!");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }
}

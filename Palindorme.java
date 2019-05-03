package com.company;

import java.util.ArrayList;

class Palindorme<A extends Comparable> {

    ArrayList<A> stack;

    public Palindorme() {
        stack = new ArrayList<>();
    }

    public String pop() throws Exception {
        if (stack.size() != 0) {
            return stack.remove(stack.size()-1).toString();
        } else {
            throw new Exception("Unidentified Elements...");
        }
    }

    public void push(A x) {
        stack.add(x);
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean find(A x ) {
        boolean found = false;
        for (A a : stack){
            if (a.equals(x)) {
                found = true;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }
}
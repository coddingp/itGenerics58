package org.example;

public class NewGenerics<T> {
    private T val;

    public NewGenerics(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "(" + val + ")";
    }

    public T getVal() {
        return val;
    }
}



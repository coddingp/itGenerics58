package org.example;

import java.util.Objects;

public class MyGeneric<T> {
    private T val;

    public MyGeneric(T val) {
        this.val = val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "(" + val + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyGeneric<?> myGeneric = (MyGeneric<?>) o;
        return Objects.equals(val, myGeneric.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}

package org.example;

import java.util.Objects;

public class GenericIntegerString<T, E> {
    private T intVal;
    private E stringVal;

    public GenericIntegerString(T intVal, E stringVal) {
        this.intVal = intVal;
        this.stringVal = stringVal;
    }

    public T getIntVal() {
        return intVal;
    }

    public void setIntVal(T intVal) {
        this.intVal = intVal;
    }

    public E getStringVal() {
        return stringVal;
    }

    public void setStringVal(E stringVal) {
        this.stringVal = stringVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericIntegerString<?, ?> that = (GenericIntegerString<?, ?>) o;
        return Objects.equals(intVal, that.intVal) && Objects.equals(stringVal, that.stringVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intVal, stringVal);
    }

    @Override
    public String toString() {
        return "(" +
                "intVal=" + intVal +
                ", stringVal=" + stringVal +
                ')';
    }
}

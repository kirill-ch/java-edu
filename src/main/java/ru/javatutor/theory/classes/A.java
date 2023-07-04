package ru.javatutor.theory.classes;

import java.util.Objects;

public class A {
    String name;

    public A(String text) {
        this.name = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

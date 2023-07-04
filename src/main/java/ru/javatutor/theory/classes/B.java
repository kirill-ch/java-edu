package ru.javatutor.theory.classes;

import java.util.Objects;

public class B extends A {
    String text;

    public B(String name, String text) {
        super(name);
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof B)) return false;
        if (!super.equals(o)) return false;
        B b = (B) o;
        return Objects.equals(text, b.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
}

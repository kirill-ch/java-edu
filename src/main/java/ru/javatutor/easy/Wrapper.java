package ru.javatutor.easy;

public class Wrapper {
    public static void main(String[] args) {
        Integer i1 = 123;
        Integer i2 = 123;
        System.out.println(i1 == i2); // true - кэшируется
        Integer i3 = 1020;
        Integer i4 = 1020;
        System.out.println(i3 == i4); // false - не кэшируется
    }
}

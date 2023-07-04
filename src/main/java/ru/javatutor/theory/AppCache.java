package ru.javatutor.theory;

import ru.javatutor.theory.classes.B;
import ru.javatutor.theory.classes.Student;

public class AppCache {
    public static void main(String[] args) {
        // кэширование значений
        // разница между equals() и оператором ==
        // видео-объяснение: https://vk.com/video-213773909_456239070
        Student student1 = new Student("Oleg", "K");
        Student student2 = new Student("Kris", "P");

        System.out.println(student1 == student2); // false
        System.out.println(student1.equals(student2)); // false

        B b1 = new B("MyName", "text1");
        B b2 = new B("MyName", "text2");

        System.out.println(b1);

        System.out.println(b1.equals(b2)); // false (до переопределения equals() в классе В было true)

        Integer i1 = 140;
        Integer i2 = 140;
        System.out.println(i1 == i2);      // false
        System.out.println(i1.equals(i2)); // true

        i1 = 120;
        i2 = 120;
        System.out.println(i1 == i2);      // true
        System.out.println(i1.equals(i2)); // true

    }
}

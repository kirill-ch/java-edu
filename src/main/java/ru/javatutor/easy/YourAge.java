package ru.javatutor.easy;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class YourAge {
    public static void main(String[] args) {
        YourAge age = new YourAge();

        System.out.println("Today: " + LocalDate.now());
        age.yourAge(LocalDate.of(2000, 2, 4));
    }

    public void yourAge(LocalDate birth) {
        LocalDate l = LocalDate.now();
        Period period = Period.between(birth, l);
        long days = ChronoUnit.DAYS.between(birth, l);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
        System.out.println("Total days: " + days);
    }
}

/*
Вычислить сколько вам лет, месяцев и дней от текущего момента.
Также вычислите ваш возраст в днях от текущего момента.

Например, человек родился 01.01.2020 года, а сейчас 05.02.2021.
Тогда его возраст 1 год 1 месяц и 4 дня.
В днях его возраст 401 день.
 */

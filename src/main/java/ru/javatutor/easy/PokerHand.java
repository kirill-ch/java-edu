package ru.javatutor.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* https://www.codewars.com/kata/582afcadac2d9baa0900054c/train/java

   Разбор других задач, теоретических вопросов собеседований и другие полезные материалы
   по Java вы можете посмотреть в моей группе ВКонтакте: https://vk.com/java_tutor
 */
public class PokerHand {
    public static boolean isStraight(ArrayList<Integer> cards) {
        if (cards == null || cards.size() < 5) {
            return false;
        }
        // если присутствует 14, то это 1
        if (cards.contains(14)) {
            cards.add(1);
        }
        // сортируем
        Collections.sort(cards);
        // удаляем дубликаты в отсортированном списке
        List<Integer> distinct = new ArrayList<>();
        distinct.add(cards.get(0));
        for (int i = 1; i < cards.size(); i++) {
            int last = distinct.get(distinct.size() - 1);
            if (last != cards.get(i)) {
                distinct.add(cards.get(i));
            }
        }

        // находим разницу между 5-ю картами, если она равна 4, то straight.
        for (int i = 0; i < distinct.size() - 4; i++) {
            if (distinct.get(i + 4) - distinct.get(i) == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStraight2(ArrayList<Integer> cards) {
        if (cards == null || cards.size() < 5) {
            return false;
        }
        // если присутствует 14, то это 1
        if (cards.contains(14)) {
            cards.add(1);
        }
        // сортируем и удаляем дубликаты в отсортированном списке
        List<Integer> distinct = cards.stream().sorted().distinct().collect(Collectors.toList());

        // находим разницу между 5-ю картами, если она равна 4, то straight.
        for (int i = 0; i < distinct.size() - 4; i++) {
            if (distinct.get(i + 4) - distinct.get(i) == 4) {
                return true;
            }
        }
        return false;
    }

    /*
    Данное решение не найти в сети, поскольку его предложил один из моих учеников.
    Блестяще! Это умное решение данной задачи с минимальной алгоритмической сложностью.
    Ученик отлично усвоил тему хеширования.
     */
    public boolean isStraight3(ArrayList<Integer> cards) {
        if (cards == null || cards.size() < 5) {
            return false;
        }

        // считаем карты
        int[] counts = new int[15];
        for (int card : cards) {
            if (card == 14) {
                counts[1]++;
            }
            counts[card]++;
        }
        int count = 0;
        // есть ли 5 последовательных
        for (int rank : counts) {
            count = rank > 0 ? count + 1 : 0; // если последовательной карты нет, то обнуляем счетчик
            if (count == 5) { // если 5 последовательных есть, то это стрейт
                return true;
            }
        }
        return false;
    }
}

/*
    Your task is to determine if the cards in the list makes up a straight (five cards of sequential rank) or not.
    The cards will always have values ranging from 2-14, where 14 is the ace.

    Be aware that the ace (14) also should count as value 1!

    The number of cards will vary, but will never be more than 7 (the board (5) + player hand (2))

    Examples:

    straight: 9-10-11-12-13

    straight: 14-2-3-4-5

    straight: 2-7-8-5-10-9-11

    not straight: 7-8-12-13-14

 */

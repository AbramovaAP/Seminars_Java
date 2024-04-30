/*
---------------------Задача 2-------------------------
Заполнить список десятью случайными числами. Отсортировать список 
методом sort() класса Collection и вывести его на экран.
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

// public class Task2 {
//     public static void main(String[] args) {
//         int n = 10;
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         Random rnd = new Random();

//         for (int i = 0; i < n; i++) {
//             list.add(rnd.nextInt(100));
//         }

//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);

//     }
// }

//Перепишем задачу используя отдельный метод:
public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> list = CreateArrayListRandome(n);
        System.out.println(list);
        Collections.sort(list); //Отсортировываем массив по возрастанию
        System.out.println(list);

    }

    public static ArrayList<Integer> CreateArrayListRandome(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }
}
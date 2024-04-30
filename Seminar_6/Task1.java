/*=================Задача 1 ======================
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.

3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
 */
package Seminar_6;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        initHashSet();
        initLinkedHashSet();
        initTreeSet();
    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void initHashSet() {
        System.out.println(new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3))); //[1, 2, 3, 4, 5, 6]
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
    // 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void initLinkedHashSet() {
        System.out.println(new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3))); //[1, 2, 3, 4, 5, 6]
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void initTreeSet() {
        System.out.println(new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3))); //[1, 2, 3, 4, 5, 6]
    }
}

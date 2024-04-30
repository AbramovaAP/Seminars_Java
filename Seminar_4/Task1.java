/*---------------------Задача 1-------------------------
1) Замерьте время, за которое в ArrayList добавятся 100_000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 100_000 элементов.
Сравните с предыдущим.
 */
package Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        int size = 100_000;
// 1. Фиксируем начальное время работы для ArrayList (начало списка)
        long start = System.currentTimeMillis();
        System.out.println("Добавление элементов в начало списка:");
        createArrayListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);// текущее время - стартовое
        // Снова фиксируем начальное время работы для LinkedList (начало списка)
        start = System.currentTimeMillis();
        createLinkedListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);// текущее время - стартовое

// 2. Обновляем начальное время работы для ArrayList (конец списка)
        start = System.currentTimeMillis();
        System.out.println("Добавление элементов в конец списка:");
        createArrayListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);// текущее время - стартовое
        // Снова фиксируем начальное время работы для LinkedList (конец списка)
        start = System.currentTimeMillis();
        createLinkedListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);// текущее время - стартовое

// 3. Обновляем начальное время работы для ArrayList (середина списка)
        start = System.currentTimeMillis();
        System.out.println("Добавление элементов в середину списка:");
        createArrayListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);// текущее время - стартовое
        // Снова фиксируем начальное время работы для LinkedList (середину списка)
        start = System.currentTimeMillis();
        createLinkedListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);// текущее время - стартовое

                            /* Вывод:
                            Добавление элементов в начало списка:
                            440
                            10
                            Добавление элементов в конец списка:
                            3
                            6
                            Добавление элементов в середину списка:
                            7
                            3
                            */

    }

    // ----------------------------ArrayList-------------------------------
    // 1. Метод ArrayList для создания и добавления элемента в ~НАЧАЛО~ списка:
    public static ArrayList<Integer> createArrayListAddFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i); // addFirst - добавляем элемент в начало списка
        }
        return arrayList;
    }

    // 2. Метод ArrayList для создания и добавления элемента в ~КОНЕЦ~ списка:
    public static ArrayList<Integer> createArrayListAddLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(i); // addLast - добавляем элемент в конец списка
        }
        return arrayList;
    }

    // 3. Метод ArrayList для создания и добавления элемента в ~СЕРЕДИНУ~ списка:
    public static ArrayList<Integer> createArrayListAddMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(arrayList.size() / 2); // добавляем элемент в середину списка
        }
        return arrayList;
    }

    // ----------------------------LinkedList-------------------------------
    // 4. Метод LinkedList для создания и добавления элемента в ~НАЧАЛО~ списка:
    public static LinkedList<Integer> createLinkedListAddFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i); // addFirst - добавляем элемент в начало списка
            linkedList.add(0, i); // другая запись добавления элемента в начало списка
        }
        return linkedList;
    }

    // 5. Метод LinkedList для создания и добавления элемента в ~КОНЕЦ~ списка:
    public static LinkedList<Integer> createLinkedListAddLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i); // addLast - добавляем элемент в конец списка
        }
        return linkedList;
    }

    // 6. Метод LinkedList для создания и добавления элемента в ~СЕРЕДИНУ~ списка:
    public static LinkedList<Integer> createLinkedListAddMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(linkedList.size() / 2); // добавляем элемент в середину списка
        }
        return linkedList;
    }
}

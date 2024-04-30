/*=========================Задание №5 (доп)======================
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
*/

public class Task5_dop {
    public static String[] fillList() {
        String list = "Добро пожаловать на курс по Java";
        String[] array = list.split(" ");
        return array;
    }

    // общий метод для печати любого списка
    public static void printList(String[] list) {
        for (Object el : list) {
            System.out.printf(el + " ");
        }
    }

    // метод для преобразования списка
    public static void replaceList(String[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            String temp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        String[] listFirst = fillList();
        System.out.println("Исходный связанный список:");
        printList(listFirst); // запуск метода для печати исходного списка
        replaceList(listFirst); // запуск метода для переворачивания исходного списка
        System.out.println("\n");
        System.out.println("Перевернутый список:");
        printList(listFirst);// запуск метода для печати перевернутого списка
    }

}

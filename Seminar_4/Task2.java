/*---------------------Задача 2-------------------------
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
*/
package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while (true) {
            System.out.println();
            System.out.println("Введите строку типа text~num, для добавления в список. ");
            System.out.println("Для вывода и удаления элемента из списка, введите строку типа print~num. ");
            System.out.println("Для выхода из программы введите 'q'. ");
            System.out.println();
            String str = scanner.nextLine();

            if (str.equals("q")) {
                break;
            }

            String[] strs = str.split("~");
            String text = strs[0];
            int num = Integer.parseInt(strs[1]);

            if (text.equals("print")) {
                if (num >= 0 && num < ll.size()) {
                    System.out.println(ll.get(num));
                    ll.remove(num);
                } else {
                    System.out.println("Такой позиции нет! ");
                }
                System.out.println(ll);

            } else {
                if (num >= 0 && num <= ll.size()) {
                    ll.add(num, text);
                } else {
                    System.out.println("Такой позиции еще нет! ");
                }
                System.out.println(ll);
            }
        }
        scanner.close();
    }
}

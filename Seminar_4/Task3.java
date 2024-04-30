/*---------------------Задача 3-------------------------
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
*/ 

package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while (true) {
            System.out.println();
            System.out.println("Введите строку для добавления в список.");
            System.out.println("Введите 'print',чтобы вывести массив в обратном порядке.");
            System.out.println("Введите 'revert', для удаления предыдущей введенной строки из памяти.");
            System.out.println("Для выхода из программы введите 'q'. ");
            System.out.println();
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            // String[] strs = input.split("~");
            // String text = strs[0];
            // int num = Integer.parseInt(strs[1]);

            if (input.equals("print")) {
                for (int i = ll.size()-1; i >= 0; i--) {
                    System.out.printf("%s ", ll.get(i));
                }
                System.out.println();
            } 
            else if (input.equals("revert")) {
                //Проверим список на пустоту
                if(!ll.isEmpty()){
                    System.out.printf("Удаленная строка: %s",ll.removeLast());
                } else {System.out.println("Список пустой, удалять нечего!");}
                System.out.println();
                System.out.println(ll);
            } else {
                System.out.printf("Добавили в список элемент: %s", input);
                ll.add(input);
                System.out.println();
                System.out.println(ll);
            }
                //System.out.println(ll);

        }
        scanner.close();
    }
}

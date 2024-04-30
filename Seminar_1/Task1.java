/*==================Задание №1==========================
📌 Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
📌 Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”
 */

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    System.out.println();
    // Вывести в консоль системные дату и время:
    System.out.println(LocalDateTime.now());
    System.out.println();

    // запросит пользователя ввести <Имя> в консоли
    System.out.println("Представьтесь, пожалуйста: ");
    Scanner scanner = new Scanner(System.in, "ibm866");
    String name = scanner.nextLine(); // получение строки с консоли и сохранение ее в новую переменную

    // вывести в консоль сообщение “Привет, <Имя>!”
    System.out.println("Привет, " + name + "!");
    System.out.printf("Привет, %s!", name);

    scanner.close();
  }
}

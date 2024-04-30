/*=================Задание №1+==========================
 * 📌 В консоли запросить имя пользователя. В зависимости от
 * текущего времени, вывести приветствие вида
 * 📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * 📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * 📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * 📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task1_dop {

  public static void main(String[] args) {
    System.out.println();

    // Вывести в консоль системные дату и время:
    System.out.println(LocalDateTime.now());
    System.out.println();

    // запросит пользователя ввести <Имя> в консоли
    System.out.println("Представьтесь, пожалуйста: ");
    Scanner scanner = new Scanner(System.in, "ibm866");
    String name = scanner.nextLine(); // получение строки с консоли и сохранение ее в новую переменную

    String s1;
    int Hour = LocalDateTime.now().getHour();

    // вывести в консоль сообщение в зависимости от времени
    if (Hour == 23 || Hour < 5)
      s1 = "Доброй ночи";
    else if (Hour < 12)
      s1 = "Доброе утро";
    else if (Hour < 18)
      s1 = "Добрый день";
    else
      s1 = "Добрый вечер";

    System.out.println(s1 + ", " + name + "!");

    scanner.close();
  }
}

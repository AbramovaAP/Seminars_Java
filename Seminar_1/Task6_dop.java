/*=====================Задание №6 (доп)==============================
📌 Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
📌 Пример 1: а = 3, b = 2, ответ: 9
📌 Пример 2: а = 2, b = -2, ответ: 0.25
📌 Пример 3: а = 3, b = 0, ответ: 1
 */

import java.util.Scanner;

public class Task6_dop {
    public static void main(String[] args) {
    // Считываем данные, два числа и опепратор:
    Scanner iScanner = new Scanner(System.in);
    Scanner oScanner = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    double a = iScanner.nextDouble();
    System.out.println("Введите второе число: ");
    double b = iScanner.nextDouble();
    iScanner.close();
    oScanner.close();

    double res = Math.pow(a, b);
    System.out.printf("Результат возведения числа %.2f в степень %.2f = %.2f", a, b, res);
    }
}

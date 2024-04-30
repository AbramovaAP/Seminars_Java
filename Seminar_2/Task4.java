/*
 * ---------------------------------Задание №4-------------------------------------------
📌 Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */

import java.io.FileWriter;

public class Task4 {
    public static void main(String[] args) {
        String str = "TEST";
        int count = 100;
        //System.out.println(repeatWord(str, count)); // Вывод из метода №1
        //Сохраним строку в новую пкеременную:
        String resWords = repeatWord(str, count);
        writeToFile(resWords, "Test.txt"); //Данные успешно записаны в файл
        writeToFile(resWords, ".");//Ошибка записи в файл!

    }
// Метод №1, который составит строку, состоящую из 100 повторений слова TEST:
    public static String repeatWord(String str, int count) {
        StringBuilder StrBld = new StringBuilder();
        for (int i = 0; i < count; i++){
            StrBld.append(str).append(" ");
        }
        return StrBld.toString();
    }

// Метод №2, который запишет эту строку в простой текстовый файл:
    public static void writeToFile(String str, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile)) {
            fw.write(str);
            System.out.println("Данные успешно записаны в файл");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ошибка записи в файл!");
        }
    }
}

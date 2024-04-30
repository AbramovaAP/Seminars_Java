/*--------------------Задача 6-------------------------  
 * Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг
прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
одинаковой длиной не должны “потеряться”.
*/
package Seminar_5;

import java.util.Map;
import java.util.TreeMap;

public class Task6 {
    
    public static void main(final String[] args) {
        String str = "мама Папа папа привет пок g";
        Map<Integer, String> map = new TreeMap<>();
        for (String i : str.split(" ")) {
            map.put(i.hashCode(), i);
        }
        System.out.println(getSortedIncludesWords(map)); //Вывод: g пок Папа мама папа привет
    }

    public static String getSortedIncludesWords(final Map<Integer, String> map) {
        return String.join(" ", map.values());
    }

}


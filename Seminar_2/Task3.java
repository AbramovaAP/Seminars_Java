/*
 * -----------------------------Задание №3------------------------------------------
📌 Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
 */

import java.util.Scanner;

public class Task3 { //с кириллицей код не работает
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ibm866");
        System.out.println("Задайте строку: ");
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str) ? "Является палиндромом" : "Не палиндром!");
        scanner.close();

    }
//1
    // public static boolean isPalindrome(String str) {
    //     for (int i = 0; i < str.length()/2; i++) {
    //         if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
//2 
    // public static void main(String[] args) {
    //     System.out.println(isPalindrom("radar"));
    //     System.out.println(isPalindrom("арозаупаланалапуазора"));
    //     System.out.println(isPalindrom("hello"));
    
    
    // }
    
    public static boolean isPalindrome(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

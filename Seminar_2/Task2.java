/*
 * ---------------------------------------Задание №2--------------------------------
📌 Напишите метод, который сжимает строку.
📌 Пример: вход aaaabbbcdd.
    Результат: a4b3c1d2
 */

public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.err.println(str);
        System.out.println(compress_String(str));
    }
    public static String compress_String(String str) {
        char ch = str.charAt(0);
        int count = 1;
        StringBuilder StrBld = new StringBuilder();
        for (int i = 1; i< str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            } else{
                StrBld.append(ch).append(count);
                count = 1;
                ch = str.charAt(i);
            }
        }
        StrBld.append(ch).append(count);
        return StrBld.toString();
    }

}

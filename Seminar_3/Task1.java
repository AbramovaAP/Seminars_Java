/*
---------------------Задача 1-------------------------
📌 Даны следующие строки, cравнить их с помощью == и
метода equals() класса Object
📌 String s1 = "hello";
📌 String s2 = "hello";
📌 String s3 = s1;
📌 String s4 = "h" + "e" + "l" + "l" + "o";
📌 String s5 = new String("hello");
📌 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */
public class Task1 {
    public static void main(String[] args) {
//Строки ВСЕГДА сравниваем через метод equals()
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2); //true, т.к для СТРОК знак "==" сравниваются *ссылки* на один и тот же объект в памяти 
        System.out.println(s1.equals(s2)); //true. equals - Сравнение
        System.out.println();

        System.out.println(s1 == s3); //true 
        System.out.println(s1.equals(s3)); //true
        System.out.println();

        System.out.println(s1 == s4); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println();

        System.out.println(s1 == s5); //false, т.к для СТРОК знак "==" сравниваются *ссылки* на объект в памяти 
        System.out.println(s1.equals(s5)); //true, т.к для СТРОК сравниваются сами *ЗНАЧЕНИЯ*
        System.out.println();

        System.out.println(s1 == s6); //false
        System.out.println(s1.equals(s6)); //true
        System.out.println();

        System.out.println(s5 == s6); //false
        System.out.println(s5.equals(s6)); //true
        System.out.println();
    }
}
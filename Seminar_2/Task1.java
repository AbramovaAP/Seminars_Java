/*
------------------------------Задание №1--------------------------------------
📌 Дано четное число N (>0) и символы c1 и c2.
📌 Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 500_000;
        char c1 = 'a', c2 = 'b';
        // System.out.println(task1_Str(n, c1, c2));
        // System.out.println(task1_StrBld(n, c1, c2));

        /*Проверим, какойй из методов работает быстрее?*/
        //1: для task1_Str(n, c1, c2)
        long start = System.currentTimeMillis(); //Зафиксируем начальное время
        task1_Str(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start); //Расчет, n = 500_000: текущее время - стартовое = 7101млс

        //2: для task1_StrBld(n, c1, c2)
        start = System.currentTimeMillis(); //Зафиксируем начальное время
        task1_StrBld(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start); //Расчет, n = 500_000: текущее время - стартовое = 10млс
    }
//1
    public static String task1_Str(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            // str += c1 + c2; // неправильный вывод:195195195195 в символах -> сособенность
            // java
            str = str + c1 + c2; // в java лучше писать таким образом, составной оператор в символах не работает
        }
        return str;
    }
//2
    /*Соберем строку с помощью метода StringBuilder.
     * Реализация метода StringBuilder похлжа на коллекцию, н-р динамический массив(
     * список).
     * У StringBuilder по умолчанию всегда идет в памяти 16 символов.
     */

    public static String task1_StrBld(int n, char c1, char c2) {
        StringBuilder StrBld = new StringBuilder(n); // заранее зарезервируем для этого метода необхожимое количесво
                                                     // символов
        for (int i = 0; i < n / 2; i++) {
            StrBld.append(c1).append(c2);
        }
        return StrBld.toString(); // чтобы вернуть необходимую строку
    }
}
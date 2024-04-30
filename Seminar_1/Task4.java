/*===================Задание №4==================================
📌 Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
📌 Если общего префикса нет, вернуть пустую строку "".
*/

//1.
// public class Task4 {
//     public static void main(String[] args) {
//         String[] strs = { "flower", "flow", "flight" }; // fl - общий префикс в трех словах
//         String prefix = strs[0]; // за префикс принимаем первую строку массива
//         for (int i = 0; i < strs.length; i++) {
//             // проверяем, есть ли вхождение элемента(строки:flow) массива в префикс
//             // (flower):
//             while (strs[i].indexOf(prefix) != 0) {
//                 // если вхождения нет, то от префикса (flower) отсекаем один символ, получаем
//                 // (flowe)
//                 // и снова идем в while и проверяем, есть ли вхождение элемента(строки:flow)
//                 // массива в префикс (flowe).
//                 prefix = prefix.substring(0, prefix.length() - 1);
//                 // как только flow == flow (часть слова от flower) выходим из цикла while.
//                 // .indexOf() - возвращает индекс вхождения строки в строку
//             }
//             if (prefix == ""){
//                 break;
//             }
//         }
//         System.out.println(prefix);
//     }
// }

//2.
public class Task4 {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String prefix = getPrefix(strs);
        System.out.println(prefix);
    }

    private static String getPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix == ""){
                return "";
            }
        }
        return prefix;
    }
}
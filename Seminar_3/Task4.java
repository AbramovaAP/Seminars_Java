/*
---------------------Задача 4-------------------------
📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.
 */

// //Решение 1 без метода
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Task4 {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>(Arrays.asList("s1", "s2", "123", "521", "s3", "214", "s4"));
//         for (int i = 0; i < list.size(); i++) {
//             if (isNumber(list.get(i))) {
//                 list.remove(i);
//                 i--;
//             }
//         }
//         System.out.println(list); //[s1, s2, s3, s4] - Из всего списка, остались только стороки
//     }

//     public static boolean isNumber(String str) {
//         try {
//             Integer.parseInt(str);
//             return true;
//         } catch (Exception e) {
//             return false;
//         }

//     }
// }

//Решение 2 используя метод
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("s1", "s2", "123", "521", "s3", "214", "s4"));

        deliteNumbers(list); // Запускаем метод
        System.out.println(list); // [s1, s2, s3, s4] - Из всего списка, остались только стороки

        deliteNumbersWhithIterator(list); // Запускаем метод, в котором использовался итератор
        System.out.println(list); // [s1, s2, s3, s4] 
    }

// Метод прохождения по списку, находим и удаляем целые числа.
    private static void deliteNumbers(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isNumber(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
    }

// Метод, с использованием ИТЕРАТОРА, прохождения по списку, находим и удаляем целые числа
    private static void deliteNumbersWhithIterator(List<String> list) {
        Iterator<String> iterator = list.iterator(); // .iterator() - метод, которые переберает элементы в списке list
                                                    // Отличие Iterator от Foreach, в том, что с помощью Iterator млжно удалить элементы,
                                                    //а с помощью Foreach - нельзя удалить элементы
        while(iterator.hasNext()) {
            String str = iterator.next();
            if (isNumber(str)) {
                iterator.remove(); //.remove() - оператор удаления текущего элемента
            }
        } 
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
/*=================Задача 4 ======================
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
использовать не все придуманные поля и методы. Создайте несколько
экземпляров этого класса, выведите их в консоль.

2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
 */
package Seminar_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Eva", 6, "Black", "Ж");
        Cat cat2 = new Cat("Felix", 5, "Black-White", "M");
        cat1.eatCat();
        Cat.getCount();
        List<Cat> listCat = new ArrayList<>(Arrays.asList(cat1, cat2));
        System.out.println(listCat);
        Map<Integer, Cat> mapCat = new TreeMap<>();
        for (Cat item : listCat) {
            mapCat.put(item.idCheap, item);
        }
        System.out.println(mapCat);
    }
}


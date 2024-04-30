/*=================Задача 3 ======================
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
package Seminar_6;

public class Cat {
    String name;
    int age;
    String colour;
    String sex;
    int idCheap;

    static int count = 0;

    Cat(String name, int age, String colour, String sex) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.sex = sex;
        this.idCheap = count + 1;
        setCount();
    }

    public void setCount() {
        count += 1;
    }

    public void freshCat() {
        System.out.println(this.name + " моется");
    }

    public void eatCat() {
        System.out.println(this.name + " кушает");
    }

    public void walkCat() {
        System.out.println(this.name + " гуляет");
    }

    public static void getCount() {
        System.out.println("Котиков - " + count);
    }

    public String toString() {
        return "Котик №%d: кличка - %s, возраст - %d, цвет - %s, пол - %s".formatted(this.idCheap, this.name, this.age, this.colour, this.sex);
    }
}

/*
---------------------Задача 3-------------------------
3.1
📌 Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
📌 Вывести название каждой планеты и количество его
повторений в списке.

3.2 (если выполнено первое задание)
📌 Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        List<String> planetList = getPlanetList();// - 1. Метод создания списка, состоящий из названия планет
        System.out.println(planetList); // Вывод исходного списка

        getRepeatPlanets(planetList); // - 2. Метод сортировки первоначального списка и подсчета количества повторяющихся планет
        System.out.println();

        removeRepeatElem1(planetList); // - 3. Пройти и удалить повторяющиеся элементы
        System.out.println(planetList); // Вывод списка, без повторяющихся элементов


    }

//1. Метод сортировки первоначального списка и подсчета количества повторяющихся планет:
    private static void getRepeatPlanets(List<String> planetList) {
        //Создаем новый массив, который будет содержать в себе отсортированный массив planetList:
                List<String> sortPlanetList = new ArrayList<>(planetList);
                Collections.sort(sortPlanetList); //Отсортировываем массив по алфавиту
                //System.out.println(sortPlanetList); //Вывод отсортированного массива по алфавиту
        
        //Вывести название каждой планеты и количество его повторений в списке
                String planetName = sortPlanetList.get(0);//переменная в которой содержится имя планетыдля ее подсчета в списке
                int count = 0;
        
                for (int i = 0; i < sortPlanetList.size(); i++) {
                    if (sortPlanetList.get(i).equals(planetName)) {
                        count++;
                    } else{
                        System.out.printf("%s: %d;\n", planetName, count); // Вывод всех элементов отсортированного массива, кроме крайнего
                        count = 1;
                        planetName = sortPlanetList.get(i);
                    }
                }
                System.out.printf("%s : %d", planetName, count); //Вывод крайнего элемента отсортированного массива
    }

//2. Метод создания списка, состоящий из названия планет:
    private static List<String> getPlanetList() {
        List<String> planetList = new ArrayList<>();
        planetList.add("Меркурий");
        planetList.add("Венера");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");
        planetList.add("Сатурн");
        planetList.add("Уран");
        planetList.add("Нептун");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");
        planetList.add("Земля");
        return planetList;
    }

//3.1 Пройти и удалить повторяющиеся элементы:
    public static void removeRepeatElem1(List<String> planetList) {
        for (int i = 0; i < planetList.size(); i++) {
            String planet = planetList.get(i);
            for (int j = 0; j < i; j++) {
                if(planetList.get(j).equals(planet)) { //сравниваем все элементы с одной планетой
                    planetList.remove(i);
                    i--;
                }
            }
        }
    }

//3.2 Пройти и удалить повторяющиеся элементы: (ВАРИАНТ 2)
    public static void removeRepeatElem2(List<String> planetList) {
        for (int i = 0; i < planetList.size(); i++) {
            String planet = planetList.get(i);
            for (int j = i + 1; j < planetList.size(); j++) {
                if(planetList.get(j).equals(planet)) { //сравниваем все элементы с одной планетой
                    planetList.remove(j);
                    j--;
                }
            }
        }
    }

//3.3 Пройти и удалить повторяющиеся элементы: (ВАРИАНТ 3)
public static void removeRepeatElem3(List<String> planetList) {
    for (int i = 0; i < planetList.size(); i++) {
        String planet = planetList.get(i);
        for (int j = planetList.size() - 1; j > i; j--) {
            if(planetList.get(j).equals(planet)) { //сравниваем все элементы с одной планетой
                planetList.remove(j);
            }
        }
    }
}
}
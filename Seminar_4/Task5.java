/*---------------------Задача 5-------------------------
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
*/

package Seminar_4;

public class Task5 {
    private static int[] stackArray;
    private static int capacity;
    private static int top;

    public static void main(String[] args) {
        capacity = 5;
        stackArray = new int[capacity];
        top = -1;
        
        System.out.println(size()); // проверяем пустой массив или нет, выводит количество элементов в массиве
        System.out.println(empty()); // если пустой то true, иначе false
        push(5);  // добавляем элементы:
        push(3);
        push(8);
        System.out.println(size()); // проверяем пустой массив или нет, выводит количество элементов в массиве
        System.out.println(empty()); // если пустой то true, иначе false
        System.out.println(peek()); // возвращает крайний добавленный элемент
        System.out.println(pop()); // возвращает крайний добавленный элемент массива и удаляет его из списка
        System.out.println(size()); // проверяем пустой массив или нет, выводит количество элементов в массиве
    }

    public static int size() {
        return top + 1;
    }
    
    public static boolean empty() {
        return top == -1;
    }

    public static void push(int value) {
        // stackArray[top+1] = value;
        // top++;
        //Другая запись двух верхних строк:
        stackArray[++top] = value; //сначало увеличиваем top на единицу, а потом только применяем
    }

//Нужно добавить метод reSize() для автоматического расширения массива stackArray 
// при методе push, сначала проверить, что массив заполнен top = capacity-1, 
//а потом при добавлении в него элементов, увеличивать размер,
// т.е. создаем новый массив на большее количество элементов, 
// копируем в него значения из старого массива и добавляем новые элементы

// Добавить метод printStackArray, чтобы выводить массив до изменений 
// и после изменений для большей наглядности и сравнения
// см. крайний метод задачи №4:
/*// метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
    public static void printQueue(int[] arr) {
        Queue<Integer> ll = new LinkedList();
        for (int elem : arr) {
            ll.add(elem);
        }
        while (!ll.isEmpty()) {
            System.out.print(ll.remove());
            System.out.print(" ");
        }
    }
 */


    public static int peek() {
        return stackArray[top];
    }

    public static int pop() {
        return stackArray[top--]; //сначало применяем top, а потом уменьшаем его на единицу
    }
}

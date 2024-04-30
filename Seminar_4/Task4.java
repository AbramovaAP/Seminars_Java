/*---------------------Задача 4-------------------------
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.
*/

package Seminar_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5, 3, 6, 54};
        printStack(arr);
        printQueue(arr);
    }

 // метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
    public static void printStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int elem : arr) {
            stack.push(elem);
        }
        System.out.println();
        while (!stack.empty()) {
            System.out.print(stack.pop());
            System.out.print(" ");
            
        }
        System.out.println();
    }

// метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
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
}

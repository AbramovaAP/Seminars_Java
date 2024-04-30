
/*========================Задание №8 (доп)==========================
📌 Задан массив, например, nums = [1,7,3,6,5,6].
📌 Написать программу, которая найдет индекс i (индекс равновесия) для этого массива
такой, что сумма элементов с индексами < i равна сумме
элементов с индексами > i.
 */
import java.util.ArrayList;
import java.util.List;

public class Task8_dop {
    public static void findEquilibriumIndex(int A[]) {
        // `left[i]` хранит сумму элементов подмассива `A[0...i-1]`
        int left[] = new int[A.length];

        left[0] = 0;

        // перебрать массив слева направо
        for (int i = 1; i < A.length; i++) {
            left[i] = left[i - 1] + A[i - 1];
        }

        // `right` хранит сумму элементов подмассива `A[i+1...n)`
        int right = 0;

        // введение списка индексов
        List<Integer> indices = new ArrayList<>();

        // перебрать массив справа налево
        for (int i = A.length - 1; i >= 0; i--) {
            if (left[i] == right) {
                indices.add(i);
            }
            // new right is `A[i] + (A[i+1] + A[i+2] + … + A[n-1])`
            right += A[i];
        }

        System.out.println("Равновесный индекс, найденный на позиции/ях " + indices);
    }
    public static void main(String[] args) {
        int[] A = { 1, -3, 5, -4, -2, 3, 1, 0 };
        findEquilibriumIndex(A);
    }
}

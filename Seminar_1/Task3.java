/*==================Задание №3=======================
📌 Дан массив nums = [3,2,2,3] и число val = 3.
📌 Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
📌 Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3, 1, 5, 6, 7, 8, 7, 4, 2};
        int val = 7;
        int right_index = nums.length-1;
        for (int left_index = 0; left_index < right_index; left_index++) {
            while (nums[right_index] == val && left_index < right_index) {
                right_index--;
            }
            if (nums[left_index] == val) {
                nums[left_index] = nums[right_index];
                nums[right_index] = val;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}

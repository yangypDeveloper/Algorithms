/**
 * 插入排序
 * 时间复杂度:O(n^2)
 * 空间复杂度:总共O(n),需要辅助空间O(1)
 */
public class Insertion {
    static void insertion_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j-1] <= arr[j]) {
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 13;
        arr[2] = 5;
        arr[3] = 2;
        insertion_sort(arr);
        System.out.println(arr[1]);

    }
}

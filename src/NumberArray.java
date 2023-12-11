import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int N = array.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xoá (X): ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }

            N--;
            int[] newArray = new int[N];
            System.arraycopy(array, 0, newArray, 0, N);

            System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        }
    }
}
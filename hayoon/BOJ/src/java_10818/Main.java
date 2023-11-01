package java_10818;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(array);
        System.out.print(array[0] + " " + array[N - 1]);
    }
}
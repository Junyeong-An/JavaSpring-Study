package java_10807;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        for(int j = 0; j < array.length; j++){
            if(b == array[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class EX0703 { // 発展課題7-3
    public static void main(String args[]) {
        int[] data = { 1, 3, 4, 6, 7, 8, 10 };
        System.out.print("探索する値を入力してください: ");
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int[] counter = { 0, 1, 2, 3, 4, 5, 6 };
        if (Arrays.binarySearch(data, key) == -1) {
            System.out.println(key + "はdataに含まれていません");
        } else {
            System.out.println(key + "は" + Arrays.binarySearch(data, key) + "にあります");
        }
    }
}
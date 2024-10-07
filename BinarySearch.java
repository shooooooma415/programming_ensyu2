import java.util.Scanner;

public class BinarySearch { //必須課題7-2
    static int search(int[] data, int key) {
        int n = data.length; // n は登録データ数
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (key == data[middle])
                return middle;
            else if (key < data[middle])
                high = middle - 1;
            else // key > table[middle].key である
                low = middle + 1;
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] data = { 1, 3, 4, 6, 7, 8, 10 };
        System.out.print("探索する値を入力してください: ");
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        if (search(data, key) == -1) {
            System.out.println(key + "はdataに含まれていません");
        } else {
            System.out.println(key + "は" + search(data, key) + "にあります");
        }
    }
}
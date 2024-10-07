import java.util.Scanner;

public class LinearSearch {
    static int search(int[] data, int key) {
        int n = data.length; // n は登録データ数
        int i = 0;
        while (i < n) {
            if (data[i] == key)
                return (i);
            i++;
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

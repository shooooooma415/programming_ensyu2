import java.util.Scanner;
import java.util.ArrayList;

public class HashSearch { //発展課題7-4
    private static int hashValue = 50; //ハッシュ値を50に設定
    private static int[] hashTable;
    private static int[] data_index;

    // ハッシュテーブルの初期化するメソッド
    private static void initializeHashTable(int[] data) {
        hashTable = new int[hashValue];
        // -1 を使用してハッシュテーブルの空きエントリを示す
        for (int i = 0; i < hashValue; i++) {
            hashTable[i] = -1;
        }
        // データをハッシュテーブルに挿入
        for (int value : data) {
            int hash = value % hashValue; //各要素のハッシュ値を計算
            hashTable[hash] = value;
            ;
        }
    }

    // データの検索
    private static int search(int key) { //ここの考え方は必須課題と同じ
        int hash = key % hashValue;
        if (hashTable[hash] == key) {
            return hash; //ここ変える
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        int[] data = {821, 1, 509, 203, 702, 305, 319, 428, 798, 634};

        // ハッシュテーブルの初期化
        initializeHashTable(data);

        // ユーザーからの入力を受け取る
        Scanner scan = new Scanner(System.in);
        System.out.print("探索する値を入力してください: ");
        int key = scan.nextInt();

        // データの検索
        int result = search(key);
        if (result == -1) {
            System.out.println(key + "はdataに含まれていません");
        } else {
            System.out.println(key + "は" + result + "にあります");
        }
    }
}

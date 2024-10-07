import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1106 {

    // メインメソッド: プログラムのエントリーポイント
    public static void main(String[] args) {
        // 引数が1つでない場合は、使い方を表示して終了
        if (args.length != 1) {
            System.out.println("Usage: java Ex1106 <filename>");
            return;
        }

        // ファイル名を取得
        String filename = args[0];
        // 単語を格納するリストを作成
        ArrayList<String> words = new ArrayList<>();

        // ファイルを読み込み、単語を抽出する
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // ファイルから1行ずつ読み込む
            while ((line = br.readLine()) != null) {
                // 行をトークンに分割
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    // 各トークンをリストに追加
                    words.add(st.nextToken());
                }
            }
        } catch (IOException e) {
            // ファイル読み込み中にエラーが発生した場合の処理
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // リストを配列に変換
        String[] wordArray = words.toArray(new String[0]);
        int size = wordArray.length;

        // コピー用の配列を作成
        String[] copy1 = new String[size];
        String[] copy2 = new String[size];

        // 配列をコピー
        System.arraycopy(wordArray, 0, copy1, 0, size);
        System.arraycopy(wordArray, 0, copy2, 0, size);

        System.out.println("1: "+copy1.length+", 2:"+copy2.length);

        // long startTime1, endTime1, startTime2, endTime2;

        // QuickSortでソート
        long startTime = System.nanoTime();
        StringSort.quickSort(copy1);
        long endTime = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // System.out.println(copy1[0]);
        // System.out.println(copy2[0]);

        // ShellSortでソート
        startTime = System.nanoTime();
        StringSort.shellSort(copy2);
        endTime = System.nanoTime();

        //  // ソートされた単語を順番に表示
        // for (String word : copy2) {
        //     System.out.println(word);
        // }
        System.out.println("Shell Sort Time: " + (endTime - startTime) / 1000000.0 + " ms");
    }
}
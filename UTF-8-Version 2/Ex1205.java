import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Ex1205 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex1205 <filename>");
            return;
        }

        String filename = args[0];
        String[] words = readWordsFromFile(filename);

        if (words == null) { //エラー対策
            System.err.println("Failed to read words from file.");
            return;
        }

        // マージソートで単語を辞書順にソート
        long startTime = System.nanoTime();
        // StringSortから呼び出し
        StringSort.mergeSort(words);
        long endTime = System.nanoTime();

        // ソート後の単語を表示
        System.out.println("\nSorted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // ファイルから読み込んだ単語数を表示
        System.out.println("Number of words read: " + words.length);

        // 処理時間を表示
        long elapsedTime = endTime - startTime;
        System.out.println("\nElapsed time: " + elapsedTime + " ns");
    }

    // ファイルから単語を読み込むメソッド
    private static String[] readWordsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            return sb.toString().split("\\s+"); // 空白で分割した単語配列を返す
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }
}

import java.util.Random;

public class TestEx1006 {
    public static void main(String[] args) {
        int size = 20; // 配列の要素数を指定
        double[] array = new double[size];
        double[] copy1 = new double[size];
        double[] copy2 = new double[size];
        double[] copy3 = new double[size];

        // 乱数生成器の初期化
        Random rand = new Random();

        // 配列に乱数をセット
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble() * 10000;
        }

        // 配列のコピー
        System.arraycopy(array, 0, copy1, 0, size);
        System.arraycopy(array, 0, copy2, 0, size);
        System.arraycopy(array, 0, copy3, 0, size);

        // 元の配列を表示
        System.out.println("元の配列:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]:" + array[i]);
        }

        // 選択ソートの処理時間を測定
        long startTime = System.nanoTime();
        DoubleSort.selectionSort(array);
        long endTime = System.nanoTime();
        System.out.println("Selection Sort Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // ソート結果を表示
        System.out.println("Selection Sort結果:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]:" + array[i]);
        }

        // バブルソートの処理時間を測定
        startTime = System.nanoTime();
        DoubleSort.bubbleSort(copy1);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // ソート結果を表示
        System.out.println("Bubble Sort結果:");
        for (int i = 0; i < copy1.length; i++) {
            System.out.println("[" + i + "]:" + copy1[i]);
        }

        // 挿入ソートの処理時間を測定
        startTime = System.nanoTime();
        DoubleSort.insertionSort(copy2);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // ソート結果を表示
        System.out.println("Insertion Sort結果:");
        for (int i = 0; i < copy2.length; i++) {
            System.out.println("[" + i + "]:" + copy2[i]);
        }

        // 改良したバブルソートの処理時間を測定
        startTime = System.nanoTime();
        DoubleSort.bubbleSort(copy3);
        endTime = System.nanoTime();
        System.out.println("Improvement Bubble Sort Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // ソート結果を表示
        System.out.println("Improvement Bubble Sort結果:");
        for (int i = 0; i < copy3.length; i++) {
            System.out.println("[" + i + "]:" + copy3[i]);
        }

    }

}
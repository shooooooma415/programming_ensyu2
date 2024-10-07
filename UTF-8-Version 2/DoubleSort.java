public class DoubleSort { // 10-6
    private DoubleSort() { // DoubleSortクラスのオブジェクトを作成できないようにする
    }

    public static void selectionSort(double[] targetArray) {
        System.out.println("====[ Selection Sort ]====");

        int n = targetArray.length;
        for (int s = 0; s < n - 1; s++) {
            int minIndex = s;
            for (int j = s + 1; j < n; j++) {
                if (targetArray[j] < targetArray[minIndex]) {
                    minIndex = j;
                }
            }
            // 見つかった最小の要素と現在の要素を交換
            double temp = targetArray[minIndex];
            targetArray[minIndex] = targetArray[s];
            targetArray[s] = temp;

        }
    }

    public static void bubbleSort(double[] a) {
        System.out.println("====[ Bubble Sort ]====");
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) { // 配列の後ろから先頭へ
                if (a[j - 1] > a[j]) {
                    double temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(double[] a) {
        System.out.println("====[ Insertion Sort ]====");
        int n = a.length; // 配列の要素数
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && a[j - 1] > a[j]) { // 隣同士を比べて
                double temp = a[j]; // 適切な位置まで
                a[j] = a[j - 1]; // 交換していく
                a[j - 1] = temp;
                j--;
            }
        }
    }

    public static void ImprovementBubbleSort(double[] a) {
        System.out.println("====[ Improvement Bubble Sort ]====");
        int n = a.length;
        int h = n;
        while (h > 1) {
            h = (int) Math.floor(h / 1.3); // 間隔を1.3で割る
            if (h < 1) {
                h = 1;
            }
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i + h < n; i++) {
                    if (a[i] > a[i + h]) {
                        double temp = a[i];
                        a[i] = a[i + h];
                        a[i + h] = temp;
                        swapped = true;
                    }
                }
            }
        }
    }
}

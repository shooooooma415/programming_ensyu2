public class DoubleStack {
    private double[] dataArray; // データを格納する配列
    private int sp; // スタックポインタ = 格納されているデータの個数
    public DoubleStack(int maxSize) { // コンストラクタ
        dataArray = new double[maxSize];// ここでデータを格納する配列の領域を確保し，初期化
        sp = 0;// スタックポインタを初期化
    }

    public boolean isFull() {// 練習課題3-2
        return sp >= dataArray.length;
    }

    public boolean isEmpty() {// 練習課題3-2
        return sp == 0;
    }

    public int size() {// 練習課題3-3
        return sp;
    }

    public void show() {// 練習課題3-3
        if (isEmpty()) {
            System.err.println("スタックは空です");// もし空であれば表示させる
        }
        for (int n = 0; n < sp; n++) {
            System.out.println("[" + n + "]:" + dataArray[n]);
        }
    }

    public void push(double x) {// 練習課題3-4
        if (isFull()) {
            System.err.println("スタックは一杯です");
            // 指定した要素数を上回ろうとすればスタックがいっぱいであることをエラー表示
            return;
        }
        dataArray[sp++] = x;// 要素の追加
    }

    public double pop() {// 練習課題3-5
        if (isEmpty()) {
            System.err.println("スタックは空です");
            return Double.NaN;
        }
        return dataArray[--sp];
    }

    public void clear() {// 練習課題3-6
        sp = 0;// データ格納数を０にすることで，全ての要素を削除する
    }

    public void extend(int x) {//発展課題3-7(非効率な気がしてあまり自信なし)
        int extend = x + dataArray.length;
        double[] extendDataArray = new double[extend];// 拡張した新しい配列を用意
        for (int i = 0; i < sp; i++) {
            extendDataArray[i] = dataArray[i];// 入れ直し
        }
        dataArray = extendDataArray;// dataArrayをextendDataArrayに上書き
    }
}
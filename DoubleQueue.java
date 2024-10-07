public class DoubleQueue {
    private double[] dataArray; // データを格納する配列
    private int front; // 先頭
    private int rear; // 末尾
    private int maxSize;

    public DoubleQueue(int maxSize) { // コンストラクタ
        dataArray = new double[maxSize + 1]; // ここでデータを格納する配列の領域を確保し，初期化
        front = 0; // 先頭を初期化
        rear = 0; // 末尾を初期化
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return (rear + 1) % dataArray.length == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int size() {
        if (rear >= front) {
            return rear - front;
        } else {
            return dataArray.length - front + rear;
        }
    }

    public void show() {
        if (isEmpty()) {
            System.err.println("キューは空です");// もし空であれば表示させる
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.println("Array[" + i + "]:" + dataArray[i]);
            i = (i + 1) % dataArray.length;
        }
    }

    public void enqueue(double x) { //必須課題4-4
        if (isFull()) {
            System.err.println("キューは一杯です");
            return; // キューが一杯の場合はデータを追加せずにメソッドを終了する
        }
        dataArray[rear] = x;
        rear = (rear + 1) % dataArray.length;
    }

    public double dequeue() { //必須課題4-5
        if (isEmpty()) {
            System.err.println("キューは空です");
            return Double.NaN;
        }
        double data = dataArray[front];// 先に取り出したい要素を違う変数に置き換えておく
        front = (front + 1) % dataArray.length; // frontがmaxSizeを超えたら0に戻る
        return data;
    }

    public void clear() { //練習課題4-6
        front = 0;
        rear = 0;
    }

    public void extend(int x) { //発展課題4-7
        int extendMaxSize = maxSize + x;
        int currentSize = size(); // 現在の要素数
        double[] extendDataArray = new double[extendMaxSize + 1];// 拡張した新しい配列を用意
        if (rear >= front) {
            for (int i = front; i < rear; i++) {
                extendDataArray[i] = dataArray[i];// 入れ直し
            }
            rear = currentSize; // rear を上書き
        } else {
            int j = 0;
            for (int i = front; i <= maxSize; i++) {
                extendDataArray[j++] = dataArray[i];// 入れ直し
            }
            for (int i = 0; i < rear; i++) {
                extendDataArray[j++] = dataArray[i];// 入れ直し
            }
            rear = currentSize; // rear を上書き
        }
        dataArray = extendDataArray;// dataArrayをextendDataArrayに上書き
        maxSize = extendMaxSize; // maxSize を更新
        front = 0;
    }

    public void extendEnqueue(double x) { //発展課題4-7
        if (isFull()) {
            extend(10); // 待ち行列の容量を10増やす
            dataArray[rear] = x; // データを挿入
            rear = (rear + 1) % dataArray.length; // rear を更新
        } else {
            enqueue(x); // キューが満杯でない場合は通常の enqueue メソッドを呼ぶ
        }
    }
}
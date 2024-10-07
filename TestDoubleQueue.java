public class TestDoubleQueue {
    public static void main(String[] args) {

        DoubleQueue testQueue = new DoubleQueue(5);
        for (int i = 0; i < 5; i++) { // データを5個追加
            testQueue.enqueue(i * 0.5 + 1);

            testQueue.show();

            // 拡張する
            testQueue.extend(3);
            System.out.println("拡張しました");
            testQueue.show();

            for (int i = 0; i < 8; i++) { // データを5個追加
                testQueue.enqueue(i * 0.5 + 1);
            }
            // 拡張後のキューの状態を表示
            System.out.println("拡張後のキューの状態:");
            testQueue.show();

        }
    }
}
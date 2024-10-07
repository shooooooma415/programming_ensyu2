public class TestDoubleStack {
    public static void main(String[] args) {
        // DoubleStackのインスタンスを生成(サイズは5で)
        DoubleStack testStack = new DoubleStack(5);
        // スタックにデータを5個追加
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        // 現在のスタックを表示
        testStack.show();
        System.out.println("格納データ数 : " + testStack.size());
        // さらにスタックに追加すると？
        testStack.push(5);
        System.out.println("格納データ数 : " + testStack.size());

        // // 空になるまでポップする
        // int count = 0;
        // while (!testStack.isEmpty()) {
        // System.out.println(count + " : " + testStack.pop());
        // count++;
        // }
        // // スタックが空でDouble.NaNが返れば正解
        // System.out.println("さらにpop : " + testStack.pop());

        // // 現在のスタックを表示
        // testStack.show();
        // System.out.println("格納データ数 : " + testStack.size());
        // // データクリア
        // testStack.clear();
        // System.out.println("クリア後データ数 : " + testStack.size());
        testStack.extend(5);// 格納数を拡張
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        System.out.println("格納データ数 : " + testStack.size());
        testStack.push(5);
    }
}
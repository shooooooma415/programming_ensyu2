public class IntBinTree {
    IntBinTree left; // 左部分木(左の子)
    IntBinTree right; // 右部分木(右の子)
    int label; // この節のラベル

    public IntBinTree(int label, IntBinTree left, IntBinTree right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    static void traversePreorder(IntBinTree p) {
        if (p == null) {
            return;
        }
        System.out.println(p.label);
        traversePreorder(p.left);
        traversePreorder(p.right);
    }

    public static void main(String[] args) { // 投げ込んだメインメソッド
        IntBinTree tree = new IntBinTree(2,
                new IntBinTree(1, null, null),
                new IntBinTree(3, null, null));
        System.out.println("行きがけ順のなぞり");
        traversePreorder(tree);
    }
}
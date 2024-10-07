public class StudentBinTree {
    StudentBinTree left; // 左部分木(左の子)
    StudentBinTree right; // 右部分木(右の子)
    int label; // この節のラベル
    String labelName;

    public StudentBinTree(int label, String labelName, StudentBinTree left, StudentBinTree right) {
        this.label = label;
        this.labelName = labelName;
        this.left = left;
        this.right = right;

    }

    static void traversePreorder(StudentBinTree p) { // 必須課題6-4
        if (p == null) { // 終端に達したら0を返すように
            return;
        }
        System.out.println(p.label + " " + p.labelName);
        traversePreorder(p.left); // 再帰処理を行う
        traversePreorder(p.right);
    }

    static int getHeight(StudentBinTree p) { // 発展課題6-5
        if (p == null) {
            return 0; // 終端に達したら0を返すように
        }
        int leftHeight = getHeight(p.left); // 再帰処理を行う
        int rightHeight = getHeight(p.right);
        return Math.max(leftHeight, rightHeight) + 1; // 右左を比較して，大きい方を取って1足す
    }

    static void printTree(StudentBinTree p) { // 挑戦課題6-7
        int height = getHeight(p); // 深さを取得
        int width = (int) Math.pow(2, height) - 1; // 最下層の幅を取得
        String[][] res = new String[height][width]; // 行列を用意
        for (String[] line : res) {
            java.util.Arrays.fill(line, "   "); // 一旦全てを空白で埋める
        }
        fill(res, p, 0, 0, width - 1);
        for (String[] line : res) {
            System.out.println(String.join(" ", line));
        }
    }

    static void fill(String[][] res, StudentBinTree p, int depth, int left, int right) { // 二次元配列をprintTreeで表示させるために導入
        if (p == null) {
            return;
        }
        int mid = (left + right) / 2; // 根の位置を決める，真ん中に表示させれるように
        res[depth][mid] = Integer.toString(p.label); // depthは行，midは列で，二次元配列として表示させる行列の準備
        fill(res, p.left, depth + 1, left, mid - 1); // 左の子ノードに対して再帰呼び出しを行う．深さを1増やし、左端と中間の-1を新しい範囲として渡す
        fill(res, p.right, depth + 1, mid + 1, right); // 右の子ノードに対して再帰呼び出しを行う．深さを1増やし，中間の+1と右端を新しい範囲として渡す．
    }

    public static void main(String[] args) { // 投げ込んだメインメソッド
        StudentBinTree tree = new StudentBinTree(5, "Kinugasa Natsuko",
                new StudentBinTree(2, "Jouri Haruko",
                        new StudentBinTree(1, "Risumei Taro", null, null),
                        new StudentBinTree(3, "Kusatsu Jiro", null, null)),
                new StudentBinTree(8, "Ibaraki Saburo", null, null));

        System.out.println("行きがけ順のなぞり");
        traversePreorder(tree);
        System.out.println("--------------------");
        System.out.println("最大の深度は " + getHeight(tree));
        System.out.println("--------------------");
        printTree(tree);

    }

}
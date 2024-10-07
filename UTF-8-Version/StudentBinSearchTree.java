/*
 *    プログラミング演習２
 *
 *    第8回演習
 *
 *    StudentBinSearchTree.java
 *
 *    雛形：学生の情報を対象とした二分探索木
 */

public class StudentBinSearchTree {

  private StudentNode root; // 二分探索木の根

  /*
   * 空の二分探索木を作成
   */
  public StudentBinSearchTree() {
    this.root = null; //初期化
  }

  public StudentNode search(int id) {
    StudentNode p = root;
    while (p != null) {
      int result = p.getData().compareTo(new StudentData(id, "")); //””は空文字列，resultに比較結果が入る
      if (result == 0) { // ノードとキーが等しい場合
        return p;
      } else if (result < 0) { // キーが小さいので左に移動
        p = p.left;
      } else { // キーが大きいので右に移動
        p = p.right;
      }
    }
    return null;// 下まで探しきってもない -> 存在しない -> nullを返す
  }

  public boolean insert(StudentData target) {// 差し込めた -> true 失敗 -> false
    StudentNode newNode = new StudentNode(target);
    if (root == null) { // 木が空の場合 -> 入れれる
      root = newNode;
      return true;
    }
    StudentNode p = root; // 根に注目して移動させていく
    StudentNode parent = null; // 注目するノードの親.初期値はnull
    boolean isLeftChild = false; // parent の左の子かどうか判断する

    // 挿入場所を探す
    while (p != null) { // 注目するノードがある限りループ
      parent = p;
      int result = target.compareTo(p.getData()); //この辺はsearchメソッドの構造と同じ

      if (result == 0) { // ノードとキーが等しい場合
        return false; // 重複するキーの挿入は失敗
      } else if (result < 0) { // キーが小さいので
        isLeftChild = true;
        p = p.left;
      } else { // キーが大きいので
        isLeftChild = false;
        p = p.right;
      }
    }
    // 新しいノードを適切な場所に挿入
    if (isLeftChild) { //true -> 左
      parent.left = newNode;
    } else { //false -> 右
      parent.right = newNode;
    }
    return true; // 正常に追加できた
  }

  public boolean deleteNoChildren(int id) { //指定された ID を持つノードが子を持たない場合にそのノードを削除する
    StudentNode parent = null;
    StudentNode current = root;

    // 指定されたIDを持つノードを探す
    while (current != null && current.getData().id != id) {
      parent = current;
      if (id < current.getData().id) {
        current = current.left;
      } else {
        current = current.right;
      }
    }

    // 指定されたIDを持つノードが見つからない場合
    if (current == null) {
      return false;
    }

    // 子を持たない場合のみ削除する
    if (current.left == null && current.right == null) {
      if (current == root) {
        root = null;
      } else if (current == parent.left) {
        parent.left = null;
      } else {
        parent.right = null;
      }
      return true;
    }
    return false; // 子を持つ場合は削除しない
  }

  // 二分探索木を文字列に変換するメソッド
  private void inOrderTraversal(StudentNode node, StringBuilder sb) {
    if (node != null) {
      inOrderTraversal(node.left, sb);
      sb.append("ID : ").append(node.getData().id).append("\n");
      sb.append("Name : ").append(node.getData().name).append("\n");
      inOrderTraversal(node.right, sb);
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    inOrderTraversal(root, sb); // 二分探索木を中間順序で文字列に変換
    return sb.toString();
  }

}

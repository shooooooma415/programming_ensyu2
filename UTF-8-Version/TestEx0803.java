/*
 *    プログラミング演習２
 *
 *    第8回演習
 *
 *    TestEx0803.java
 */
import java.io.*;

public class TestEx0803 {

  public static void main(String[] args) {
    StudentBinSearchTree tree = new StudentBinSearchTree();
    System.out.println(tree.insert(new StudentData(8, "Ibaraki Saburo")));
    System.out.println(tree.insert(new StudentData(1, "Ritsumei Taro")));
    System.out.println(tree.insert(new StudentData(3, "Kusatsu Jiro")));
    System.out.println(tree.insert(new StudentData(2, "Jouri Haruko")));
    System.out.println(tree.insert(new StudentData(5, "Kinugasa Natsuko")));

    System.out.println(tree.insert(new StudentData(1, "Ritsumei Taro")));

    // System.out.print("探索する ID を入力してください: ");
    // int id = getInt();

    // StudentNode result = tree.search(id);

    // if (result != null) {
    //   System.out.println("ID : " + result.getData().id);
    //   System.out.println("Name : " + result.getData().name);
    // } else {
    //   System.out.println("ID " + id + " は存在しません");
    // }

    tree.deleteNoChildren(2);
    tree.deleteNoChildren(5);
    tree.deleteNoChildren(3);
    System.out.println(tree);
  }

  // キーボードから１行読み込む
  public static String getString() {
    String s = "";
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      s = br.readLine();
    } catch (Exception e) { // 例外処理は範囲外なので無視
      System.err.println("An exception occured");
    }
    return s;
  }

  // キーボードから整数の入力を受け付ける
  public static int getInt() {
    int result = 0;
    try {
      String s = getString();
      result = Integer.parseInt(s);
    } catch (Exception e) { // 例外処理は範囲外なので無視
      System.err.println("An exception occured");
    }
    return (result);
  }
}

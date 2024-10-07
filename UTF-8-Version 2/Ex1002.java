
/*
 *    プログラミング演習２
 *
 *    練習課題10-2
 *
 *    Ex1002.java
 */
import java.util.Arrays;

public class Ex1002 {

	public static void main(String[] args) {

		String[] array = new String[10]; // 10個の要素を持つ String クラスの配列を宣言

		/* 配列にデータをセット */
		array[0] = "Orange";
		array[1] = "Banana";
		array[2] = "Apple";
		array[3] = "Grape";
		array[4] = "Pineapple";
		array[5] = "Peach";
		array[6] = "Strawberry";
		array[7] = "Cherry";
		array[8] = "Mango";
		array[9] = "Grapefruit";

		/* 配列の内容をそのまま表示 */
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]:" + array[i]);
		}

		int n = array.length;
		for (int s = 0; s < n - 1; s++) {
			int minIndex = s;
			for (int j = s + 1; j < n; j++) {
				if (array[j].compareTo(array[minIndex]) < 0) {
					minIndex = j;
				}
			}
			// 見つかった最小の要素と現在の要素を交換
			String temp = array[minIndex];
			array[minIndex] = array[s];
			array[s] = temp;

			/* ソート結果を表示 */
			System.out.println("ソート結果");
			for (int i = 0; i < array.length; i++) {
				System.out.println("[" + i + "]:" + array[i]);
			}

		}

	}
}
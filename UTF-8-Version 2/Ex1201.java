/*
 *    プログラミング演習２
 *
 *    練習課題12-1
 *
 *    Ex1201.java
 */

public class Ex1201 {

	public static void main(String[] args) {

		String[] a = new String[4];
		String[] b = new String[6];
		String[] c = new String[10];

		/*
		 * 配列 a , b それぞれにソート済みのデータをセット
		 */

		a[0] = "Apple";
		a[1] = "Grape";
		a[2] = "Peach";
		a[3] = "Strawberry";

		b[0] = "Banana";
		b[1] = "Cherry";
		b[2] = "Grapefruit";
		b[3] = "Mango";
		b[4] = "Orange";
		b[5] = "Pineapple";

		/*
		 * 配列 a, b をマージする
		 */
		Ex1201.merge(a, b, c);

		/*
		 * 配列 c の中身を表示する
		 */
		for (int i = 0; i < c.length; i++) {
			System.out.println("[" + i + "]: " + c[i]);
		}

	}

	// 練習課題12-1
	public static void merge(String[] arrayA, String[] arrayB, String[] arrayC) {

		int i = arrayC.length - 1;
		int aLength = arrayA.length - 1;
		int bLength = arrayB.length - 1;

		while (aLength != -1 && bLength != -1) {
			if (arrayA[aLength].compareTo(arrayB[bLength]) >= 0) {
				arrayC[i] = arrayA[aLength];
				aLength = aLength - 1;
			} else {
				arrayC[i] = arrayB[bLength];
				bLength = bLength - 1;
			}
			i = i - 1;
		}
		if (aLength == -1) {
			while (i != -1) {
				arrayC[i] = arrayB[bLength];
				bLength = bLength - 1;
				i = i - 1;
			}
		} else {
			while (i != -1) {
				arrayC[i] = arrayA[aLength];
				aLength = aLength - 1;
				i = i - 1;
			}
		}
	}

}

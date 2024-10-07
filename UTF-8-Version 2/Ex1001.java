/*
 *    プログラミング演習２
 *
 *    練習課題10-1
 *
 *    Ex1001.java
 */

public class Ex1001 {

	public static void main(String[] args) {

		double[] array = new double[10] ;   // 10個の要素を持つ double 型の配列を宣言

		/* 配列にデータをセット */
		array[0] = 45.5 ;
		array[1] = 26.7 ;
		array[2] = 98.5 ;
		array[3] = 0.5 ;
		array[4] = 8.94 ;
		array[5] = 78.4 ;
		array[6] = 22.3 ;
		array[7] = -34.5 ;
		array[8] = 98.54 ;
		array[9] = 63.4 ;

		/* 配列の内容をそのまま表示 */
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println("[" + i + "]:" + array[i]) ;
		}

		int n = array.length;
		for(int i=0; i < n - 1; i++){
			int lowest = i;
			double lowkey = array[i];
			for(int j = i + 1; j < n; j++){
				if (array[j] < lowkey) { 
					lowest = j; 
					lowkey = array[j];
				} 
			}
			double temp = array[i]; 
			array[i] = array[lowest];
			 array[lowest] = temp;
		}

		/* ソート結果を表示 */
		System.out.println("ソート結果") ;
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println("[" + i + "]:" + array[i]) ;
		}

  }

}

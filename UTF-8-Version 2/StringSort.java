/*
 *    プログラミング演習２
 *
 *    整列の課題のひな型
 *
 *    StringSort.java
 */

public class StringSort {

	private StringSort() { // StringSortクラスのオブジェクトを作成できないようにする
	}

	// 選択ソート
	public static void selectionSort(String[] targetArray) {
		System.out.println("====[ Selection Sort ]====");

		int n = targetArray.length;
		for (int s = 0; s < n - 1; s++) {
			int minIndex = s;
			for (int j = s + 1; j < n; j++) {
				// 未ソート部分の中で最小要素を探す
				if (targetArray[j].compareTo(targetArray[minIndex]) < 0) {
					minIndex = j;
				}
			}
			// 見つかった最小の要素と現在の要素を交換
			String temp = targetArray[minIndex];
			targetArray[minIndex] = targetArray[s];
			targetArray[s] = temp;
		}
	}

	// バブルソート
	public static void bubbleSort(String[] a) {
		System.out.println("====[ Bubble Sort ]====");
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				// 未ソート部分の末尾から順に比較して隣接要素を交換
				if (a[j - 1].compareTo(a[j]) > 0) {
					String temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}

	// 挿入ソート
	public static void insertionSort(String[] a) {
		System.out.println("====[ Insertion Sort ]====");
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j >= 1 && a[j - 1].compareTo(a[j]) > 0) {
				// ソート済み部分の右端の次の要素を適切な位置に挿入する
				String temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j--; // 挿入した要素を左へ移動
			}
		}
	}

	// クイックソートのパーティション処理
	private static int partition(String[] targetArray, int left, int right) {
		int i = left - 1;
		int j = right;
		String pivot = targetArray[right];
		while (true) {
			while (targetArray[++i].compareTo(pivot) < 0)
				;
			while (i < --j && pivot.compareTo(targetArray[j]) < 0)
				;
			if (i >= j)
				break;
			String temp = targetArray[i];
			targetArray[i] = targetArray[j];
			targetArray[j] = temp;
		}
		String temp = targetArray[i];
		targetArray[i] = targetArray[right];
		targetArray[right] = temp;
		return i;
	}

	private static void recQuickSort(String[] targetArray, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivotIndex = partition(targetArray, left, right);
		recQuickSort(targetArray, left, pivotIndex - 1); // ピボットより小さい要素からなる左側の部分配列に対してソート
		recQuickSort(targetArray, pivotIndex + 1, right); // ピボットより小さい要素からなる右側の部分配列に対してソート
	}

	// クイックソートのエントリーポイント
	public static void quickSort(String[] targetArray) {
		if (targetArray == null) { // 引数で与えられた String クラスの配列が null の場合はなにもしない
			return;
		}
		System.out.println("====[ Quick Sort ]====");
		recQuickSort(targetArray, 0, targetArray.length - 1);
	}

	private static void merge(String[] targetArray, String[] workSpace, int lowerBound, int midBound, int upperBound) {
		// 作業用配列の開始位置
		int i = lowerBound;
		// 下半分の配列の開始位置
		int j = midBound + 1;
		// 作業用配列の添字
		int k = lowerBound;

		// 下半分と上半分の要素をマージ
		while (i <= midBound && j <= upperBound) {
			if (targetArray[i].compareTo(targetArray[j]) <= 0) {
				workSpace[k++] = targetArray[i++];
			} else {
				workSpace[k++] = targetArray[j++];
			}
		}

		// 下半分の残り要素をコピー
		while (i <= midBound) {
			workSpace[k++] = targetArray[i++];
		}

		// 上半分の残り要素をコピー
		while (j <= upperBound) {
			workSpace[k++] = targetArray[j++];
		}

		// マージ結果を元の配列にコピー
		for (k = lowerBound; k <= upperBound; k++) {
			targetArray[k] = workSpace[k];
		}
	}

	private static void recMergeSort(String[] targetArray, String[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound >= upperBound) { // 再帰の終了条件
			return;
		}

		int midBound = (lowerBound + upperBound) / 2; // targetArrayを二分に分割

		// 左半分を整列
		recMergeSort(targetArray, workSpace, lowerBound, midBound);
		// 右半分を整列
		recMergeSort(targetArray, workSpace, midBound + 1, upperBound);
		// マージ
		merge(targetArray, workSpace, lowerBound, midBound, upperBound);
	}

	public static void mergeSort(String[] targetArray) {
		if (targetArray != null) { // targetArrayがnullでない時
			String[] workSpace = new String[targetArray.length];
			recMergeSort(targetArray, workSpace, 0, targetArray.length - 1);
		}
	}

	public static void shellSort(String[] targetArray) { // 発展課題11-7
		System.out.println("====[ Shell Sort ]====");
		int n = targetArray.length;
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1)
			; // hの初期化
		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j = i;
				String temp = targetArray[j];
				while (j >= h && targetArray[j - h].compareTo(temp) > 0) {
					targetArray[j] = targetArray[j - h];
					j -= h;
				}
				targetArray[j] = temp;
			}
		}
	}
}
// if (targetArray == null) {
// return;
// }
// int n = 4;
// int tmp;
// int g = 1;

// String[] targetArrayCopy = new String[targetArray.length + 1];
// for (int k = 1; k < targetArray.length + 1; k++) {
// targetArrayCopy[k] = targetArray[k - 1];
// }

// String[] workSpace = new String[targetArray.length];

// n = targetArray.length;
// for (int gap = n / 2; gap > 0; gap /= 2) {
// for (int i = 1; i < targetArrayCopy.length; i++) {
// int j = i;
// tmp = targetArray[0];
// workSpace[0] = tmp;

// if (j % gap == 0) {
// workSpace[g] = targetArrayCopy[j];
// }
// }
// mergeSort(workSpace);

// targetArray[0] = workSpace[0];
// for (int i = 1; i < workSpace.length; i++) {
// int j = i;
// targetArray[gap * i - 1] = workSpace[i];
// }
// n = n - 1;
// workSpace = null;
// }
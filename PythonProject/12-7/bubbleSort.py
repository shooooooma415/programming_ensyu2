class BubbleSort:
    def bubble_sort(target_array):
        print("====[ Bubble Sort ]====")
        n = len(target_array)
        for i in range(n - 1):
            for j in range(n - 1, i, -1):
                # 未ソート部分の末尾から順に比較して隣接要素を交換
                if target_array[j - 1] > target_array[j]:
                    target_array[j], target_array[j - 1] = target_array[j - 1], target_array[j]
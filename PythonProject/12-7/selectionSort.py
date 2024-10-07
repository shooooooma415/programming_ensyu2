class SelectionSort:
    @staticmethod
    def selection_sort(target_array):
        print("====[ Selection Sort ]====")
        n = len(target_array)
        for s in range(n - 1):
            min_index = s
            for j in range(s + 1, n):
                if target_array[j] < target_array[min_index]:
                    min_index = j
            if min_index != s:
                target_array[s], target_array[min_index] = target_array[min_index], target_array[s]

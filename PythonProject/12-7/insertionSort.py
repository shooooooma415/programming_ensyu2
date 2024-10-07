class InsertionSort:
    @staticmethod
    def insertion_sort(target_array):
        print("====[ Insertion Sort ]====")
        n = len(target_array)

        for i in range(1, n):
            j = i
            
            while j >= 1 and target_array[j - 1] > target_array[j]:
                target_array[j], target_array[j - 1] = target_array[j - 1], target_array[j]
                j = j - 1
            
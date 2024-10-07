class QuickSort:
    def partition(self, target_array, left, right):
        i = left - 1
        pivot = target_array[right]
        
        for j in range(left, right):
            if target_array[j] <= pivot:
                i += 1
                target_array[i], target_array[j] = target_array[j], target_array[i]
        
        target_array[i + 1], target_array[right] = target_array[right], target_array[i + 1]
        return i + 1
        
    def rec_quick_sort(self, target_array, left, right):
        if left < right:
            pivot_index = self.partition(target_array, left, right)
            
            self.rec_quick_sort(target_array, left, pivot_index - 1)
            self.rec_quick_sort(target_array, pivot_index + 1, right)
        
    @staticmethod
    def quick_sort(target_array):
        if target_array is None:
            return
        qs = QuickSort()
        print("====[ Quick Sort ]====")
        qs.rec_quick_sort(target_array, 0, len(target_array) - 1)

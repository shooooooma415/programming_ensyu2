class MergeSort:
    def merge(self, target_array, workspace, lower_bound, mid_bound, upper_bound):
        i = lower_bound
        j = mid_bound + 1
        k = lower_bound
        
        while i <= mid_bound and j <= upper_bound:
            if target_array[i] <= target_array[j]:
                workspace[k] = target_array[i]
                i += 1
            else:
                workspace[k] = target_array[j]
                j += 1
            k += 1
            
        while i <= mid_bound:
            workspace[k] = target_array[i]
            i += 1
            k += 1
            
        while j <= upper_bound:
            workspace[k] = target_array[j]
            j += 1
            k += 1
            
        for idx in range(lower_bound, upper_bound + 1):
            target_array[idx] = workspace[idx]



    def rec_merge_sort(self, target_array, workspace, lower_bound, upper_bound):
        if lower_bound >= upper_bound:  # 再帰の終了条件
            return
        
        mid_bound = (lower_bound + upper_bound) // 2
        
        self.rec_merge_sort(target_array, workspace, lower_bound, mid_bound)
        self.rec_merge_sort(target_array, workspace, mid_bound + 1, upper_bound)
        
        self.merge(target_array, workspace, lower_bound, mid_bound, upper_bound)

    @staticmethod
    def merge_sort(target_array):
        if target_array is not None:
            workspace = [None] * len(target_array)
            print("====[ Merge Sort ]====")
            ms = MergeSort()
            ms.rec_merge_sort(target_array, workspace, 0, len(target_array) - 1)
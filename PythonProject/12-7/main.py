import time
from wordReader import WordReader
from selectionSort import SelectionSort
from bubbleSort import BubbleSort
from insertionSort import InsertionSort
from quickSort import QuickSort
from mergeSort import MergeSort

import sys
sys.setrecursionlimit(10000)  # 例として深さを増やす


def main():
    filename = input("ソートしたいファイル名を入力してください: ")
    words = WordReader.read_words_from_file(filename)

    if words is None:
        print("Failed to read words from file. Exiting...")
        return

    copy1 = words.copy()
    copy2 = words.copy()
    copy3 = words.copy()
    copy4 = words.copy()
    copy5 = words.copy()
    
    # Selection Sort
    start_time1 = time.time_ns()
    SelectionSort.selection_sort(copy1)
    end_time1 = time.time_ns()
    elapsed_time1 = end_time1 - start_time1
    print("\nElapsed time for Selection Sort:", elapsed_time1, "ns")
    
    # Bubble Sort
    start_time2 = time.time_ns()
    BubbleSort.bubble_sort(copy2)
    end_time2 = time.time_ns()
    elapsed_time2 = end_time2 - start_time2
    print("\nElapsed time for Bubble Sort:", elapsed_time2, "ns")
    
    # Insertion Sort
    start_time3 = time.time_ns()
    InsertionSort.insertion_sort(copy3)
    end_time3 = time.time_ns()
    elapsed_time3 = end_time3- start_time3
    print("\nElapsed time for Insertion Sort:", elapsed_time3, "ns")
    
    # Quick Sort
    start_time4 = time.time_ns()
    QuickSort.quick_sort(copy4)
    end_time4 = time.time_ns()
    elapsed_time4 = end_time4 - start_time4
    print("\nElapsed time for Quick Sort:", elapsed_time4, "ns")
    
    # Merge Sort
    start_time5 = time.time_ns()
    MergeSort.merge_sort(copy5)
    end_time5 = time.time_ns()
    elapsed_time5 = end_time5 - start_time5
    print("\nElapsed time for Merge Sort:", elapsed_time5, "ns")
    

if __name__ == "__main__":
    main()

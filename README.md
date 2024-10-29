# Quick Sort Algorithm

Introduction : Quick Sort is a highly efficient sorting algorithm that employs a divide-and-conquer strategy to organise elements. It operates by selecting a ‘pivot’ element from the array and 
partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively. 
This process of partitioning and recursively sorting brings the array to a sorted state with remarkable efficiency. Quick Sort’s average-case complexity is notably efficient at O(n log n), 
making it a popular choice for sorting large datasets.

## Diffrences Between Quick Sort And Merge Sort

Table below shows the differences between quick sort and merge sort in several basis of comparisons such as the sorting method, partition of elements in array,
usage of datasets, efficiency, stability, usual application that implement the algorithms and the time complexity:

![Screenshot 2024-10-13 163940](https://github.com/user-attachments/assets/b6cc11ea-60f0-4b7a-be67-cb8a2b7493d7)

## Time Complexity

Time Complexity : The time complexity of an algorithm is a measure of the time an algorithm takes to complete as a function of the length of the input.

Quick Sort

- Best Case: O(n log n) - Occurs when the pivot divides the array into two nearly equal halves.

- Average Case: O(n log n) - Typical performance with random pivot selection.

- Worst Case: O(n^2) - Occurs when the smallest or largest element is always chosen as the pivot, resulting in highly unbalanced partitions.

## Analysis

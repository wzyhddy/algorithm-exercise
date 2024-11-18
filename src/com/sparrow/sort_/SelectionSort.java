package com.sparrow.sort_;

/**
 * @Author: Sparrow
 * @Description: 选择排序
 * @DateTime: 2024/11/18 22:35
 **/
public class SelectionSort{

  private SelectionSort(){}

  /**
   * 循环不变量: arr[i,n)未排序 arr[0,i)已排序
   * @param arr
   * @param <E>
   */
  public static <E extends Comparable<E>> void sort(E[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int miniIndex = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j].compareTo(arr[miniIndex]) < 0) {
          miniIndex = j;
        }
      }
      swap(arr, i, miniIndex);
    }
  }

  private static <E> void swap(E[] arr, int i, int j) {
    E temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

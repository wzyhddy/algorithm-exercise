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

  /**
   * 循环不变量: arr[i...n)已排序，arr[0..i)未排序
   */
  public static <E extends Comparable<E>> void sort2(E[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      int maxIndex = i;
      for (int j = i; j >= 0; j--) {
        if (arr[j].compareTo(arr[maxIndex]) > 0) {
          maxIndex = j;
        }
      }
      swap(arr, i, maxIndex);
    }
  }

  private static <E> void swap(E[] arr, int i, int j) {
    E temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

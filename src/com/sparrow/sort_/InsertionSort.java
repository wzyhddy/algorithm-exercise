package com.sparrow.sort_;

/**
 * @Author: Sparrow
 * @Description: 插入排序
 * @DateTime: 2024/11/19 22:01
 **/
public class InsertionSort {

  private InsertionSort() {
  }

  public static <E extends Comparable<E>> void sort(E[] arr) {
    for (int i = 0; i < arr.length; i++) {
//      for (int j = i; j > 0; j--) {
//        if (arr[j - 1].compareTo(arr[j]) > 0) {
//          swap(arr, j , j - 1);
//        }else {
//          break;
//        }
//      }
      for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
        swap(arr, j, j - 1);
      }
    }
  }

  public static <E extends Comparable<E>> void sort2(E[] arr) {
    for (int i = 1; i < arr.length; i++) {
      E temp = arr[i];
      int j = i;
      while (j > 0 && temp.compareTo(arr[j - 1]) < 0) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = temp;
    }
  }

  public static <E extends Comparable<E>> void sort3(E[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      E temp = arr[i];
      int j = i;
      while (j + 1 < arr.length  && temp.compareTo(arr[j + 1]) > 0) {
       arr[j] = arr[j + 1];
        j++;
      }
      arr[j] = temp;
    }
  }

  private static <E extends Comparable<E>> void swap(E[] arr, int i, int j) {
    E temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
//    int[] dataSize = {10000, 100000};
//    for (int n : dataSize) {
//      Integer[] array = ArrayGenerator.generateRandomArray(n, n);
//      SortingHelper.sortTest("InsertionSort", array);
//    }
    Integer[] a = new Integer[]{5, 4, 3, 2, 1};
    SortingHelper.sortTest("InsertionSort", a);
    for (Integer i : a) {
      System.out.println(i);
    }
  }
}

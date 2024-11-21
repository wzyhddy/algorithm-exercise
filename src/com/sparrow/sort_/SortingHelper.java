package com.sparrow.sort_;



/**
 * @Author: Sparrow
 * @Description: SortingHelper
 * @DateTime: 2024/11/20 21:38
 **/
public class SortingHelper {

  private SortingHelper() {}

  public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1].compareTo(arr[i]) > 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Todo:优化用反射
   * @param sortName
   * @param arr
   * @param <E>
   */
  public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
    long startTime = System.nanoTime();
    if (sortName.equals("InsertionSort")){
      InsertionSort.sort3(arr);
    }else if (sortName.equals("SelectionSort")) {
      SelectionSort.sort(arr);
    }
    long endTime = System.nanoTime();
    double time = (endTime - startTime) / 1000000000.0;
    if(!SortingHelper.isSorted(arr)) {
      throw new RuntimeException("SelectionSort failed");
    }
    System.out.println(String.format("%s, n = %d : %f s", sortName, arr.length, time));
  }
}

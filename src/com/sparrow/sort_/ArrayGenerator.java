package com.sparrow.sort_;

import java.util.Random;

/**
 * @Author: Sparrow
 * @Description: ArrayGenerator
 * @DateTime: 2024/11/20 21:24
 **/
public class ArrayGenerator {

  private ArrayGenerator() {}

  public static Integer[] generateOrderedArray(int n) {
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
      arr[i] = i;
    }
    return arr;
  }

  public static Integer[] generateRandomArray(int n,int bound) {
    Integer[] arr = new Integer[n];
    Random rnd = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = rnd.nextInt(bound);
    }
    return arr;
  }
}

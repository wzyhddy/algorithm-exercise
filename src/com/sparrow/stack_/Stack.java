package com.sparrow.stack_;

/**
 * @Author: Sparrow
 * @Description: Stack
 * @DateTime: 2024/11/24 9:17
 **/
public interface Stack<E> {

  int size();

  boolean isEmpty();

  void push(E e);

  E pop();

  E peek();
}

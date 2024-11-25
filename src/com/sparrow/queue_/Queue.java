package com.sparrow.queue_;

/**
 * @Author: Sparrow
 * @Description: Queue
 * @DateTime: 2024/11/25 20:22
 **/
public interface Queue<E> {

  int getSize();

  boolean isEmpty();

  void enqueue(E e);

  E dequeue();

  E getFront();
}

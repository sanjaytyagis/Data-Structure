package HeapSort;
import java.util.*;

// Min-Heap Example
class BinaryHeap {
  static int capacity; /*Maximum elements that can be stored in heap*/
  static int size; /*Current no of elements in heap*/
  static int arr[]; /*array for storing the keys*/

  BinaryHeap(int cap) {
    capacity = cap; /*Assigning the capacity*/
    size = 0; /*Intailly size of hepa is zero*/
    arr = new int[capacity]; /*Creating a array*/
  }

  /*returns the parent of ith Node*/
  static int parent(int i) {
    return (i - 1) / 2;
  }
  /*returns the left child of ith Node*/
  static int left(int i) {
    return 2 * i + 1;
  }
  /*Returns the right child of the ith Node*/
  static int right(int i) {
    return 2 * i + 2;
  }

  /*Insert a new key x*/
  static void Insert(int x) {
    if (size == capacity) {
      System.out.println("Binary Heap Overflown");
      return;
    }
    arr[size] = x; /*Insert new element at end*/
    int k = size; /*store the index ,for checking heap property*/
    size++; /*Increase the size*/

    /*Fix the min heap property*/
    while (k != 0 && arr[parent(k)] > arr[k]) {
      int temp = arr[parent(k)];
      arr[parent(k)] = arr[k];
      arr[k] = temp;
      k = parent(k);
    }
  }

  static void Heapify(int ind) {
	  
    int ri = right(ind); /*right child*/
    int li = left(ind); /*left child*/
    int smallest = ind; /*intially assume violated value in Min value*/
    
    if (li < size && arr[li] < arr[smallest])
      smallest = li;
    
    if (ri < size && arr[ri] < arr[smallest])
      smallest = ri;
    
    /*smallest will store the minvalue index*/
    /*If the Minimum among the three nodes is the parent itself,
    that is Heap property satisfied so stop else call function recursively on Minvalue node*/
    if (smallest != ind) {
      int temp = arr[ind];
      arr[ind] = arr[smallest];
      arr[smallest] = temp;
      Heapify(smallest);
    }
  }
  
  static int ExtractMin() {
    if (size <= 0)
      return Integer.MAX_VALUE;
    if (size == 1) {
      size--;
      return arr[0];
    }
    int mini = arr[0];
    arr[0] = arr[size - 1]; /*Copy last Node value to root Node value*/
    size--;
    Heapify(0); /*Call heapify on root node*/
    return mini;
  }
  
  static void Decreasekey(int i, int val) {
    arr[i] = val; /*Updating the new_val*/
    while (i != 0 && arr[parent(i)] > arr[i]) /*Fixing the Min heap*/ {
      int temp = arr[parent(i)];
      arr[parent(i)] = arr[i];
      arr[i] = temp;
      i = parent(i);
    }
  }
  
  static void Delete(int i) {
    Decreasekey(i, Integer.MIN_VALUE);
    ExtractMin();
  }
  
  static int getMin() {
	    return arr[0];
}
  
  static void print() {
    for (int i = 0; i < size; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
  
  public static void main(String args[])

  {
    BinaryHeap h = new BinaryHeap(20);
    h.Insert(4);
    h.Insert(1);
    h.Insert(2);
    h.Insert(6);
    h.Insert(7);
    h.Insert(3);
    h.Insert(8);
    h.Insert(5);
    System.out.println("Min value is " + h.getMin());
    h.Insert(-1);
    System.out.println("Min value is " + h.getMin());
    h.Decreasekey(3, -2);
    System.out.println("Min value is " + h.getMin());
    h.ExtractMin();
    System.out.println("Min value is " + h.getMin());
    h.Delete(0);
    System.out.println("Min value is " + h.getMin());

  }
}
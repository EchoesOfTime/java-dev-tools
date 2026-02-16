package ru.mentee.power.devtools;

public class LiveCodingDemo {
  static void main(String[] args) {
    Integer[] arr1 = {null, 5, 6, 2, 7, 8, 3, -6, 3, -4, 0};
    Integer[] arr2 = {};
    System.out.println(finMax(arr1));
    System.out.println(finMax(arr2));
    //System.out.println(sumEven(arr1));
    //printfizzbizz (15);
  }

  public static Integer finMax(Integer[] numbers) {
    if (numbers == null || numbers.length == 0) {
      return Integer.MIN_VALUE;
    }

    Integer max = Integer.MIN_VALUE;
    for (int i = 1; i < numbers.length; i++) {

      if (numbers[i] != null && numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }
/*
  public static int sumEven(Integer[] numbers) {
    if (numbers == null || numbers.length == 0) {
      return Integer.MIN_VALUE;
    }
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] != null && numbers[i] % 2 == 0) {
        sum += numbers[i];
      }
    }
    return sum;
  }

  public static void printfizzbizz(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("fizzbizz");
      }
      else if (i % 3 == 0) {
        System.out.println("fizz");
      }
      else if (i % 5 == 0) {
        System.out.println("bizz");
      }
      else {
        System.out.println(i);
      }
    }
  }

 */
}
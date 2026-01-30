package ru.mentee.power.devtools.progress;

public class LiveCodingDemo {
  public static void printFizzBuzz(int n) {
    for (int i = 1; i <= n; i ++) {  // создания счетчика цикла i = 1, цикл будет работать от 1 до n включительно, i++ означает i = i + 1 (увеличить i на 1)
      if (i % 3 == 0 && i % 5 == 0){ // проверка, делится ли число на 3 и на 5 одновременно, если да то выводим FizzBuzz
        System.out.println("FizzBuzz");
      }
      else if (i % 3 == 0) {  // если не делится на 3 и 5, то проверяем делимость на 3, если да то выводим Fizz
        System.out.println("Fizz");
      }
      else if (i % 5 == 0) {  // если не делится на 3, то проверяем делимость на 5, если да то выводим Buzz
        System.out.println("Buzz");
      }
      else {
        System.out.println(i);  // если не выполняется ни одно из условий, то выводится число i
      }
    }
  }

  public static int sumEven(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        sum += numbers[i];
      }
    }
    return sum;
  }

  public static int findMax(int[] numbers) {
    if (numbers.length == 0) {
      return Integer.MIN_VALUE;
    }
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println("=== FizzBuzz ===");
    printFizzBuzz(15);

    System.out.println("\n=== sumEven ===");
    int[] arr = {1, 4, 2, 3, 5, 8, 6, 7};
    int result = sumEven(arr);
    System.out.println(result);
    int[] arr2 = {1, 3, 5};
    System.out.println(sumEven(arr2));
    int[] arr3 = {};
    System.out.println(sumEven(arr3));

    System.out.println("\n=== findMax ===");
    System.out.println(findMax(new int[]{3, 7, 2, 9, 1}));
    System.out.println(findMax(new int[]{-5, -1, -10}));
    System.out.println(findMax(new int[]{42}));
    System.out.println(findMax(new int[]{}));
  }
}
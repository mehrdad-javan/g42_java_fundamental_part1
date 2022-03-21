package org.example;

public class TestCalculator {


  // psvm + Tab
  public static void main(String[] args) {

    char operation = '-';
    int number1 = 5;
    int number2 = 2;

    /*if (operation == '+'){
      System.out.println(number1 + number2);
    } else if (operation == '-'){
      System.out.println(number1 - number2);
    } else if (operation == '*') {
      System.out.println(number1 * number2);
    } else {
      System.out.println("operation is not valid!");
    }*/

    switch (operation) {
      case '+':
        System.out.println(number1 + number2);
        break;
      case '-':
        System.out.println(number1 - number2);
        break;
      default:
        System.out.println("operation is not valid");
    }


  }


}

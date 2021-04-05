package ru.geekbrins.Lesson11;

public class Task1 {

  public static <T> T[] swappIndex (T[] arrayStr){
        int x = arrayStr.length;
        T temp;
      System.out.println("Задание №1 \nМетод меняет местами два элемента массива");
      System.out.println("Исходный вариант массива: ");
      for (int i = 0; i < arrayStr.length; i++) {
          System.out.print(arrayStr[i]);
      }

      System.out.println("\nЭлементы поменяли: ");
      for (int i = 0; i < x/2; i++) {
          temp = arrayStr[x - i -1];
          arrayStr[x - i -1] = arrayStr[i];
          arrayStr[i] = temp;
          for (int j = 0; j < arrayStr.length; j++) {
              System.out.print(arrayStr[j]);
          }
      }return arrayStr;
  }
}

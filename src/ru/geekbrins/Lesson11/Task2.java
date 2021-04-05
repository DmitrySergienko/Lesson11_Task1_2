package ru.geekbrins.Lesson11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2{

    public static void toArrayList() {
       String[] arrayOfStrings = {"1","2","3"};
       List<String> listOfStrings = new ArrayList<>();
        System.out.println("\n===========================");
        System.out.println("\nЗадание №2 \nПреобразую массив в ArrayList испольуя метод Collections.addAll()");
        System.out.println("Выбрал этот метод, потому что массив данных копируется в список в виде самостоятельного объекта. \nИсходный массив и результирующий ArrayList будут независимы друг от друга.\n");

        Collections.addAll(listOfStrings, arrayOfStrings);

        for (String str : listOfStrings){
           System.out.println(" " + str);
       }
        listOfStrings.add("add Item"); //добавлю элемент для проверки
        System.out.println("добавлю элемент для проверки");

        for (String str : listOfStrings){
            System.out.println(" " + str);
        }
        System.out.println("Так как элемент добавился то это уже ArrayList");

    }

}

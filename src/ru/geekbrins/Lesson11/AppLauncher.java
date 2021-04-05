package ru.geekbrins.Lesson11;

public class AppLauncher {

    public static void main(String[] args) {

        //Метод меняет местами два элемента массива
        firstTask();
        //Метод преобразующий массив в ArrayList
        Task2.toArrayList();

    }

    private static void firstTask() {
        String[] array ={"КОТ  ", "ПЁС  "};
        Task1.swappIndex(array);


    }

}

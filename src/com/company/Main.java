package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int yearOfBirthday = 1984;
    int monthOfBirthday = 7;
    int dayOfBirthday = 21;
    int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);


        if (monthOfBirthday > dayOfBirthday) {
            boolean monthBiggerDay = true;
            System.out.println("Месяц моего рождения больше даты моего рождения: " + monthBiggerDay);
                }
        else {
            boolean monthBiggerDay = false;
            System.out.println("Месяц моего рождения больше даты моего рождения: " + monthBiggerDay);
        }



        System.out.println(" ");

        char[] name = new char[6];
        name [0] = 'A';
        name [1] = 'n';
        name [2] = 'd';
        name [3] = 'r';
        name [4] = 'e';
        name [5] = 'w';

        System.out.print("Массив с моим именем: ");
        System.out.print(name);

        System.out.println(" ");


        double myAge = 36.0;
        double partYear = 3.0/12.0;
        myAge += partYear;
        System.out.println("Мне " + myAge + " лет");




    }
}

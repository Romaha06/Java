package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //example1();
        //example2();
        //example3();
        //example4();
        //example5();
        //example6();
        // example7();
        example8();


	   /* Scanner num = new Scanner(System.in);
	    int first, second, result;
	    System.out.print("Enter furst num: ");
	    first = num.nextInt();
	    System.out.print("Enter second num: ");
	    second = num.nextInt();
	    result = first + second;
	    System.out.println("Result is - " + result);
	    */

        //Ctrl + Alt + l - Форматировать код
        //sout + Tab - быстрый System.out.println
        //Ctrl + d - копирование и вставка выбранной строки

        //Ввести с клавиатуры два числа типа int и произвести над ними все арефметические операции.

	    /*int  a;
	    int  b;
	    Scanner num = new Scanner(System.in);
	    a = num.nextInt();
	    b = num.nextInt();
	    System.out.println(a + b);
	    System.out.println(a - b);
	    System.out.println(a * b);
	    System.out.println(a / b);*/
    }

    public static void example1() {

       /* Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;

        System.out.println("Введите a: " );
        a = scanner.nextDouble();

        System.out.println("Введите b: ");
        b = scanner.nextDouble();

        System.out.println("a + b = " + (a + b ));
        System.out.println("a - b = " + (a - b ));
        System.out.println("a * b = " + (a * b ));
        System.out.println("a / b = " + (a / b ));*/

      /*

      Scanner scanner = new Scanner(System.in);

       int a;
       int b;

       System.out.println("Введите a: ");
       a = scanner.nextInt();

       System.out.println("Введите b: ");
       b = scanner.nextInt();

       int c = a + b - (a / b) + a * b;

       System.out.println("a + b - (a / b) + a * b = " + c);*/


       /* System.out.println("Homework");

        System.out.println("Task number 1");

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double x;
        System.out.println("Введите a: " );
        a = scanner.nextDouble();

        System.out.println("Введите b: " );
        b = scanner.nextDouble();

        System.out.println("Введите c: " );
        c = scanner.nextDouble();


        if((b*b - 4*a*c) >= 0) //Если дискриминант больше или равен 0
        {
            x = ( -1*b + (b*b - 4*a*c) ) / (2 * a);
            System.out.println("Первый корень равен " + x);
            x = ( -1*b - (b*b - 4*a*c) ) / (2 * a);
            System.out.println("Второй корень равен " + x);
        }
        else
        {
            System.out.println("Дискриминант меньше 0, корни невещественные. ");
        } */




        /*System.out.println("Task number 2");

        Scanner scanner = new Scanner(System.in);

        double length;
        double width;
        double a;
        double b;

        System.out.println("Введите длину: ");
        length = scanner.nextDouble();

        System.out.println("Введите ширену: ");
        width = scanner.nextDouble();

        System.out.println("Введите сторону a: ");
        a = scanner.nextDouble();

        System.out.println("Введите сторону b: ");
        b = scanner.nextDouble();

        double P = (length + width) * 2;
        double S = a * b;

        System.out.println("Периметр = " + P);
        System.out.println("Площадь = " + S);*/


        /*System.out.println("Task number 3");

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите длину стороны квадрата: ");
        //int i;
        //i = scanner.nextInt();
        //System.out.println("Периметр квадрата равен = " + 4*i);

        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.print("Введите сторону a: ");
        a = scanner.nextInt();

        int b;
        System.out.print("Введите сторону b: ");
        b = scanner.nextInt();

        int c;
        System.out.print("Введите сторону c: ");
        c = scanner.nextInt();

        int d;
        System.out.print("Введите сторону d: ");
        d = scanner.nextInt();

        int P;
        System.out.print("Введите периметр квадрата: ");
        P = scanner.nextInt();

        int res = P * a * b * c * d / 4;

        System.out.print("Сторона квадрата ровна: " + res);*/


    }

    public static void example2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Данная программа поможет Вам узнать свой вес на Луне. ");

        System.out.println("Итак, начнем!");

        System.out.println("Чему равен Ваш вес на Земле, кг? : ");
        double earth = scanner.nextInt();
        //вычисляем вес пользователя на Луне;
        double weightPeopleMoon = earth * 0.17;
        //выводим ответ на консоль;
        System.out.println("Ваш вес на Луне равен " + weightPeopleMoon + " кг.");

    }

    public static void example3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расход топлива вашего авто на 100км: ");
        double hundredKm = scanner.nextDouble();
        double a = hundredKm / 100;
        System.out.println("Введите растояние в км от точки А до точки Б: ");
        double distance = scanner.nextDouble();
        double consumption = distance * a;
        System.out.println("Вашь расход составляет: " + consumption + " литров ");
        System.out.println("Введите стоимость одного литра: ");
        double cost = scanner.nextDouble();
        System.out.println("Введите валюту: ");
        String currency = scanner.next();
        double price = cost * consumption;
        System.out.println("Необходима такая сумма " + price + " " + currency);


    }

    public static void example4() {
        //Ввести две переменных типа int и сравнить какая из них больше
        int a = 40;
        int b = 20;

        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }
    }

    public static void example5() {

        System.out.println("Задние № 1");

        Scanner scanner = new Scanner(System.in);

        int a, b, res;
        System.out.println("Введите первое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Error");
        } else {
            res = a / b;
            System.out.println("Верно: " + res);
        }
    }

    public static void example6() {

        System.out.println("Задние № 2");

        Scanner scanner = new Scanner(System.in);
        double c, res;

        System.out.println("Сумма покупки: ");
        c = scanner.nextDouble();

        if (c < 500) {
            System.out.println("Нет скидки ");
        } else if (c > 1000) {

            res = c * 0.95;
            System.out.println("Скидка 5%" + "Сумма к оплате = " + res);
        } else {
            res = c * 0.97;
            System.out.println("Скидка 3% " + "Сумма к оплате = " + res);
        }
    }

    public static void example7(){

        Scanner scanner = new Scanner(System.in);
        double c, res;
        System.out.println("Введите сумму:  ");
        c = scanner.nextDouble();
        if (c < 200){
            System.out.println("Нет скидки!");
        }else if (c > 500){
            res = c * 0.97;
            System.out.println("Скидка 3%");
        }else if (c > 1000){
            res = c * 0.95;
            System.out.println("Скидка 5%");
        }else{
            res = c * 0.98;
            System.out.println("Скидка 2%");
        }
    }
    public static void example8(){

        Scanner scanner = new Scanner(System.in);
        double g, res;
        System.out.println("Введиту стоимость билета: ");
        g = scanner.nextDouble();

        if (g <= 25000){
            System.out.println("Цена приемлема ");
        } else if (g > 25000){
            System.out.println("Дорого!!!");
            res = g * 0.75;
            System.out.println("Но у вас есть скидка 25%" + " Цена с учетом скидки: " + res );
        }
    }
}



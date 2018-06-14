package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //example1();
        //example2();
        //example3();
        //example4();
        //example5();
        //example6();
        //example7();
        //example8();
        //example9();
        //example10();
        //example12();
        //example13();
        //example14();
        //example15();
        //example116();
        //example117();
        //example118();
        //example119();
        //cofee_machine();
        //continuEX();
        //game();
        //bandit();
        classWorkExempl();

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

        System.out.println("Самостоятельная работа");

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

        System.out.println("Самостоятельная работа");

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

        System.out.println("Самостоятельная работа");

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

        System.out.println("Самостоятельная работа");

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

    public static void example7() {
        System.out.println("Самостоятельная работа");

        Scanner scanner = new Scanner(System.in);
        double c, res;
        System.out.println("Введите сумму:  ");
        c = scanner.nextDouble();
        if (c < 200) {
            System.out.println("Нет скидки!");
        } else if (c > 500) {
            res = c * 0.97;
            System.out.println("Скидка 3%");
        } else if (c > 1000) {
            res = c * 0.95;
            System.out.println("Скидка 5%");
        } else {
            res = c * 0.98;
            System.out.println("Скидка 2%");
        }
    }

    public static void example8() {

        System.out.println("Самостоятельная работа");
        Scanner scanner = new Scanner(System.in);

        double g, res;
        System.out.println("Введиту стоимость билета: ");
        g = scanner.nextDouble();

        if (g <= 25000) {
            System.out.println("Цена приемлема))) ");
            res = g * 0.75;
            System.out.println("Плюс у вас есть скидка 25%" + " Цена с учетом скидки: " + res);

        } else if (g > 25000) {
            System.out.println("Дорого!!!");
            res = g * 0.75;
            System.out.println("Но у вас есть скидка 25%" + " Цена с учетом скидки: " + res);
        }
    }

    public static void example9() {

        System.out.println("Работа на занятии");

        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = scanner.nextInt();
        int b = a % 3;
        if (b == 0) {
            System.out.println("Число делится на три");
        } else {
            System.out.println("Число не делится на три");
        }
    }

    public static void example10() {
        System.out.println("Работа на занятии");
        int minutes;
        int deyOfWeek;
        double price = 1.02;
        double summ = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводим количество минут: ");
        minutes = scanner.nextInt();
        System.out.println("Введите дедь нидели: ");
        deyOfWeek = scanner.nextInt();

        if (deyOfWeek == 1 || deyOfWeek == 2
                || deyOfWeek == 3 || deyOfWeek == 4 || deyOfWeek == 5) {
            summ = minutes * price;
            System.out.println("По будням");
        } else if (deyOfWeek == 6 || deyOfWeek == 7) {
            summ = minutes * price * 0.80;
            System.out.println("По выходным");
        }
        System.out.println("Стоимость разговора: " + summ);
    }

    public static void example11() {

        System.out.println("Пробы первого калькулятора");
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        final int BUTTON_PLUS = 1;
        final int BUTTON_MINUS = 2;
        final int BUTTON_MULT = 3;
        final int BUTTON_DIV = 4;
        final int BUTTON_PERCENT = 5;

        int a, b;
        int res;

        while (true) {
            System.out.println("Введите первое число: ");
            a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            b = scanner.nextInt();

            System.out.println("Введите id кнопки: ");

            switch (id) {
                case BUTTON_PLUS:
                    res = (a + b);
                    System.out.println("Нажали на сумму");
                    System.out.println(" Равно: " + res);
                    break;
                case BUTTON_MINUS:
                    res = (a - b);
                    System.out.println("Нажали на разницу");
                    System.out.println(" Равно: " + res);
                    break;
                case BUTTON_MULT:
                    res = (a * b);
                    System.out.println("Нажали на умножение");
                    System.out.println(" Равно: " + res);
                    break;
                case BUTTON_DIV:
                    res = (a / b);
                    System.out.println("Нажали на диление");
                    System.out.println(" Равно: " + res);
                    break;
                case BUTTON_PERCENT:
                    res = (a % b);
                    System.out.println("Нажали на процент");
                    System.out.println(" Равно: " + res);
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение");
                    break;
            }
        }
    }

    public static void example12() {

        System.out.println("Самостоятельная работа");
        System.out.println("Задание № 2 ");

        Scanner scanner = new Scanner(System.in);

        int a = 1794;
        int b;
        System.out.println("В каком году была основана Одесса? ");
        b = scanner.nextInt();
        if (b > a || b < a) {
            System.out.println("Вы ошиблись, Одесса была основана в  1794 году! ");
        } else {
            System.out.println("Верно! ");
        }

    }

    public static void example13() {

        System.out.println("Самостоятельная работа");
        System.out.println("Задание № 8 ");
        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.println("Введите трехзначное число: ");
        a = scanner.nextInt();

        int res = a * a;
        int a1 = a / 100;
        int a2 = (a - (a1 * 100)) / 10;
        int a3 = a - (a1 * 100) - (a2 * 10);
        int res2 = a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3;
        System.out.println("Вывод первого res: " + res);
        System.out.println("Вывод второго res: " + res2);
        if (res == res2) {
            System.out.println("Числа равны ");
        } else {
            System.out.println("Числа не равны ");
        }
    }

    public static void example14() {

        System.out.println("Самостоятельная работа");
        System.out.println("Задание № 9 ");

        double x = 2;
        double y = 3;
        double d;
        double b;
        if (x < y) {
            d = ((x + y) / 2);
            b = x * y * 2;
            System.out.println(" x = " + d);
            System.out.println(" y = " + b);

        } else if (x > y) {
            d = ((x + y) / 2);
            b = x * y * 2;
            System.out.println(" x =  " + d);
            System.out.println(" y = " + b);

        } else {
            System.out.println("Error");
        }
    }

    public static void example15() {

        int opr1 = 7;
        int max = 10;
        int counter = 0;
        int res;

        while (counter <= max) {
            res = (opr1 * counter);
            System.out.println(opr1 + "*" + counter + "=" + res);

            ++counter;
        }

    }

    public static void example116() {

        //Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.

        int a = 15;
        int i = 100;
        int counter = 0;
        int res;
        while (counter <= a) {
            res = (i % 19);
            if (res == 0) {
                ++counter;
                System.out.println("15 чисел делящихся на 19: " + i);
            }
            ++i;
        }


    }

    public static void example117() {

        // Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 и
        // больших 500.

        int a = 20;
        int i = 500;
        int counter = 0;
        int res1;
        int res2;
        while (counter <= a) {
            res1 = (i % 13);
            res2 = (i % 17);

            if (res1 == 0 && res2 == 0) {
                ++counter;
                System.out.println("20 первых чисел,делящихся нацело на 13 и 17: " + i);
            }

            ++i;

        }
    }

    public static void example118() {

        //Посчитать сколько чисел в диапазоне от 0 до 1000 делится на 13

        int counter = 0;
        int x = 13;
        int max = 1000;
        int res;
        int i = 1;
        while (i <= max) {
            res = (i % x);

            if (res == 0) {
                ++counter;
            }
            ++i;
        }
        System.out.println("Количество чисел делящихся на 13: " + counter);


    }

    public static void example119() {
        //Вводишь число. И нужно написать цикл который покажет сколько в этом числе содержится цифер
        // которые делятся на 5

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = 5;
        int max;
        int res;
        int i = 1;

        System.out.println("Введите число MAX: ");
        max = scanner.nextInt();
        while (i <= max) {
            res = (i % y);

            if (res == 0) {
                ++x;

            }
            ++i;
        }
        System.out.println("Количество чисел делящихся на 5: " + x);

        // Обратный счетчик
       /* Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = 5;
        int max;
        int res = 0;
        System.out.println("Введите число MAX: ");
        max = scanner.nextInt();
        while (max > 0) {
            x = (max % y);
            if (x == 0) {
                res++;
            }
            max--;
        }
        System.out.println("Количество чисел делящихся на 5: " + res);*/


    }

    public static void cofee_machine() {
        // Простая кофе машина
        Scanner scanner = new Scanner(System.in);

        int button;

        while (true) {
            System.out.println("Дабро пожаловать!!!");

            System.out.println("Для выбора аммерикано нажмите: 1 ");

            System.out.println("Для выбора эспрессо нажмите: 2 ");

            System.out.println("Для выбора латте нажмите: 3 ");

            System.out.println("Для выбора капучино нажмите: 4 ");

            System.out.println("Сделайте Ваш выбор: ");
            button = scanner.nextInt();

            if (button == 1) {
                System.out.println("Вы выбрали кофе аммерикано.");
            } else if (button == 2) {
                System.out.println("Вы выбрали кофе эспрессо.");
            } else if (button == 3) {
                System.out.println("Вы выбрали кофе латте.");
            } else if (button == 4) {
                System.out.println("Вы выбрали кофе капучино.");
            } else {
                System.out.println("Вы ввели неправильное значение");
            }
        }
    }

    public static void continuEX() {
        //Создать цикл в котором будут генерироваться случайные числа, от 0 до 100
        // если это числдо делится на 2 то вывести результат деления
        // если чмсло делится на 3 то пропустить его и если случайно сгенерируемое число это 80
        // то завершить выполнение цикла.

        Random rand = new Random();
        while (true) {
            int a = rand.nextInt(100);
            System.out.println("Сген. число - " + a);

            if (a % 2 == 0) {
                System.out.println("Число делится на 2: " + (a / 2));
            } else if (a % 3 == 0) {
                System.out.println("Если число делится на 3 то простить");
                continue;
            }

            if (a == 80) {
                System.out.println("Сгенерированое число 80, завершаем выполнение цикла.");
                break;
            }
        }
    }

    public static void game() {
        int userInput1;
        int userInput2;
        int userInput3;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите первое число: ");
        userInput1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        userInput2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        userInput3 = scanner.nextInt();

        int i = 0;
        while (i < 10) {
            res1 = rand.nextInt(5) + 1;
            res2 = rand.nextInt(5) + 1;
            res3 = rand.nextInt(5) + 1;
            System.out.println(res1 + " " + res2 + " " + res3);
            ++i;
        }

        int cunter = 0;
        if (userInput1 == res1) {
            cunter++;
        }
        if (userInput2 == res2) {
            cunter++;
        }
        if (userInput3 == res3) {
            cunter++;
        }
        System.out.println("Количество угаданных значений: " + cunter);
    }


    public static void bandit() {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int res1;
        int res2;
        int res3;
        System.out.println(" Для старта нажмите Enter ");
        scanner.next();
        int i = 0;

        while (true) {
            while (i < 20) {
                res1 = rand.nextInt(10);
                res2 = rand.nextInt(10);
                res3 = rand.nextInt(10);
                System.out.println(res1 + " " + res2 + " " + res3);
                if (res1 == res2 && res2 == res3) {
                    System.out.println("Вы выиграли!!!");
                    break;
                }
                ++i;
            }

            if (i == 20) {
                System.out.println("Вы проиграли!!!");
            }

            System.out.println("Нажмите enter чтобы повторить ");
            i = 0;
            scanner.next();
        }
    }

    public static void classWorkExempl() {
        System.out.println("Задание №2");

        int[] erray = new int[10];
        erray[0] = 1;
        erray[1] = 0;
        erray[2] = 3;
        erray[3] = 4;
        erray[4] = 4;
        erray[5] = 5;
        erray[6] = 2;
        erray[7] = 1;
        erray[8] = 3;
        erray[9] = 4;

        int sum1 = 22;
        int sumElement = 0;
        for (int i = 0; i < erray.length; i++) {
            sumElement = sumElement + erray[i];
        }
        if (sum1 < sumElement) {
            System.out.println("Вы проходите в следующие соревнования");
        } else {
            System.out.println("Вы ен добрали очков");

        }

    }

}


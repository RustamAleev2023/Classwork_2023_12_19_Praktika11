import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2(10,20);
//        task3(10, "горизонтально", '*');
//        System.out.println(task4(4, 2, 3, 1));
//        System.out.println(task5(1, 5));
//        System.out.println(task6(101));
        System.out.println(task7(123420));
        System.out.println(task7(387423));
    }

    //Task1
    //Напишите метод, который отображает на экран фор-
    //матированный текст, указанный ниже
    //“Someone’s sitting in the shade today
    //because someone planted a tree a long time ago.”
    //Warren Buffet
    public static void task1() {
        System.out.println("\"Someone’s sitting in the shade today\n" +
                "because someone planted a tree a long time ago.\"\n" + "Warren Buffet");
    }

    //Task2
    //Напишите метод, который принимает два числа в качесте параметра и отображает все четные числа между ними.
    public static void task2(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task3
    //Напишите метод, который отображает горизонталь-
    //ную или вертикальную линию из некоторого символа.
    //Метод принимает в качестве параметра: длину линии,
    //направление, символ.
    public static void task3(int length, String direction, char symbol) {
        switch (direction) {
            case "вертикально" -> {
                for (int i = 0; i < length; i++) {
                    System.out.println(symbol);
                }
            }
            case "горизонтально" -> {
                for (int i = 0; i < length; i++) {
                    System.out.print(symbol);
                }
            }
        }
    }

    //Task4
    //Напишите метод, который возвращает максимальное
    //из четырёх чисел. Числа передаются в качестве параметров.
    public static int task4(int num1, int num2, int num3, int num4) {
        int[] numbers = new int[]{num1, num2, num3, num4};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //Task5
    //Напишите метод, который возвращает сумму чисел
    //в указанном диапазоне. Границы диапазона передаются
    //в качестве параметров.
    public static int task5(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }

    //Task6
    //Напишите метод, который проверяет является ли число
    //простым. Число передаётся в качестве параметра. Если
    //число простое нужно вернуть из метода true, иначе false.
    public static boolean task6(int number) {
        boolean[] result = new boolean[number - 2];
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result[count] = false;
                break;
            } else {
                result[count] = true;
                count++;
            }
        }

        if (Arrays.toString(result).contains("true")) {
            return true;
        } else
            return false;
    }

    //Task7
    //Напишите метод, который проверяет является ли
    //шестизначное число «счастливым». Число передаётся
    //в качестве параметра. Если число счастливое, нужно вернуть из метода true, иначе false
    public static boolean task7(int number){
        if (String.valueOf(number).length() != 6) {
            System.out.println("Введенное число не является шестизначным");
        }

        int[] digits = new int[6];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        int leftSum = 0;
        int rightSum = 0;
        int[] left = new int[3];
        int[] right = new int[3];

        for (int i = 0; i < 3; i++) {
            left[i] = digits[i];
            right[i] = digits[digits.length - 1 - i];
            leftSum += left[i];
            rightSum += right[i];
        }
        return leftSum == rightSum;
    }
}

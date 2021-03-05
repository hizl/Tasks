package Practice_tasks.Basics_of_software_code_dev_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        outputAllDivisors(new Scanner(System.in));
    }
    /*Линейный программы*/


    /*1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
    static int findFunction(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }


    /*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑏 + √𝑏^2 + 4𝑎𝑐/2𝑎) − 𝑎^3*𝑐 + 𝑏^−2*  **/
    static double evaluateExpressionValues1(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
    }

    /*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 / 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)tg xy); */
    static double evaluateExpressionValues2(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x * y));
    }


    /*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/
    static double swapExpression(double x) {
        double y = 0.0;
        double n = (int) x;
        return y = (x * 1000) % 1000 + (int) x / 1000.0;

    }


    /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
    static int findFunction(int sec) {


        return sec * 60;


    }

    /*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае: */
    static boolean thePointBelongsTo(int x, int y) {
        return x <= 4 && x >= -4 && y <= 4 && y >= -3;
    }



    /*Ветвления*/


    /*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
     он прямоугольным.*/
    static boolean isTriangle(double d1, double d2) {
        double x = d1 + d2;
        double thirdCornerOfTheTriangle = 180 - x;
        return thirdCornerOfTheTriangle == 90 ? true : false;

    }


    /*2. Найти max{min(a, b), min(c, d)}.*/
    static String maxAndMinNumbers(int a, int b, int c, int d) {
        int ab = Math.min(a, b);
        int cd = Math.min(c, d);
        return String.valueOf(ab) + " =a&b," + String.valueOf(cd) + " =c&d";
    }


    /*3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */
    static boolean isPointLiesOnTheLine(int x1, int x2, int x3, int y1, int y2, int y3) {
        return (x1 - y1) * (x2 - y2) * (x3 - y3) == 0 ? true : false;
    }


    /*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    отверстие.*/
    static boolean isWillPassTheBrickThroughTheHole(int A, int B, int x, int y, int z) {
        return (x <= A && y <= B || y <= A && x <= B ||
                x <= A && z <= B || z <= A && x <= B ||
                z <= A && y <= B || y <= A && z <= B);
    }


    /*Вычислить значение функции:  F(x)= x^2-3x+9, if x<=3; 1/x^3+6, if x>3.  */
    static double calculateTheValueOfAFunction(double x) {
        double firstResult = Math.pow(x, 2) - 3 * x + 9;
        double secondResult = 1 / Math.pow(x, 3) + 6;
        return x <= 3 ? firstResult : secondResult;
    }


    /*Циклы*/


    /*1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа*/
    static int sumNumbers(int number) {
        int result = 0;
        if (number <= 0) {
            return -1;
        } else {
            for (int i = 0; i <= number; i++) {
                result += i;
            }
        }
        return result;
    }


    /*2. Вычислить значения функции на отрезке [а,b] c шагом h:  y = x, x>2; -x,x <=2 */
    static int calculateTheValuesOfAFunctionOnASegment(int x) {
        int h = 0;
        if (x > 2) {
        }

        return 0;
    }

    /*3. Найти сумму квадратов первых ста чисел.*/
    static int sumOfSquaresOfNumbers() {
        int sum = 0;
        int upperBound = 100;
        for (int i = 0; i <= upperBound; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    /*4. Составить программу нахождения произведения квадратов первых двухсот чисел.*/
    static BigInteger compositionSumOfSquaresOfNumbers() {
        BigInteger number = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            number = number.multiply(BigInteger.valueOf((long) i * i));
        }
        return number;
    }


    /*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид: a n = 1/2^n+1/3^n */


    /*6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/
    static void symbolsAndNumbers() {
        for (long i = 32; i <= 65536; i++) {
            System.out.printf("%d %s\n%n", i, (char) i);
        }
    }

    /*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.*/

    static void outputAllDivisors(Scanner scanner) {
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (number % j == 0) {
                    System.out.print(j + " ");
                    number = number / j;
                }

            }
        }


    }




    /*8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/


}

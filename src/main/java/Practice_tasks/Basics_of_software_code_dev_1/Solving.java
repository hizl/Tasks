package Practice_tasks.Basics_of_software_code_dev_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Solving {
    public static void main(String[] args) {
        System.out.println(maxAndMinNumbers(13, 43, 44, 55));

    }
    /*Линейный программы*/


    /*1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
    static int findFunction(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }


    /*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑏 + √𝑏^2 + 4𝑎𝑐/2𝑎) − 𝑎^3*𝑐 + 𝑏^−2*  **/
    static int evaluateExpressionValues1(int a, int b, int c) {
        return a;
    }

    /*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 / 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) * tg xy; */
    static int evaluateExpressionValues2(int x, int y) {

        return x;

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
    static HashMap<Integer, String> findFunction(int sec) {
        HashMap<Integer, String> map;


        String hours = "hour";
        String minutes = "min";
        String seconds = "sec";

        return null;
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



}

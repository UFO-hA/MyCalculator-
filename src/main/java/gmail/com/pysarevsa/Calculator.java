package gmail.com.pysarevsa;

import static java.lang.Math.sqrt;

public class Calculator { // калькулятор
    public static int test = 1;
    public static float runCalculate(float first, String simvol, float second) {

        switch (simvol) { //тело вычислителя
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second == 0) {
                    System.out.println("Делитель не может быть равен \"0\". \nНа ноль, делить нельзя!!!");
                } else {
                    return first / second;

                }
            default:
                return 0;
        }

    }

    public static float runSqrt(float first) {  // вычисление корня
        return (float) sqrt(first);

    }

}

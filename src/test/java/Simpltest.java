import gmail.com.pysarevsa.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Simpltest {

    @Test
    void Testclass() {
        Random ram = new Random();

        Float a = Math.round(ram.nextFloat() * 100 * 10) / 100f;
        Float b = Math.round(ram.nextFloat() * 100 * 10) / 100f;

        String umno = "*";
        String plus = "+";
        String minus = "-";
        String delenie = "/";
        Float sqrt = Calculator.runSqrt(a);

        Float outplus = Calculator.runCalculate(a, plus, b);
        Float outminus = Calculator.runCalculate(a, minus, b);
        Float outdelenie = Calculator.runCalculate(a, delenie, b);
        Float outumno = Calculator.runCalculate(a, umno, b);

        System.out.println("Первое число- " + a + "\n" + "Второе число- " + b);
        System.out.println("Результат сложения- " + outplus + "\n" + "Результат вычитания- " + outminus + "\n" + "Результат деления- " + outdelenie + "\n" + "Результат умножения- " + outumno);
        System.out.println("Квадрат числа- " + sqrt);


    }


}

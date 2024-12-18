package gmail.com.pysarevsa;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String HELLO = "Здравствуйте, я калькулятор.";
        //String warning = "Делитель не может быть равен \"0\". \nНа ноль, делить нельзя!!!";
        //String warning2 = "Допустимые действия - \"+\" \"-\"  \"/\"  \"*\"  \"sqrt\"";
        String help = "Тут будут инструкции";
        String otvet = "Результат = ";
        String number1 = "Введите первое значение:";
        String number2 = "Введите второе значение:";
        String znak = "Введите действие: [-] [+] [/] [*] [sqrt]";
        String checkPattern = "^[+\\-\\*/sqrt]+$";
        String textkoren = "Корень числа ";


        Scanner in = new Scanner(System.in); //Ввод данных
        System.out.println(HELLO);

        float first;
        String simvol;
        float second;

        System.out.println(number1); //просим ввести первое число
        while (true) {
            try {
                first = in.nextFloat();

                break;
            } catch (InputMismatchException e) {

                System.out.println("Ошибка! Вы ввели некорректное значение. Попробуйте снова.");
                in.nextLine();
            }
        }

        if (first == 911) {  //пытаемся вывести разде HELP
            System.out.println(help);
            System.exit(0);
        }

        in.nextLine(); // очистка буфера

        System.out.println(znak);// просим знак

        while (true) {
            simvol = in.nextLine(); // знак действия

            if (Pattern.matches(checkPattern, simvol)) {
                break;
            } else {
                System.out.println("Некорректный ввод знака");
            }
        }

        if (simvol.equals("sqrt")) {  //вычисления корня
            float sqrtOUT = Calculator.runSqrt(first);
            System.out.println(textkoren + first + " = " + sqrtOUT);
            System.exit(0);
        }
        System.out.println(number2); //просим ввести второе число
        while (true) {
            try {
                second = in.nextFloat();

                break;
            } catch (InputMismatchException e) {

                System.out.println("Ошибка! Вы ввели некорректное значение. Попробуйте снова.");
                in.nextLine();
            }
        }

        float resalt = Calculator.runCalculate(first, simvol, second);
        System.out.println(otvet + resalt);
        in.close();


    }
}
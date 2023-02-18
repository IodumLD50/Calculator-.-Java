import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(" ------------------------------------------------------------------------------------------------------------------");
        System.out.println("    1. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.          ");
        System.out.println("    2. Числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.  ");
        System.out.println("    3. Калькулятор умеет работать только с целыми числами.                                                          ");
        System.out.println("    4. При вводе пользователем строки вроде 3 + II калькулятор выбрсывает исключение и прекращает свою работу.      ");
        System.out.println("    5. Для ввода можно использовать только два операнда и один оператор                                             ");
        System.out.println("    6. Пример ввода: a + b, a - b, a * b, a / b.                                                                    ");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");

        Scanner calc = new Scanner(System.in);//Создали ввод с консоли методом Scanner
        System.out.println("Введите пример: ");
        String input  = calc.nextLine(); //Создали строку (переменная input) для ввода данных
        System.out.println("Ответ: " );
        System.out.println(Calc.calc(input));
    }
}

public class Calc {

    private static Object number1;
    private static Object number2;
    private static Object args;
    /**
     * примитивные типы данных
     * int - число целое // POPULAR
     * double - число десятичное // POPULAR
     * float - число десятичное
     * short - число целочисленное
     * long - число целочисленное
     * boolean - логическое // POPULAR
     * char - символ
     */

// string - ссылочный тип (последовательность char) // POPULAR
// пременная: тип / имя / значение; объявлена / инициализирована
// const - переменная, но не изменяемая

    double Param1; // 10
    double Param2; // 5
    double result;
    static char operation; // + - / *

    Calc(double number1, double number2, char operation){
        switch (operation) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case'/':
                System.out.println(number1 / number2);
                break;
        }
    }
    public static void main(String[] args) {
        new Calc(10, 5, '/');
    }
}
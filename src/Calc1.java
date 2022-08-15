public class Calc1 {
    int Param1; // 10
    int Param2; // 5
    static char operation; // + - / *

    static void Calc1(int number1, int number2, char operation){
        if (operation == '+') {
            System.out.println(number1 + number2);
        } else if (operation == '-') {
            System.out.println(number1 - number2);
        } else if (operation == '*'){
            System.out.println(number1 * number2);
        }else if (operation == '/'){
            System.out.println(number1 / number2);
        }else {
            System.out.println("0");
        }
        }
public static void main(String[] args) {
        Calc1(10, 5, '/');
        }
    }

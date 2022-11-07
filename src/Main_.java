import java.util.Scanner;

public class Main_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Обычная дробь (проверка того что принимает, и может перевести)
        String a = in.next();
        Fraction fraction1 = new Fraction(a);
        System.out.println(fraction1.toDecimal());
        //Число с плавающей точкой (аналогично проверка)
        Double b = in.nextDouble();//Число вводится с запятой, можно сделать чтобы работало с точкой через setLocale
        Fraction fraction2 = new Fraction(b);
        System.out.println(fraction2);
        //сумма
        int n = in.nextInt();
        Fraction fraction3 = new Fraction(a);
        fraction3.sum(n);
        System.out.println(fraction3);//результат в виде дроби
        System.out.println(fraction3.toDecimal());//результат в виде числа с плавающей точкой
        //произведение
        int f = in.nextInt();
        Fraction fraction4 = new Fraction(a);
        fraction4.mult(f);
        System.out.println(fraction4);//результат в виде дроби
        System.out.println(fraction4.toDecimal());//результат в виде числа с плавающей точкой
    }
}
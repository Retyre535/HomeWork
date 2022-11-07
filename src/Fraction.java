import java.util.Scanner;

public class Fraction { // обыкновенная дробь
    private int numerator = 0;
    private int denominator = 1;

    Fraction(int numerator, int denominator) {
        System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }

    Fraction(String common_fraction){
        int numerator=0, denominator=0;
        int b = common_fraction.indexOf('/');
        for(int i=0;i<b;i++){
            char a = common_fraction.charAt(i);
            numerator=a-'0'+numerator;
            numerator*=10;
        }
        for(int i=b+1;i<common_fraction.length();i++){
            char a = common_fraction.charAt(i);
            denominator=a-'0'+denominator;
            denominator*=10;
        }
        numerator/=10;
        denominator/=10;
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(Double floating_point_number){
        double b = floating_point_number;
        int denominator=1;
        int a = (int)b;
        String d = Double.toString(b);
        String h = Integer.toString((int)b);
        int f = d.length()-h.length()-1;
        for(int i=0;i<f;i++){
            b *= 10;
            denominator*=10;
        }
        int numerator=(int)b;
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
    public void mult(int b) {
        Scanner in = new Scanner(System.in);
        int numerator=1, denominator=1;
        for (int i=0;i<b;i++) {
            Fraction frack = new Fraction(in.next());
            numerator*=this.numerator;
            denominator*=this.denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }
    public void sum(int n){
        Scanner in = new Scanner(System.in);
        int denominator=this.denominator, numerator=this.numerator;
        for (int i=0;i<n;i++){
            Fraction frack = new Fraction(in.next());
            int a = this.denominator;
            int b = denominator;
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            numerator*= this.denominator/(a+b);
            numerator+= denominator*this.numerator/(a+b);
            denominator*= this.denominator/(a+b);
        }

    }
}
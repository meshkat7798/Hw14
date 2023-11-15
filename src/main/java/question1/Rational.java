package question1;

import lombok.*;

@NoArgsConstructor
@ToString
public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        } else {
        this.denominator = denominator;
    }
}
    public  int toInteger(){
        return this.numerator/this.denominator;
    }

    public void rationalToString(){
        int num = this.numerator;
        Rational rational = this.simplify();
        int integer = rational.toInteger();
        if (rational.numerator!= num){
            System.out.println("0/1");
        }else {
            if (rational.numerator>rational.denominator) {
                if (rational.numerator % rational.denominator == 0) {
                    System.out.println(integer);
                } else {
                    System.out.println(integer + " + " +   (rational.numerator-(integer*rational.denominator)) + "/"+ rational.denominator);
                }
            } else if(rational.denominator>rational.numerator) {
                if (rational.negativeControl()){
                    String numer = "-" + Math.abs(rational.numerator);
                    System.out.println(  numer+ "/" + rational.denominator);
                }else{
                    System.out.println(  rational.numerator + "/" + rational.denominator);}
            }else {
                System.out.println("1");
            }
        }
    }
    public Rational simplify() {
        int gcd = gcd(Math.abs(this.numerator),this.denominator);
        this.numerator = this.numerator /gcd;
        this.denominator = this.denominator /gcd;
        return this;}


    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public Rational add(Rational num) {
        int numer = this.numerator * (lcm(this.denominator, num.denominator) / this.denominator) +
                num.numerator * (lcm(this.denominator, num.denominator) / num.denominator);
        int denom = lcm(this.denominator, num.denominator);
        Rational subNum = new Rational(numer,denom);
        subNum.simplify();
        return subNum;
    }
    public Rational sub(Rational num) {
        int numer = this.numerator * (lcm(this.denominator, num.denominator) / this.denominator) -
                num.numerator * (lcm(this.denominator, num.denominator) / num.denominator);
        int denom = lcm(this.denominator, num.denominator);
        Rational subNum = new Rational(numer,denom);
        subNum.simplify();
        return subNum;
    }
    public boolean negativeControl(){
        return this.numerator<0;
    }

    public Rational multiple(Rational num){
        int numer = this.numerator*num.numerator;
        int denom=this.denominator*num.denominator;
        Rational subNum = new Rational(numer,denom);
        subNum.simplify();
        return subNum;
    }

    public Rational devide(Rational num){
        int numer = this.numerator*num.denominator;
        int denom =this.denominator*num.numerator;
        Rational subNum = new Rational(numer,denom);
        subNum.simplify();
        return subNum;
    }

    public static double toFloat(Rational num){
        double numer = num.numerator;
        double demon = num.denominator;
        double floatNum = numer/demon;
        System.out.println(floatNum);
        return floatNum;
    }

}


package edu.German;

public class Main {

    public static void main(String[] args) {
    Fraction fraction1 = new Fraction(2,3);
    Fraction fraction2 = new Fraction(5,2);
    fraction1.equals(new Object());

        Divide Divide = new Divide(fraction1, fraction2);
        Fraction result = Divide.execute();

        Pow pow = new Pow(fraction1,2);
        result = pow.execute();
        System.out.println(result);
    }


}

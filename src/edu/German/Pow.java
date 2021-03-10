package edu.German;

public class Pow {
    private Fraction fraction;
    private int pow;

    public Pow(Fraction fraction, int pow) {
        this.fraction = fraction;
        this.pow = pow;
    }

    public Fraction execute() {
        int numerator = (int) Math.pow(this.fraction.getNumerador(),this.pow);
        int denominator = (int) Math.pow(this.fraction.getDenominador(),this.pow);
        return new Fraction(numerator,denominator);
    }


}

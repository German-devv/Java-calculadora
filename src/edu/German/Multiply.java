package edu.German;

public class Multiply extends Operation {
    private final Fraction fractionA;
    private final Fraction fractionB;

    public Multiply(Fraction fractionA, Fraction fractionB) {
        this.fractionA = fractionA;
        this.fractionB = fractionB;
    }



    @Override
    public Fraction execute() {
        int numerator = this.fractionA.getNumerador()*this.fractionB.getNumerador();
        int denominator = this.fractionA.getDenominador()*this.fractionB.getDenominador();
        return new Fraction(numerator,denominator);
    }
}


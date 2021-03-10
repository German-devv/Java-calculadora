package edu.German;

public class Divide extends  Operation {
    private final Fraction fractionA;
    private final Fraction fractionB;

    public Divide(Fraction fractionA, Fraction fractionB) {
        this.fractionA = fractionA;
        this.fractionB = fractionB;
    }

    @Override
    public Fraction execute() {
        int numerator = this.fractionA.getNumerador()*this.fractionB.getDenominador();
        int denominator = this.fractionA.getDenominador()*this.fractionB.getNumerador();
        return new Fraction(numerator,denominator);
    }
}

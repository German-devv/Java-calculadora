package edu.German;

import java.util.Objects;

public class Fraction {
    private final int numerador;
    private final int denominador;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int compareTo(Fraction fraction){
        Integer numerator1 = this.numerador* fraction.denominador;
        return numerator1.compareTo(this.denominador* fraction.numerador);

       // return Integer.compare(numerador1, numerador2);

    }

    public Fraction(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public boolean isEquivalent(Fraction fraccion1) {
        return this.numerador * fraccion1.denominador == this.denominador * fraccion1.numerador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerador == fraction.numerador &&
                denominador == fraction.denominador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerador, denominador);
    }


    @Override
    public String toString() {
        return this.numerador +":"+ this.denominador;
    }



}

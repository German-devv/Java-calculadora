package edu.German;

public enum FractionType {
    NULL,
    UNITY,
    PROPER,
    IMPROPER;

    public static FractionType from(Fraction fraction){
        if (fraction.getNumerador() == 0){
            return FractionType.NULL;
        }
        else if(fraction.getNumerador() == fraction.getDenominador()){
            return FractionType.UNITY;
        }else if (Math.abs(fraction.getNumerador()) < Math.abs(fraction.getDenominador()) ){
            return FractionType.PROPER;
        }else {
            return FractionType.IMPROPER;
        }
    }
}

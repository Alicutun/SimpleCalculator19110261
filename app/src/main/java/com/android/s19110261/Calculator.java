package com.android.s19110261;
import static java.lang.Double.NaN;
import static java.sql.Types.FLOAT;
import static java.sql.Types.NULL;
public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW, FAC, LOG}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }

    public Double fac(double firstOperand) {

        if (firstOperand % 1 != 0){
            return null;
        }
        double result=1;

        for(int i = 1;i<= Math.abs(firstOperand);i++){
            result*=i;
        }
        if (firstOperand <0)
            result = -result;
        if (firstOperand == 0)
            result = NaN;
        return result;
    }
    public double log ( double firstOperand, double secondOperand){
        return Math.log(secondOperand) / Math.log(firstOperand);
    }
}
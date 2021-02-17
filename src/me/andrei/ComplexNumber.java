package me.andrei;

public class ComplexNumber {
    private double x;
    private double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ComplexNumber() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public static ComplexNumber somaStatic(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x + b.x, a.y + b.y);
    }

    public ComplexNumber soma(ComplexNumber a, ComplexNumber b) {
        return somaStatic(a, b);
    }

}

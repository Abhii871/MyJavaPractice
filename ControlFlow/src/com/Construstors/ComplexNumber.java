package com.Construstors;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(2.5, -1.5);
        one.add(19.5);
        System.out.println("one.real =" + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
/*
    public void add(double real, double imaginary) {
        double real1 = (real + this.getReal());
        double imaginary1 = (imaginary + this.getImaginary());
        this.real = real1;
        this.imaginary = imaginary1;
    }*/
    public void add(double a) {
       /* double real1 = (real + this.getReal());
        double imaginary1 = (imaginary + this.getImaginary());
        this.real = real1;
        this.imaginary = imaginary1;*/

       real+=a;
        imaginary+=a;

    }
    public void subtract(double real, double imaginary) {
        double real1 = (real - this.getReal());
        double imaginary1 = (imaginary - this.getImaginary());
        this.real = real1;
        this.imaginary = imaginary1;
    }
}

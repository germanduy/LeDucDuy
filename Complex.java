package com.company;

public class Complex {
    public double realPart;
    public double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart){
        this.realPart= realPart;
        this.imaginaryPart = imaginaryPart;
    }

     public Complex add(Complex ortherNumber){
        Complex tong = new Complex(0.0,0.0);
        tong.realPart = this.realPart+ ortherNumber.realPart;
        tong.imaginaryPart = this.imaginaryPart + ortherNumber.imaginaryPart;
        return tong;
     }
    public Complex subtract(Complex ortherNumber){
        Complex hieu = new Complex(0.0,0.0);
        hieu.realPart = this.realPart- ortherNumber.realPart;
        hieu.imaginaryPart = this.imaginaryPart - ortherNumber.imaginaryPart;
        return hieu;
    }
    public Complex multiply(Complex ortherNumber){
        Complex tich = new Complex(0.0,0.0);
        tich.realPart = this.realPart* ortherNumber.realPart- this.imaginaryPart*ortherNumber.imaginaryPart;
        tich.imaginaryPart = this.imaginaryPart*ortherNumber.imaginaryPart + ortherNumber.realPart*this.imaginaryPart;
        return tich;
    }
    public Complex divide(Complex ortherNumber){

        Complex thuong = new Complex(0.0,0.0);
        thuong.realPart = (this.realPart*ortherNumber.realPart+this.imaginaryPart*ortherNumber.imaginaryPart)/(ortherNumber.realPart*ortherNumber.realPart+ortherNumber.imaginaryPart*ortherNumber.imaginaryPart);
        thuong.imaginaryPart = -(this.realPart*ortherNumber.imaginaryPart+this.realPart*ortherNumber.realPart)/(ortherNumber.realPart*ortherNumber.realPart+ortherNumber.imaginaryPart*ortherNumber.imaginaryPart);
        return thuong;
    }
    public String toString(Complex number){
        String xtx = "";
        xtx = "Phần thực là: " + number.realPart + "\n" + "Phần ảo là: " + number.imaginaryPart;
        return xtx;
    }



}

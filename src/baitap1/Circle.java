package baitap1;

public class Circle {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    //phuong thuc
    public double getS(){
        return 3.14*r*r;
    }
    public double getCV(){
        return 2*3.14*r;
    }
}

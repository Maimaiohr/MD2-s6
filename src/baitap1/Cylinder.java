package baitap1;

public class Cylinder extends Circle{
    private double h;

    public Cylinder(double r) {
        super(r);
    }

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    //the tich
    public double getV(){
        return 3.14*this.getR()*this.getR()*h;
    }
}

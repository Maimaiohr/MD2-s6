package baitap3;

public class bai3 {
    private double side1;
    private double side2;
    private double side3;

    public bai3() {
    }

    public bai3(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void getArea(){
        double p = (side1 + side2 + side3) / 2;
        double s =(p*(p-side1)*(p-side2)*(p-side3))/2;
        System.out.println("dien tich tam giac la:"+s);
    }
    public  void getPerimeter(){
        double C = (side1 + side2 + side3);
        System.out.println("chu vi la:"+C);
    }
}

package baitap1;

public class Test {
    public static void main(String[] args) {
        //tao hinh tron
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3,5);
        System.out.println("the tich"+ cylinder.getV());
        System.out.println("chu vi"+circle.getCV());
        System.out.println("dien tich"+ circle.getS());
        

    }
}

package baitap5;

public class test extends ArrayCalculator{
    public static void main(String[] args) {
        int[] intArray = { 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5};

        System.out.println("Giá trị lớn nhất trong mảng số nguyên là: " + maxOfArray(intArray));
        System.out.println("Giá trị lớn nhất trong mảng số thực là: " + maxOfArray(doubleArray));

        System.out.println("Giá trị nhỏ nhất trong mảng số nguyên là: " + minOfArray(intArray));
        System.out.println("Giá trị nhỏ nhất trong mảng số thực là: " + minOfArray(doubleArray));
    }
}

package baitap4;public class test extends ArrayCalculator{
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.5, 2.5, 3.5};

        System.out.println("Tổng của mảng số nguyên là: " + sumOfArray(intArray));
        System.out.println("Tổng của mảng số thực là: " + sumOfArray(doubleArray));
    }
}

package baitap5;

public class ArrayCalculator {
    public static int maxOfArray(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }return max;
    }
    public static double maxOfArray(double[] arr){
        double max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }return max;
    }
    public static int minOfArray(int[] arr){
        int min = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }return min;
    }
    public static double minOfArray(double[] arr){
        double min = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }return min;
    }
}

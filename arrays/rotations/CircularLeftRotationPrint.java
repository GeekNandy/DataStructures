package arrays.rotations;

public class CircularLeftRotationPrint {
    public static void main(String... args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 2; // the factor by which the array needs to be rotated
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[(i+k)%arr.length]+" ");
        }
    }
}

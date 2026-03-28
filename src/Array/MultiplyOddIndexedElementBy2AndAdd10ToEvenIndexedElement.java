package Array;

public class MultiplyOddIndexedElementBy2AndAdd10ToEvenIndexedElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,8,3,9};
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0) {
                arr[i] += 10;
            }
            else arr[i] *= 2;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

package Array;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("two sum");
        boolean found = twoSum();
        System.out.println("Found? " + found);

    }

    public static boolean twoSum(){
        int[] arr = {2,5,3,8,9,-1};
        int target = 2;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }

}


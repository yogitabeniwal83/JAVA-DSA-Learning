package Methods;

public class MaxOfTwo {
    public static int max(int a, int b){
        if(a>=b) return a;
        else return b;
    }
    public static void main(String[] args) {
        System.out.println(max(4,9));
    }
}

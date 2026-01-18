package Methods;

public class ReturnMandatory {
    public static void main(String[] args) {
        System.out.println(ananya(3));
    }
    public static int ananya(int a){
        if(a<5){
            return a;
        }
        else return -9;   // agr hum if statement use krte h to else statement bhi likhne pdegei kyu java me agr hm int ya koi or data type lete h to return hit hona jruri h
    }
}

package Methods;

public class Syntax {
//    public static void yogita(){
//        System.out.println("beniwal");
//        for(int i=1; i<=5; i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        yogesh();
//        System.out.println("hello");
//        yogita();
//    }
//    public static void yogesh(){
//        System.out.println("hiii");
//    }


    public static void shravan(){
        karan();
        System.out.println("khushi");
    }
    public static void main(String[] args) {
        riyanshi();
    }
    public static void karan(){
        System.out.println("YASHIKA");
    }
    public static void riyanshi(){
        karan();
        shravan();
        System.out.println("ajay");
        shravan();
    }
}

/*
output->
YASHIKA
YASHIKA
khushi
ajay
YASHIKA
khushi

 */

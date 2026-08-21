package basic;

public class CharDataType {
    public static void main(String[] args) {
        char x = 'a';
        System.out.println(x);

        char adi = '7';
        System.out.println(adi);

        char eva = '+';
        System.out.println(eva);

        // type casting -> ak data type se dusre dat type me convert krna
        char ch = 'A';
        int y = ch;    // implicit typecasting
        System.out.println(y);


        char z = 'a';
        int b = (int)z;   // explicit typecasting
        System.out.println(b);


        char yogita = '3';
        System.out.println( (int)yogita );


        char p = 'A';
        System.out.println(p*p);




        // Integer to Character

        int q = 65;
        char l = (char)q;
        System.out.println(l);
    }
}

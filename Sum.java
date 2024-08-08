import java.util.*;
class Num{
    int a, b, c;

    void inPut(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num: ");
        a = sc.nextInt();
        System.out.println("Another: ");
        b = sc.nextInt();
    }

    void sum(){
        c = a+b;

        System.out.println(c);
    }

    public static void main(String []args){
        Num calc=new Num();

        calc.inPut();
        calc.sum();
    }
}
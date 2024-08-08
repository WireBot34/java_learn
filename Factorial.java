import java.util.*;

class Factorial{
    int n, i, f = 1;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        n = sc.nextInt();
        sc.close();
    }

    void fact(){
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }

    System.out.printf("Factorial Of The Number Is: "+f);
    }

    public static void main(String[] args){
        Factorial factcal=new Factorial();
        factcal.input();
        factcal.fact();
        
    }
}
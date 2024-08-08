import java.util.*;
public class PinValidator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin: ");
        int x = sc.nextInt();
        
        if(x == 3426)
            System.out.println("Ur correct lol");
        else
            System.out.println("Wot?");
    }
}

public class Seq {
    public static void main(String[] args){
        int sign = -1, n=4, k=1;
        System.out.println("The seq Is: ");
        System.out.printf("%d\t%d\t", -(n-1),n);
        for(int i=1;i<10;i++){
            k*=2;
            n+=k;
            
        }
    }
}

import java.util.Scanner;
public class reverseNo {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the no. which you want to reverse");
        int no =s.nextInt();
        int rem, rev =0;
        while(no != 0){
            rem =no % 10;
            rev = rev * 10 +rem;
            no= no /10;
        }
        System.out.println("Reverse of number is "+rev);
        s.close();
    }
    
}

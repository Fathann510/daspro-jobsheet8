import java.util.Scanner;

public class Triangle12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int i = 0;
        while(i <= n) {
            //System.out.print("[i=" +  i + "] "); //temporary debug
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        input.close();
    }    
}

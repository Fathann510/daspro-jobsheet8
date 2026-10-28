import java.util.Scanner;

public class GroupScore12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Group: ");
        int numGroups = input.nextInt();
        System.out.print("Enter the number of Graders: ");
        int numGraders = input.nextInt();

        if(numGroups <= 0 || numGraders <= 0) {
            System.out.println("Group and Grader must > 0 ");
        }else {
            int groupNo = 1, bestGroup = 0;
            double highestAverage = -1;
            
            while(groupNo <= numGroups) {
                System.out.println("Group " + groupNo);
                double totalScore = 0;
            }
        }
    }    
}

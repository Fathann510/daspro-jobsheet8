import java.util.Scanner;

public class GroupScore12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Group: ");
        int numGroups = sc.nextInt();
        System.out.print("Enter the number of Graders: ");
        int numGraders = sc.nextInt();

        if(numGroups <= 0 || numGraders <= 0) {
            System.out.println("Group and Grader must > 0 ");
        }else {
            int groupNo = 1, bestGroup = 0;
            double highestAverage = -1;
            
            while(groupNo <= numGroups) {
                System.out.println("Group " + groupNo);
                double totalScore = 0;
                for(int j = 1; j <= numGraders; j++){
                    int score;
                    do{
                        System.out.print(" Score from Grader " + j + ": ");
                        score = sc.nextInt();
                        if(score < 0 || score > 100){
                            System.out.println("Score must be 0-100. Retry!");
                        }
                    }while (score < 0 || score > 100);
                    totalScore += score;
                }
                double averageScore = totalScore / numGraders;
                System.out.println("Group " + groupNo + ": average score = " + averageScore);

                if(averageScore > highestAverage) {
                    highestAverage = averageScore;
                    bestGroup = groupNo;
                }
                groupNo++;
            }
            System.out.println("==============================");
            System.out.println("Best group         : " + bestGroup);
            System.out.println("Highest average    : " + highestAverage);
        }
        sc.close();
    }  
}

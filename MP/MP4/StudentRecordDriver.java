import java.util.*;

public class StudentRecordDriver
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        int userchoice = 0;

        StudentRecord a = new StudentRecord();
        do{
            System.out.println("\nWelcome to the simple gradebook!");

            System.out.println("\nPlease select an option:");
            System.out.println("(1) Enter Quiz Scores");
            System.out.println("(2) Enter Mid-Term Score");
            System.out.println("(3) Enter Final Score");
            System.out.println("(4) Display Total Final Grade");
            System.out.println("(5) Quit");

            System.out.print("Your choice: ");
            userchoice = keys.nextInt();

            if(userchoice == 1){
                System.out.println("\nPlease enter a quiz score and then press enter. You must enter 2 quiz scores.");

                System.out.print("Quiz 1 score: ");
                double quizOneScore = keys.nextDouble();

                System.out.print("Quiz 2 score: ");
                double quizTwoScore = keys.nextDouble();

                a.setQuizGrade(quizOneScore, quizTwoScore);
            }

            else if(userchoice == 2){
                System.out.print("\nPlease enter a mid-term score between 0 and 100: ");
                int midtermScore = keys.nextInt();

                if(midtermScore < 0 | midtermScore > 100){
                    System.out.print("Invalid input");
                }
                else{
                    a.setMidtermGrade(midtermScore);
                }
            }

            else if(userchoice == 3){
                System.out.print("\nPlease enter a final score between 0 and 100: ");
                double finalScore = keys.nextDouble();

                if(finalScore < 0 | finalScore > 100){
                    System.out.print("Invalid input");
                }
                else{
                    a.setFinalsGrade(finalScore);
                }
            }

            else if(userchoice == 4){
                double finalNumeric = a.overallNumeric();
                String finalLetter = a.finalLetter();
                
                System.out.printf("Weighted Average = %f Letter Grade = %s",finalNumeric, finalLetter);
            }

            else{
                System.exit(0);
            }

        }while(userchoice != 5);
    }
}
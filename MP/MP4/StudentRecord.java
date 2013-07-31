public class StudentRecord
{
    private double quizGrade;
    private double midtermGrade;
    private double finalsGrade;
    private double overallNumeric;
    private String finalLetter;

    public StudentRecord(){
        double quizGrade = 0;
        double midtermGrade = 0;
        double finalsGrade = 0;
        double overallNumeric = 0;
        String finalLetter = "F";
    }

    public double getQuizGrade(){
        return quizGrade;
    }

    public double getMidtermGrade(){
        return midtermGrade;
    }

    public double getFinalsGrade(){
        return finalsGrade;
    }

    public double getOverallNumeric(){
        return overallNumeric;
    }

    public String getFinalLetter(){
        return finalLetter;
    }

    public void setMidtermGrade(double midtermGrade){
        this.midtermGrade = midtermGrade;
    }

    public void setFinalsGrade(double finalsGrade){
        this.finalsGrade = finalsGrade;
    }

    public void setQuizGrade(double quiz1, double quiz2){
        quizGrade = ((quiz1 + quiz2) / 2) * 10;
    }
    
    public double overallNumeric(){
        overallNumeric = (quizGrade * 0.25) + (finalsGrade * 0.50) + (midtermGrade * 0.25);
        return overallNumeric;
    }
    
    public String finalLetter(){
        if(overallNumeric >= 90){
            finalLetter = "A";
        }
        else if(overallNumeric >= 80 & overallNumeric < 90){
            finalLetter = "B";
        }
        else if(overallNumeric >= 70 & overallNumeric < 80){
            finalLetter = "C";
        }
        else if(overallNumeric >= 60 & overallNumeric < 70){
            finalLetter = "D";
        }
        else{
            finalLetter = "F";
        }
        return finalLetter;
    } 
}
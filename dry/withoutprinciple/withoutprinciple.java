
import java.util.HashMap;
import java.util.Map;

class NonDRYExample {
    public static void main(String[] args) {
        // Student data
        String name = "Alice";
        int mathScore = 85;
        int scienceScore = 92;
        int historyScore = 78;
        
        // Calculate grades using separate methods
        String mathGrade = calculateMathGrade(mathScore);
        String scienceGrade = calculateScienceGrade(scienceScore);
        String historyGrade = calculateHistoryGrade(historyScore);
        
        // Print report card
        System.out.println("Student: " + name);
        System.out.println("Math Grade: " + mathGrade);
        System.out.println("Science Grade: " + scienceGrade);
        System.out.println("History Grade: " + historyGrade);
    }
    
    public static String calculateMathGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static String calculateScienceGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static String calculateHistoryGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
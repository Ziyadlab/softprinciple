
import java.util.HashMap;
import java.util.Map;

class DRYExample {
    public static void main(String[] args) {
        // Student data
        String name = "Alice";
        
        // Create a map to store subject scores
        Map<String, Integer> scores = new HashMap<>();
        scores.put("math", 85);
        scores.put("science", 92);
        scores.put("history", 78);
        
        // Create a map to store subject grades
        Map<String, String> grades = new HashMap<>();
        
        // Calculate grades for all subjects using the same function
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String subject = entry.getKey();
            Integer score = entry.getValue();
            grades.put(subject, calculateGrade(score));
        }
        
        // Print report card
        System.out.println("Student: " + name);
        for (Map.Entry<String, String> entry : grades.entrySet()) {
            String subject = entry.getKey();
            String grade = entry.getValue();
            // Capitalize the first letter of the subject
            String capitalizedSubject = subject.substring(0, 1).toUpperCase() + subject.substring(1);
            System.out.println(capitalizedSubject + " Grade: " + grade);
        }
    }
    
    /**
     * Calculate a letter grade based on a numerical score.
     * @param score The numerical score
     * @return The corresponding letter grade
     */
    public static String calculateGrade(int score) {
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
============================================
  DRY (DON'T REPEAT YOURSELF) PRINCIPLE
============================================
This project demonstrates the *DRY Principle* using Java programming examples.  
The project is divided into two parts:
1️⃣ withoutdry → *Violating DRY Principle*  
2️⃣ withdry → *Applying DRY Principle*  
By following this principle, we improve *maintainability, readability, and reduce bugs*.
--------------------------------------------
🚀 WHAT IS THE DRY PRINCIPLE?
--------------------------------------------
The *DRY Principle* states that *every piece of knowledge must have a single, unambiguous representation within a system*.  
This *reduces duplication* and *ensures consistency*.
--------------------------------------------
❌ WITHOUT DRY PRINCIPLE (Bad Design)
--------------------------------------------
📂 *Package:* withoutdry
In this design, we have three separate methods for calculating grades for different subjects.  
However, *the grading logic is identical* for all subjects, so duplicating it violates DRY.
🔹 *Classes:*
   - NonDRYExample.java: Contains duplicated grade calculation methods.
   ```java
   public static String calculateMathGrade(int score) {
       if (score >= 90) return "A";
       else if (score >= 80) return "B";
       // ... and so on
   }
   
   public static String calculateScienceGrade(int score) {
       if (score >= 90) return "A";
       else if (score >= 80) return "B";
       // ... exact same logic repeated
   }
   ```
🛑 *Problems:*
- Identical code is repeated for each subject (code duplication).  
- If grading logic changes, multiple methods must be updated.  
- Increases the risk of inconsistencies and bugs.  
- Makes the code harder to maintain and extend.
--------------------------------------------
✅ WITH DRY PRINCIPLE (Good Design)
--------------------------------------------
📂 *Package:* withdry
This design *correctly eliminates duplication* by using a single method for grade calculation.  
Now, we have a *single source of truth* for our grading logic.
🔹 *Classes:*
   - DRYExample.java: Contains a single method for calculating grades.
   ```java
   public static String calculateGrade(int score) {
       if (score >= 90) return "A";
       else if (score >= 80) return "B";
       // ... logic exists in only one place
   }
   ```
   - ObjectOrientedDRYExample.java: Shows an advanced OO approach.
🎯 *Improvements:*
- Grade calculation logic exists in *one place only*, following DRY.  
- If grading logic changes, *we modify only one method*, improving maintainability.  
- Adding new subjects requires *no additional methods*.
- Code is more *concise, readable, and less error-prone*.
--------------------------------------------
🔍 PROBLEM AND SOLUTION
--------------------------------------------
*Problem:*
- Duplicated code leads to maintenance issues, inconsistencies, and bugs.
- When business rules change, developers must remember to update every instance.
- Code becomes bloated and harder to understand.

*Solution:*
- Extract duplicated logic into a single, reusable method or class.
- Use parameters to handle variations in behavior.
- Apply object-oriented principles to further enhance code organization.

*Example:*
```java
// Without DRY - Multiple methods with identical logic
calculateMathGrade(85);    // Returns "B"
calculateScienceGrade(85); // Returns "B"

// With DRY - Single method handles all subjects
calculateGrade(85);        // Returns "B"
```
--------------------------------------------
📝 CONCLUSION
--------------------------------------------
The *DRY Principle* is essential for writing *maintainable, high-quality code*.  
By eliminating duplication, we:
- Reduce the risk of bugs and inconsistencies
- Make code easier to maintain and extend
- Create more concise and readable codebases
- Improve development efficiency

Remember: *"Every piece of knowledge should have a single, unambiguous representation within a system."*
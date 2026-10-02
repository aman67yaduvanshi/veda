# Student Grade Calculator (Java) ~ Aman

A console-based Java program that accepts marks for multiple subjects and calculates total marks, percentage, and grade.

## Features
- Student marks input system (any number of subjects, stored in an array)
- Total and percentage calculation
- Grade calculation using if-else logic
- Validation for invalid marks (non-numeric, below 0, above 100) and invalid subject count
- Calculation logic are kept inside separate methods

## Concepts Practiced
Variables, arrays, loops, conditional statements, methods, Scanner - input handling.

## Grading Scale
| Percentage | Grade |
|-----------|-------|
| 90 and above | A+ |
| 80 – 89 | A |
| 70 – 79 | B |
| 60 – 69 | C |
| 50 – 59 | D |
| 40 – 49 | E |
| Below 40 | F (Fail) |

## How to Run
```bash
javac GradeCalculator.java
java GradeCalculator
```

## Sample Output
```
===== Student Grade Calculator =====
Enter student name: Aman
Enter number of subjects: 3
Enter marks for Subject 1 (0-100): 85
Enter marks for Subject 2 (0-100): 120
  Invalid marks! Must be between 0 and 100.
Enter marks for Subject 2 (0-100): 78
Enter marks for Subject 3 (0-100): 92

========== RESULT ==========
Student    : Aman
Total      : 255 / 300
Percentage : 85.00%
Grade      : A
============================
```

## Approach
Marks are stored in an array - `int[]`. A `while loop ` re-prompts until each mark is valid. `calculateTotal`, `calculatePercentage` and `calculateGrade` are separate methods, making the code easy to test and reuse.

## Tools
Java, JDK

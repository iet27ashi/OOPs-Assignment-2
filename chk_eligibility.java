import java.util.Scanner;
public class chk_eligibility {
  
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
    
            System.out.println("Enter the number of students:");
            int n = scn.nextInt();
    
            // Iterate through each student
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter marks for student " + i + ":");
    
                System.out.print("Mathematics: ");
                int mathMarks = scn.nextInt();
    
                System.out.print("Physics: ");
                int physicsMarks = scn.nextInt();
    
                System.out.print("Chemistry: ");
                int chemistryMarks = scn.nextInt();
    
                // Calculate total marks
                int totalMarks = mathMarks + physicsMarks + chemistryMarks;
                int mathAndPhysicsTotal = mathMarks + physicsMarks;
    
                // Check eligibility criteria
                if (mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 &&
                    (totalMarks >= 200 || mathAndPhysicsTotal >= 150)) {
                    System.out.println("Student " + i + " is eligible for admission.");
                } else {
                    System.out.println("Student " + i + " is not eligible for admission.");
                }
            }
        }
    }
     


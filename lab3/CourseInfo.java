import java.util.Scanner;

public class CourseInfo {
    private String courseTitle;
    private String instructor;
    private int enrollment;
    private float avg=0;
    private int[] scores = new int[15];

    public void printInfo() {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment: " + enrollment);
        System.out.println("Average: " + avg);
    }

    public void readInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter course title: ");
        courseTitle = keyboard.nextLine( );
        System.out.print("Enter instructor name: ");
        instructor = keyboard.nextLine( );
        System.out.print("Enter enrollment: ");
        enrollment = keyboard.nextInt( );

        for(int i=0;i<enrollment;i++){
            System.out.println("Enter a score");
            scores[i]=keyboard.nextInt();
        }
        for (int j=0;j<enrollment;j++){
            avg+=scores[j];
        }
        avg=avg/enrollment;



    }
}
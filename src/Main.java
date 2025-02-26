
public class Main {
    public static void main(String[] args) {
        System.out.println("The Purpose of this Project is Test for Git Connection and Submission of Assignment# 6 using GitHub");
        double[ ] JavaGPAofStudents= {2.4,3.4,2.3,3.8,4.0,3.5};
        double[ ] PythonGPAofStudents = {3.4,2.4,2.1,3.7,4.0,2.5};
        System.out.println("\nTotal Students who got GPA 3.5 or above in Java: " + countStudents(JavaGPAofStudents) );
        System.out.println("\nTotal Students who got GPA 3.5 or above in Python: " + countStudents(PythonGPAofStudents) );
        System.out.println("\nGenerating Random Number...");
        int num = 0;
        while( num < 7){
             int Num = (int) Math.floor(Math.random()*11);
            System.out.println( "Random Number is: "  + Num);
            num++;
        }
    }
    public static int  countStudents(double[ ] JavaGPAofStudents) {
        int count = 0;
        for (int i = 0; i < JavaGPAofStudents.length; i++) {
            if (JavaGPAofStudents[i] >= 3.5 ) {
                count+=1;
            }
        }
        return count;
    }
}
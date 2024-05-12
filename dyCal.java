import java.util.Scanner;

public class dyCal
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sections: ");
        int numSec = input.nextInt();
        //number of sections
        System.out.println(numSec);
       
        //inputting the number of students per section
        int[] numStu = new int[numSec];
        for (int i = 0; i < numSec; i++)
        {
            System.out.print("Enter the number of students in section " + (i+1) + " : ");
            numStu[i] = input.nextInt();
        }
       
        // inputing the exam scores of students per section
        int [][] scores = new int[numSec][];
        for (int sectionIndex = 0; sectionIndex < numSec; sectionIndex++)
        {
            System.out.println("Section: " + sectionIndex);
            scores[sectionIndex] = new int[numStu[sectionIndex]];
            for (int studentIndex = 0; studentIndex < numStu[sectionIndex]; studentIndex++)
            {
                System.out.print("Score for student " + studentIndex + ": ");
                input.nextInt();
            }
        }
    }
}
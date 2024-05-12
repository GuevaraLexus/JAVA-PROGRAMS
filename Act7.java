import java.util.Scanner;
import java.util.Arrays;

public class Act7
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sections: ");

		int numSec = input.nextInt();
		double allsum = 0;
     
        int[] numStu = new int[numSec];
        for (int i = 0; i < numSec; i++){
            System.out.print("Enter the number of students in section " + (i+1) + " : ");
            numStu[i] = input.nextInt();
        }
		
        int[][] scores = new int[numSec][];
        for (int sectionIndex = 0; sectionIndex < numSec; sectionIndex++){
            scores[sectionIndex] = new int[numStu[sectionIndex]];
			for (int studentIndex = 0; studentIndex < numStu[sectionIndex]; studentIndex++){
                System.out.print("Enter the exam score of student " + (studentIndex+1) + " of section " + (sectionIndex+1) + " : ");
				scores[sectionIndex][studentIndex] = input.nextInt();
				allsum = allsum + scores[sectionIndex][studentIndex];
			}
		}
		double[] average = new double[numSec];
		double max = 0, min = 0, num = 0;
		int value = 0;
		int[] freq = new int[100];
		int[] list = new int[scores.length * scores[0].length];
		int listPos = 0;
        for (int sectionIndex = 0; sectionIndex < numSec; sectionIndex++)
        {
            double sum = 0;
            for (int studentIndex = 0; studentIndex < numStu[sectionIndex]; studentIndex++)
            {
				num = numStu[sectionIndex] + numStu[sectionIndex];
                sum += scores[sectionIndex][studentIndex];
				int a[] = scores[sectionIndex];
				Arrays.sort(a);
				min = a[0];
				if (max < scores[sectionIndex][studentIndex])
				{
					max = scores[sectionIndex][studentIndex];
				}
				if (min > scores[sectionIndex][studentIndex])
				{
					min = scores[sectionIndex][studentIndex];
				}	
				value = scores[sectionIndex][studentIndex];
				freq[value]++;
				list[listPos++] = scores[sectionIndex][studentIndex];
				
            }
            average[sectionIndex] = sum / numStu[sectionIndex];
			
			System.out.println("The average score in section " + (sectionIndex+1) + " : " +  String.format("%.2f", average[sectionIndex]));
        }
		int largest = 0;
		int mode = -1;
		Arrays.sort(list);
		for(int i = 0; i < 100; i++)
		{
			if (freq[i] > largest)
			{
				largest = freq[i];
				mode = i;
			}
		}
		allsum = allsum / numSec;
		System.out.println("The average score in all sections : " + String.format("%.2f", allsum));
		System.out.println("The highest score among all section : " +  String.format("%.2f", max));
		System.out.println("The lowest score among all section : " +  String.format("%.2f", min));
		System.out.println("Mode : " + mode);
		System.out.println("Median : " + median(list));
    }
	public static double median(int[]m){
			int middle = m.length / 2;
			if (m.length % 2 == 1){
				return m[middle];
			}
			else{
				return (m[middle - 1] + m[middle]) / 2.0;
			}
		}
}
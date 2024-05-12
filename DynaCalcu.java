import java.sql.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class DynaCalcu {
    static DecimalFormat df = new DecimalFormat("#.##");	
    public static void main(String[] args) {       
        int numberSection = getnumberSection();
        int[] studSecArray = new int[numberSection];
        for (int a = 0; a < numberSection; a++) 
			{
				int studsC = getstudsC(a);
				studSecArray[a] = studsC;
			}
			System.out.println();
        double[][] scoresSec = new double[numberSection][];
        int aveScoresSec = 0;
		for ( int a = 0; a <numberSection; a++) 
			{
				scoresSec[a] = new double[studSecArray[a]];
			}	
        for (int a = 0; a < numberSection; a++) 
			{
		for (int b = 0; b < studSecArray[a]; b++) {
					double score = getStudScore(b, a);
					scoresSec[a][b] = score;
				}
					System.out.println();
			}	
        for (int a = 0; a < numberSection; a++) 
			{
			aveScoresSec += studSecArray[a];
			}	
        double[] allScores = new double[aveScoresSec];
        int ctr=0;
        for(int a = 0; a < numberSection; a++) 
			{
		for(int b = 0; b < studSecArray[a]; b++) {
				allScores[ctr] = scoresSec[a][b];
				ctr++;
			}
			}
        double[] aves = new double[numberSection];
        double[] maxS = new double[numberSection];
        double[] minS = new double[numberSection];
        for(int a = 0; a < numberSection; a++) 
		{
            double[] currentScoresArray = new double[studSecArray[a]];
            for (int b = 0; b < studSecArray[a]; b++) 
				{
				currentScoresArray[b] = scoresSec[a][b];
				}
            double average = getavescore(currentScoresArray);
            double maxScore = getmaxScoreS(currentScoresArray);
            double minScore = getminScoreS(currentScoresArray);
            aves[a] = average;
            maxS[a] = maxScore;
            minS[a] = minScore;
        }
        displayaves(aves);
        double totalAvg = getTotalAverage(allScores);
        System.out.println("Average score in all section: " + df.format(totalAvg));
        System.out.println();
        dispHighSc(maxS);
        System.out.println();
        dispLowSC(minS);
        System.out.println();
        double mode = getMode(allScores);
        System.out.println("Mode: " + df.format(mode));
		double median = getMedian(allScores);
        System.out.println("Median: " + df.format(median));
    }
    public static int getnumberSection() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of section: ");
			return sc.nextInt();
		}
	public static int getstudsC(int sectionNumber) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of students in section " + (sectionNumber+1) + ": ");
			return sc.nextInt();
		}
    public static double getStudScore(int studentNumber, int sectionNumber) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter exam score of student number " + (studentNumber+1) + " in section " + (sectionNumber+1) + ": ");
			return sc.nextDouble();
		}
    public static double getavescore(double[] scoreArray) 
		{
        double sum = 0;
			for (double score : scoreArray) {
				sum += score;
			}
        return sum / scoreArray.length;
		}

    public static void displayaves(double[] avesArray) 
		{
			for(int a=0; a < avesArray.length; a++) {
				int currentSection = a+1;
				System.out.println("The Average score in section " + currentSection + ": "+ df.format(avesArray[a]));
			}
		}

    public static void dispHighSc(double[] highSCArray) 
		{
			double highSCA = highSCArray[0];
			for (double x : highSCArray) {
				if (x > highSCA) {
					highSCA = x;
				}
			}

			for(int a=0; a < highSCArray.length; a++) {
				int currentSection = a+1;
				System.out.println("Highest score in section " + currentSection + ": "+ df.format(highSCArray[a]));
			}
			System.out.println("Highest score in all section: " + df.format(highSCA));
		}

    public static void dispLowSC(double[] lowSCArray) 
		{
			double lowSCA = lowSCArray[0];
				for (double x : lowSCArray) {
				if (x < lowSCA) {
					lowSCA = x;
				}
			}
			
        for(int a=0; a < lowSCArray.length; a++) 
			{
				int currentSection = a+1;
				System.out.println("Lowest score in section " + currentSection + ": "+ df.format(lowSCArray[a]));
			}
			System.out.println("Lowest score in all section: " + df.format(lowSCA));

		}

    public static double c(double[] scoreArray) 
		{
			double maxScore = scoreArray[0];
				for (double score : scoreArray) {
				if (score > maxScore) {
					maxScore = score;
				}
			}
        return maxScore;
		}

    public static double getminScoreS(double[] scoreArray) 
		{
			double minScore = scoreArray[0];
			for (double score : scoreArray) {
				if (score < minScore) {
					minScore = score;
				}
			}
        return minScore;
		}

    public static double getTotalAverage(double[] allScores) 
		{
			double sum = 0;
			for (int a = 0; a < allScores.length; a++) {
            sum += allScores[a];
			}
        return sum / allScores.length;
		}

    public static double getMedian(double[] scores) 
		{
			double[] sScores = sortDoubleArray(scores);

			double median=0;
			if ( sScores.length %2==1 ) {
				median = sScores[(sScores.length+1)/2-1];
        } 
			else {
				median=(sScores[sScores.length/2-1] + sScores[sScores.length/2])/2;
			}
        return median;
		}


    public static double getMode(double[] scores) 
		{
			double[] sScores = sortDoubleArray(scores);

			double maxValue = 0;
			int maxCount = 0, a, b;
			for (a = 0; a < sScores.length; ++a) {
				int count = 0;
				for (b = 0; b < sScores.length; ++b) {
					if (sScores[b] == sScores[a])
						++count;
				}

            if (count > maxCount) {
                maxCount = count;
                maxValue = sScores[a];
            }
        }
        return maxValue;
		}

    public static double[] sortDoubleArray(double[] scores) 
		{
			double temp = 0;
			for(int a=0; a < scores.length; a++){
				for(int b=1; b < (scores.length-a); b++){
					if(scores[b-1] > scores[b]){
                    
						temp = scores[b-1];
						scores[b-1] = scores[b];
						scores[b] = temp;
					}
				}
			}
        return scores;
		}
	}
import java.util.Scanner;
public class StudentGradingApp{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
		
	System.out.println("How many students do you have? ");
	int numberOfStudents = input.nextInt();
	
	System.out.println("How many subjects do they offer ");
	int numberOfSubjects = input.nextInt();

	double[][] studentsScoresheet = compileScore(numberOfStudents,numberOfSubjects);

	

	}

	private static double[][] compileScores(int numberOfStudents,int numberOfSubjects){

		Scanner input = new Scanner(System.in);

		double[][] studentsScoresheet = new double[numberOfStudents][numberOfSubjects];
	
		int student;
		int course;
		double score; 
	
		for(int studier = 0; studier < numberOfStudents; studier++){
			student = studier + 1;
			for(int subject = 0; subject < numberOfSubjects; subject++){
				course = subject + 1;
				System.out.println("Enter student"+student+" score in subject"+course);
				score = input.nextDouble();
				if(score >= 0 && score <= 100){
					studentsScoresheet[studier][subject] = score;
				}else{
					System.out.println("Wrong score input enter again:");
					subject--;
					continue;
				     }
			
			 
		
			}
	
		}
		return studentsScoresheet;
	}
	private static double[] calculateStudentsTotals(studentsScoresheet) 

	
}
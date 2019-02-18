import java.util.Scanner;
public class Grading{


	public static void main(String a[]){

		Scanner scanner = new Scanner(System.in);

		GradingSystem grading = new GradingSystem();

		System.out.println("Enter your Grade");
		int grade = scanner.nextInt();

		if(grade >= 70 && grade <=100){
			grading.setGradeA('A');
			System.out.println("Your Grade is "+grading.getGradeA());
		}
		else if(grade >=65 && grade<= 69){
			grading.setGradeB('B');
			System.out.println(grading.getGradeB());
		}

		else if(grade >=60 && grade<= 64){
			grading.setGradeC('C');
			System.out.println(grading.getGradeC());
		}
		
	}
	

}

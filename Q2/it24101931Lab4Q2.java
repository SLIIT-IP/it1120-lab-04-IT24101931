import java.util.Scanner;
public class it24101931Lab4Q2
{
	public static void main(String[] args)
	{		
	Scanner values=new Scanner(System.in);
	int exammark,examper,labmark,labper;
	double finalmark;

	System.out.print("Please enter exam marks(out of 100) :");
	exammark=values.nextInt();
 	
	if (exammark<0||exammark>100){System.out.println("invalid input for exam marks.terminating program");}

	System.out.print("Please enter lab submission marks(out of 100) :");
	labmark=values.nextInt();

	if (labmark<0||labmark>100){System.out.println("invalid input for lab submission marks.terminating program");}

	
	System.out.print("Please enter the percentage given for the exam :");
	examper=values.nextInt();

	System.out.print("Please enter the percentage given for the lab submission :");
	labper=values.nextInt();
	
	if (examper+labper!=100){System.out.println("the percentage must add up to 100.terminating program");}

	finalmark=(exammark*examper/100)+(labmark*labper/100);

	System.out.println("Final exam marks :"+finalmark);


	}
}
import java.util.Scanner;
public class it2410193Lab4Q1
{
	public static void main(String[] args)
	{		
	Scanner values=new Scanner(System.in);

	int num;

	System.out.print("Enter a number :");
	num=values.nextInt();

	if(num>0){
		System.out.println("Positive");
		}
	else if(num<0){
		System.out.println("Negative");
		}
	else if(num==0){
		System.out.println("the number is Zero");
		}

	}
}

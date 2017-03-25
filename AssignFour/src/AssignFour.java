
public class AssignFour {
//To write a program to print the characters corresponding to ASCII codes from 65 to 90.
	public static void main(String s[])
	{
		int i;
		int num=65;
		char asciinum;
		for (i=1; i<=26; i++)
		{
			
			 asciinum = (char)num;
			System.out.println(num+" - "+asciinum);
			num++;
		}
		
	}
}

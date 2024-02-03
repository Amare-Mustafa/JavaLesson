import java.util.Scanner;
public class mysweetProgramme {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Scanner userInput = new Scanner(System.in);
		
		String s = userInput.nextLine();
		/////////////////////////////////////m/////////////////////////////////////m
		/// if statements
		if(s.equals("Amar"))
		{
			System.out.println("Hey Amar");
			
		}else if(s.equals("Amir"))
		{
			System.out.println("hey Amir");
		}
		else {
			System.out.println("You are not welcom here");
		}
		
		/////////////////////////////////////////////////////////////////////////////////////
		////While loop
		int i = 0;
		while(i < 10)
		{
			System.out.println("i is " + i);
			i++;
		}
		
		/////////////////////////////////////m/////////////////////////////////////m/////////////////////////////////////m
		for(int x = 10;  x > 0; x--)
		{
			System.out.println("x is " + x);
		}
		
		/////////////////////////////////////m/////////////////////////////////////m/////////////////////////////////////m
		do {
			System.out.println("the first part");
		}while(false);
		
		//System.out.println(s);
		userInput.close();
	}

}

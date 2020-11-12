public class LeapYear
{
	public static void main(String[] args)
	{
		//scanner class declaration
                Scanner sc=new Scanner(System.in);
		//input year from user
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		//condition for checking year entered by user is a leap year or not
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
		
		sc.close();
         }
}
***Output***
Enter a Year

1300

1300 is not a leap year.


Enter a Year

2020

2020 is a leap year.

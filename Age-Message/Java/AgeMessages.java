import java.util.Scanner;

public class AgeMessages
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		if ( age < 13 )
		{
			System.out.println( "You are too young to create a Facebook account." );
		}
		if ( age >= 13 )
		{
			System.out.println( "You are old enough to create a Facebook account." );
		}
		if ( age < 16 )
		{
			System.out.println( "You are too young to get a driver's license." );
		}
		if ( age >= 16 )
		{
			System.out.println( "You are old enough to get a driver's license." );
		}
		if ( age < 18 )
		{
			System.out.println( "You are too young to get a tattoo." );
		}
		if ( age >= 18 )
		{
			System.out.println( "You are old enough to get a tattoo." );
		}
		if ( age < 21 )
		{
			System.out.println( "You are too young to drink alcohol." );
		}
		if ( age >= 21 )
		{
			System.out.println( "You are old enough to drink alcohol." );
		}
		if ( age < 35 )
		{
			System.out.println( "You are too young to run for President of the United States." );
			System.out.println( "How sad!" );
		}
		if ( age >= 35 )
		{
			System.out.println( "You are old enough to run for President of the United States." );
			System.out.println( "How awesome!" );
		}
		if ( age >= 65 )
		{
			System.out.println( "You are old enough to retire!" );
		}
		if ( age < 65 )
		{
			System.out.println( "You are probably too young to retire." );
		}
		if ( age == 18 || ( age == 19 ) || ( age == 20 ) || ( age == 21 ) || ( age == 22 ) || ( age == 23 ) || ( age == 24 ) || ( age == 25 ) )
		{
			System.out.println( "You are able to register for the draft." );
		}
		if ( age < 18 || ( age > 25 ) )
		{
			System.out.println( "You are not able to register for the draft." );
		}
	}
}

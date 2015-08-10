public class arraysNloops{
	public static void main(String[] args){
		int count = 1;
		int [] num = new int[5];
		String [] str = new String[2];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		str[0] = "This is ";
		str[1] = "a counting sequence using arrays and a loop:";
		
		System.out.println(str[0] + str[1]);
		System.out.println(num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4] + ", ");
		num[4] = 6;
		while (count < 144){
			System.out.println(num[4]++);
			count ++;
		}
		System.out.print("...and, if I want to have tripple 8s, I just multiply the last number by 5.96 like so, ");
		num[4] *= 5.96;
		System.out.println(num[4] + ".");
	}
}

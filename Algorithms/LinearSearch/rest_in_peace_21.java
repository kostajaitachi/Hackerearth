import java.util.Scanner;
 
class TestClass{
	
	public TestClass(){
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		String str1 = in.nextLine();
		for(int i = 0;i<testcases;i++){
			String str = in.nextLine();
			if(str.contains("21") || (Integer.parseInt(str) % 21 == 0)){
				System.out.println("The streak is broken!");
			}
			else{
				System.out.println("The streak lives still in our heart!");
			}
		}
	}
	
	public static void main(String args[]){
		new TestClass();
	}
	
}

import java.util.Scanner;

class TestClass{

	public TestClass(){
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		String str = in.nextLine();
		for(int i = 0;i<testcases;i++){
			String input = in.nextLine();
			StringBuilder inp = new StringBuilder(input);
			
			int suvojitCount = getSubStringCount(inp, "SUVOJIT");
			int suvoCount = getSubStringCount(inp, "SUVO");
			
			System.out.println("SUVO = " + suvoCount + ", SUVOJIT = " + suvojitCount);
		}
	}
	
	public int getSubStringCount(StringBuilder inp, String subStr){
		int count = 0;
		while(true){
			int index = inp.indexOf(subStr);
			if(index != -1){
				inp.setCharAt(index,'$');
				count++;
			}else{
				break;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		new TestClass();
	}

}

import java.util.Scanner;
 
class TestClass{
	
	char mirrorDistorts[] = {'2','3','4','5','6','7','9'};
	
	public TestClass(){
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		String str1 = in.nextLine();
		for(int i = 0;i<testcases;i++){
			String str = in.nextLine();
			System.out.println(checkMirrorImages(str));
		}
	}
	
	public String checkMirrorImages(String str){
		int len = str.length();
		for(int i = 0;i<len;i++){
			if((str.charAt(i) != str.charAt(len - i - 1)) || containsLetter(str.charAt(i))){
				return "NO";
			}
		}
		return "YES";
	}
	
	public boolean containsLetter(char c){
		for(int i = 0;i<mirrorDistorts.length;i++){
			if(mirrorDistorts[i] == c){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		new TestClass();
	}
	
}

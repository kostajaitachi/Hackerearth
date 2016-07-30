import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.Map;

class TestClass{

	public TestClass(){
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		String str = in.nextLine();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0;i<lines;i++){
			String line = in.nextLine();
			processMessage(line, hm);
		}
		
		String result = processHashMap(hm);
		System.out.println(result);
	}
	
	public String processHashMap(HashMap mp){
		int date = 0, value = 0;
		Iterator it = mp.entrySet().iterator();
		int flag = 0;
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        int pairKey = (Integer)pair.getKey();
        int pairValue = (Integer)pair.getValue();
        
        
        if(pairValue >= value){
        	if(pairValue == value){
        		flag = 1;
        	}else{
        		flag = 0;
        	}
        	
        	
        	date = pairKey;
        	value = pairValue;
        }
    }
    
    
    if(flag == 1 || (date != 19 && date != 20)){
    	return "No Date";
    }else{
    	return "Date";
    }
	}
	
	public void processMessage(String line, HashMap hm){
		int weightage = 1;
		if(line.charAt(0) == 'G'){
			weightage = 2;
		}
		StringTokenizer elements = new StringTokenizer(line, " ");
		String regex = "[0-9]+";
		while(elements.hasMoreElements()){
			String elem = elements.nextElement().toString();
			if(elem.matches(regex)){
				int num = Integer.parseInt(elem);
				if(hm.get(num) == null){
					hm.put(num,weightage);
				}else{
					hm.put(num, (Integer)hm.get(num) + weightage);
				}
			}
		}
	}
	
	public static void main(String args[]){
		new TestClass();
	}
	
	
}

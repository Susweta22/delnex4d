
public class assessment2 {
	public static String reverseWord(String str){
		String words[]=str.split("\\s");  
	    String revWord=" ";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        revWord+=sb.toString()+" ";  
	    	//System.out.println(w);
	    }  
	    return revWord.trim();  
	} 
	

	public static void main(String[] args) {
		System.out.println(reverseWord("welcome to the world"));

	}

}

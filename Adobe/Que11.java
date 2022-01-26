public class Que11 {
    public static void main(String[] args) {
        String s = "BruceWayneIsBatman";

        System.out.println(amendSentence(s));
        
    }

    static String amendSentence(String s) {
    	int n = s.length();
    	String res = "";

        char[] str = s.toCharArray();
    	
    	
    	if (str[0] >= 'A' && str[0] <= 'Z')
    		res += (str[0] - 'A' + 'a');
    	else
    		res += str[0];
        
    	for (int i = 1; i < n; ++i)
    	{
    	    
    		if (str[i] >= 'a' && str[i] <= 'z')
    			res += str[i];
    		
    		
    		else
    		{
    			res += " ";
    			res += (str[i] - 'A' + 'a');
    		}
    	}
    	return res;
    }
    
}

package Puzzels;

public class Qtrev {
	public static void main(String[]args)
	{
		String str="JAVA CODE";
		String[] aQt=str.split(" ");
		String revstr="";
		for (int i = 0; i < aQt.length; i++)
        {
			if(i==aQt)
           String word = aQt[i]; 
           String revword = "";
           for (int j = word.length()-1; j >= 0; j--) 
           {
        	   revword = revword + word.charAt(j);
           }
           revstr = revstr + revword + " ";
        }
		System.out.println(revstr);
	}
}

	
	
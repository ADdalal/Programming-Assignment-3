
public class printing {
	public static void main (String [] args)
    {
	    String x = "D4io0mon8d";
	    String y = "125+3";
	    //printVowels(x);
        //printConsonants(x);
        //printDigits(x);
	    processExpression(y);
    }
	
	
	
//this method takes a String and String as a parameter 
//and print all the vowels contained in that String one character per line.
    static void printVowels (String x)
      { 
	     for(int i=0; i< x.length();i++)
	       {
		     if(x.charAt(i)=='a'|| x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u' )
				System.out.println(x.charAt(i)+"\n");
	       }
	  }


//this method takes a String as a parameter 
//and print all the consonants contained in that String one character per line.
   static void printConsonants(String x)
     { 
         for(int i=0; i< x.length();i++)
           {
	        if(x.charAt(i)=='a'|| x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u' )
			continue;
	        
		    else
		    System.out.println(x.charAt(i)+"\n");
		 
           }
     }


//this method a String as a parameter 
//and print all the numeric digits contained in that String one character per line.
    static void printDigits(String x)
       { 
          for(int i=0; i< x.length();i++)
             {
	           if(x.charAt(i)=='0' || x.charAt(i)=='1' || x.charAt(i)=='2' || x.charAt(i)=='3' || x.charAt(i)=='4' || x.charAt(i)=='5' || x.charAt(i)=='6' || x.charAt(i)=='7' || x.charAt(i)=='8' || x.charAt(i)=='9' )
			    System.out.println(x.charAt(i)+"\n");
             }
       }



//this method should take a String in the format: "integer [[+-*/] integer]*]"
//then the method should process this expression and return the result as an integer
    static void processExpression(String y)
       {
	      int right=-1;
	      int left= -1;
	       for(int i=0; i< y.length();i++)
              {
	    	   //System.out.println(y.charAt(i));
	    	   int hold = y.charAt(i);  	   
	    	   if (y.charAt(i)== '+')
	    	      {   
	    		   
	    		   int Add = hold + y.charAt(i+1);
	    	       System.out.println(Add);
	    	      }
	    	   if (y.charAt(i)== '-')
	    	      {   
	    		   int Sub = y.charAt(i-1)+ y.charAt(i+1);
	    	       System.out.println(Sub);
	    	      }  
	    	   else
	    		   continue;
	    	   
              }
	    }
                  
        
 }
    
    




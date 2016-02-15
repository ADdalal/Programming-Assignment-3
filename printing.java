
public class printing {
	public static void main (String [] args)
    {
	    String x = "He4l0lo8";
	    String y = "125+3";
	    //printVowels(x);
        //printConsonants(x);
        //printDigits(x);
	    processExpression(y);
    }

	   
//this method takes a String as a parameter 
//and print all the vowels contained in that String one character per line.
    static void printVowels (String x)
      { 
	     for(int i=0; i< x.length();i++)
	       {
	    	 String vowels = "aAeEiIoOuU";
		     if(vowels.indexOf(x.charAt(i))!= -1 )	 
			    System.out.println(x.charAt(i));
	       }
	  }

    
  //this method takes a String as a parameter 
  	//and print all the consonants contained in that String one character per line.
  	   static void printConsonants(String x)
  	     { 
  	         for(int i=0; i< x.length();i++)
  	           {
  		         String consonnants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
  			     if(consonnants.indexOf(x.charAt(i))!= -1 )
  			        System.out.println(x.charAt(i));
  	           }
  	     }


//this method takes a String as a parameter 
//and print all the numeric digits contained in that String one character per line.
  		static void printDigits(String x)
  	       { 
  	          for(int i=0; i< x.length();i++)
  		         {
  		           String numbers = "0123456789";
  		 	       if(numbers.indexOf(x.charAt(i))!= -1 )
  		 	           System.out.println(x.charAt(i));
  		         }
          }


//this method should take a String in the format: "integer [[+-*/] integer]*]"
//then the method should process this expression and return the result as an integer
static int processExpression(String y)
        {
    	   String current = "";//it helps to hold the current value
    	   int result;//the expression total will held in this variable
    	   int leftOp = 0; //this variable used to save the numbers on the left side of operator(=,-,*,/)
    	   int rightOp = 0;//this variable used to save the numbers on the right side of operator(=,-,*,/)
	       for(int i=0; i< y.length();i++)//for looping until the end of string 
              {
	    	   current = current + y.charAt(i);
	    	   
	    	   if(y.indexOf(i)!= -1)//to check that the string still has value
	    	     {
	    		   //here I need to hold the numbers on specific place, but I don't know how
	    		   
	    		   if(y.indexOf(y.charAt(i))== "+")//if the string hit (+) operator, do the addition
	    		     {
	    		      result = leftOp + rightOp;
	    		     }
	    		   else if(y.indexOf(y.charAt(i))== "-")//if the string hit (-) operator, do the addition
	    		     {
	    			  result = leftOp - rightOp;
	    		     }
	    		   else if(y.indexOf(y.charAt(i))== "*")//if the string hit (*) operator, do the addition
	    		     {
	    			  result = leftOp * rightOp;
	    		     }
	    		   else if(y.indexOf(y.charAt(i))== "/")//if the string hit (/) operator, do the addition
	    		     {
	    			  result = leftOp / rightOp;
	    		     }
	    	     }
              }
         return result;     
	    }       
        
 }
    
    




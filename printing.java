
public class printing {
	public static void main (String [] args)
    {
	    String x = "He4l0lo8";
	    String y = "125+3";
	    //printVowels(x);
        //printConsonants(x);
        //printDigits(x);
	    System.out.println(processExpression(y));
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
  			
  			String operator = "+-*/";//for saving the operators
  			String numbers ="0123456789";//the possible numbers that might be included in the string
  			char currentOp = '?';//current operators
  			String rightNum ="" ;//the numbers that will be on the right side of operator
  			String leftNum = "";//the numbers that will be on the left side of operator
  			int result = 0;//for saving the result
  			
  			for(int i =0; i< y.length();i++)//for looping until the end of string )
  			{
  				if (numbers.indexOf(y.charAt(i))!= -1)//if the string is number, then add it to the current number
  						leftNum = leftNum+ y.charAt(i);
  				
  				else if (operator.indexOf(y.charAt(i))!= -1)//if the operator still inside the string, then add it to current operator
  					   {
  					    //currentOp = y.charAt(i);
  					    if(rightNum.length()==0)//to make sure that there isn't any number in the right side of operator
  					      {
  					    	rightNum = leftNum;//if we find nothing in the rightNum, then make it equal to the left number 
  					    	leftNum ="";
  					      }
  					    else//if there is a number in the right side of operator, we can do the expression 
  					      {
  					    	  if(currentOp == '+')
  					    	   {
  					    	    result = leftNum + rightNum;// make the addition but I don't how to convert it to integer
  					    	   }
  					    	  if(currentOp == '-')
  					    	   {
  					    	    result = leftNum - rightNum;// make the addition but I don't how to convert it to integer
  					    	   }
  					    	  if(currentOp == '*')
  					    	   {
  					    	    result = leftNum * rightNum;// make the addition but I don't how to convert it to integer
  					    	   }
  					    	  if(currentOp == '/')
  					    	   {
  					    	    result = leftNum / rightNum;// make the addition but I don't how to convert it to integer
  					    	   }
  					       }
  					   }
  				
  			}//end of for loop
  			return result;
  		}//end of method
  		
 }//end of class
    
    




//Example
public class JavaFiddle
  {
    public static void main(String[] args)
    {
     String testValue = "ABC123";
     String oneTimePassword = scrambleMAC(testValue);
     System.out.println("The OTP is : " + oneTimePassword);
     
    }
    
    public static String scrambleMAC(String testValue) 
    { 
        String scrambledMac = "";
    
        for (char ch: testValue.toCharArray()) 
        {
            int numberToAdd = 0;
            
            //hacky way to tell if char is a digit
            if (ch >= '0' && ch <= '9')
            {
                numberToAdd = 1 + (int)(Math.random() * ((9 - 1) + 1));
            } else {
              numberToAdd = ch;    
            }
            
            scrambledMac = scrambledMac + String.valueOf(numberToAdd); 
        }    
        
        return scrambledMac;
    }
    
  }

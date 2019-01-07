public class Vote
{  
   static void validate(int age)
   {  
     if(age<18)  
      throw new ArithmeticException("sorry, you cant vote");  
     else  
      System.out.println("welcome, please vote");  
   }  
   public static void main(String args[])
   {  
      validate(20);  
      System.out.println("rest of the code...");  
  }
}  

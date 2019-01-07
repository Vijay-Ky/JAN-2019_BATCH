import java.lang.*;

public class ClassDemo
{
   public static void main(String[] args)
   {
      try
	  {
         // returns the Class object for the class with the specified name
         Class cls = Class.forName("java.lang.ClassLoad");
         
         // returns the name and package of the class
         System.out.println("Class found = " + cls.getName());
         System.out.println("Package = " + cls.getPackage());
      }
	  catch(ClassNotFoundException ex)
	  {
         System.out.println(ex.toString());
      }
   }
}
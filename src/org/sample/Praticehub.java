package org.sample;

public class Praticehub {
	public static void main(String[] args)
    {
  try
  {
        System.out.printf("1");
      int sum = 9 / 0;
        System.out.printf("2");
  }
  catch(ArithmeticException e)
  {
        System.out.printf("3");
  }
   catch(Exception e)
  {
        System.out.printf("4");
  }
  finally
  {
     System.out.printf("5");
     System.out.println("6");
     System.out.println("7");
     System.out.println("8");
     System.out.println("9");
  }
     }

	
}

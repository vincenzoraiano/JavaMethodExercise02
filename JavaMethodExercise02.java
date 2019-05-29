
//import a class. 
import java.util.Scanner;

//defining the class.
class inchesMeter{

  //defining the a constanct.
  public static final double OneInch=0.0254;


//deining the main method
public static void main(String [] args){
    //instantiate an object of type scanner.	
	Scanner scanner=new Scanner(System.in);

    //asking to the user to enter a value.
    System.out.println("Enter a value in inches:");
 
    //storing the entered value inside a double.
    double storedValueinInches=scanner.nextDouble();
	
	//calling the method ad pass to it the stored value.
	System.out.println(calculus(storedValueinInches)+" Meters");
 
    

}

    //creating the method calculus and it will do calculus.
    public static double calculus(double unitToConvert){
		
	  System.out.println("The entered value is converted in:");
	  return unitToConvert*OneInch;
		
		
	}



}

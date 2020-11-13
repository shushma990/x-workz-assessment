public class Grade{

	public static void main(String[] boxes)
	{
		System.out.println("invoked main method by JVM");
		arrayOfGrade();
		System.out.println("exiting main method by JVM");
	}
    public static void arrayOfGrade()
	{
		 System.out.println("invoked arrayOfGrade");

		 char sslcGrade='A';
		 char pucGrade='A';
		 char degreeGrade='C';

	     char[] grades={sslcGrade,pucGrade,degreeGrade};
		 int sizeOfArray=grades.length;
		 System.out.println("Total elements "+sizeOfArray);


		 char elementAtIndex0=grades[0];

		 System.out.println("Element at index zero "+elementAtIndex0);

		 char elementAtIndex1=grades[1];

		 System.out.println("Element at index one "+elementAtIndex1);

		 char elementAtIndex2=grades[2];

		 System.out.println("Element at index two "+elementAtIndex2);

	}



} 
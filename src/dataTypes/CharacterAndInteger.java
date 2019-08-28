package dataTypes;

public class CharacterAndInteger
{

	public static void main(String[] args)
	{
	  // case 1: stores from a-z, A-Z;
		char c='A';
		System.out.println(c);//char c1='B21'; As is is not a alphabet
        
	 // case 2: It can store integer value from 0 to 65535;
      char c1= 97;
      System.out.println(c1);  // it will print Unicode of the 96    i.e. a
      
      char c2=65535;
      System.out.println("c2 "+c2);
      
     int c3='A';
     System.out.println(c3);  // It will print unicode of the A letter. i.e. 65
      
	}

}

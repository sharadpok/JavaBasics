package InstanceBlockInitializer;


public class CopiesBlockInConst 
{
	int id;
	CopiesBlockInConst(int id)
	{ 
		this.id=id;
		
		{
			int id1=78;
		}
		
	}


	public static void main(String[] args)
	{
		new CopiesBlockInConst(67);	

	}

}

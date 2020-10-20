package weektwoproject;

public class Loops
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int x=0;
//5a		
while (x<=100)
	{
	System.out.println(x);
	x+=2;
	}

//5b
x=100;
while (x>=1)
	{
	System.out.println(x);
	x-=3;
	}


//5c
for (x = 1; x<= 100;x += 2) 
	{
	System.out.println(x);
	}

//5d
for(x = 0; x <=100; x++) {

if (x%3==0 && x%5==0)
{
    System.out.println("HelloWorld");
    
}
else if (x%3==0)
{
	 System.out.println("Hello");
}
else if (x%5==0)
{
	System.out.println("World");
}
else
{
	System.out.println(x);
	
}
}
	}
}


	






	

	
	



	


	
		




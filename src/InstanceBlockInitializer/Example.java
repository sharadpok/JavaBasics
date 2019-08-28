package InstanceBlockInitializer;
class Bike
{
int speed;
Bike()
{
System.out.println(speed);	
}

public void display()
{
	{
		speed=20;
		System.out.println("Instance Block");
		}
}

}
public class Example
{

	public static void main(String[] args)
	{
		new Bike().display();
		

	}

}

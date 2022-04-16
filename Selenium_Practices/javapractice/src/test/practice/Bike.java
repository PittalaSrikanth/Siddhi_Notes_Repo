package test.practice;

public class Bike 
{

	// Attributes or Fields or Data
	boolean power;
	int currentGear;
	int currentSpeed;
	
	Bike(boolean pow,int cg,int cs)
	{
		
		start( pow, cg, cs);
	}

	// Operations or Methods or Behavior
	void start() 
	{
		power = true;
		currentGear = 0;
		currentSpeed = 0;
	}
	void start(boolean pow,int cg,int cs) 
	{
		power = pow;
		currentGear = cg;
		currentSpeed = cs;
		System.out.println(currentGear);
		System.out.println(currentSpeed);
		System.out.println(power);

	}

	void stop() 
	{
		power = false;
		currentGear = 0;
		currentSpeed = 0;
	}

	void changeGear(int gearNo) 
	{
		currentGear = gearNo;
	}

	void accelerate(int newSpeed) 
	{
		currentSpeed = newSpeed;
	}

	void print() 
	{
		System.out.println("Bike ­ ");
		System.out.println("\t Power ­ " + power);
		System.out.println("\t Gear ­ " + currentGear);
		System.out.println("\t Speed ­ " + currentSpeed);
	}


	public static void main(String[] args) 
	{
		Bike fz = new Bike(true,2,50);




	}

}

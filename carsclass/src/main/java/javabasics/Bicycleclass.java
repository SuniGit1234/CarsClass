package javabasics;

public class Bicycleclass {
	
	int cadence=0;
	int speed=0;
	int gear=1;
	
	void changecadence(int newvalue)
	{
		cadence = newvalue;
	}
	
	void changegear(int newvalue)
	{
		gear = newvalue;
	}
	
	void speedup(int increment)
	{
		speed = speed + increment;
	}
	
	void applybrakes(int decrement)
	{
		speed= speed - decrement;
	}
	
	void printstates()
	{
		System.out.println("cadence:" +cadence + "speed:" +speed + "gear:" + gear);
	}
}
class BicycleDemo{
public static void main(String[] args)
{
	Bicycleclass bike1 = new Bicycleclass();
	
	Bicycleclass bike2 = new Bicycleclass();

	
	bike1.changecadence(50);
	
	bike1.changegear(2);
	bike1.speedup(10);
	bike1.printstates();
	
	
	
	bike2.changecadence(55);
	
	bike2.changegear(3);
	bike2.speedup(15);
	bike2.printstates();
	}
}

class MountainBike extends Bicycleclass
{
	

}

interface Bicycleclass1

{
	
void changegear(int newvalue);
void changecadence(int newvalue);

}



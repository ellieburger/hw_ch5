//package pa;
//package pb;
package pc;

public class Car {
	
	public class CarException extends Exception
	{
		}
	
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	
	//p.30
	public void setCar(int n, double g)throws CarException
	{
		if(g<0)
		{
			CarException e = new CarException();
			throw e;
		}
		else
		{
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		}
	}
	/**
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
	}
	**/
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+num);
	}
}


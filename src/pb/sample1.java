//package pa;
package pb;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import pc.Car;
import pc.Car.CarException;

class sample1 {
	public static void main(String[] args)
	//throws CarException
	{
		/**
		//p.6
		Car car1;
		car1 = new Car();
		car1.show();
		
		//p.10
		pc.Car car1 = new pc.Car();
		car1.show();
		
		//p.14
		Car car1 = new Car();
		car1.show();
		
		//p.19
		int [] test;
		teast = new int[5];
		System.out.println("將值指定給test[10]");
		test[10]=80;
		System.out.println("將80指定給test[10]");
		System.out.println("順利地執行完畢");
		
		//p.21+24+26
		try {
			int[] test;
			test = new int[5];
			System.out.println("將值指定給test[10]");
			test[10] = 80;
			System.out.println("將80指定給test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列的範圍了");
			System.out.println("發生了"+e+"這個例外");
		}
		finally
		{
			System.out.println("最後一定會執行這個處理");
		}
		System.out.println("順利地執行完畢了");
	
		//p.31
		Car car1;
		car1 = new Car();
try {
			car1.setCar(1234, -10.0);
		}
		catch(CarException e) {
			System.out.println("拋出"+e+"了");
		}
		//p.32
		car1.setCar(1234, -10.0);
		car1.show();
		
		//p.34
		System.out.println("請輸入字串");
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println("已輸入字串"+str);
		}
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
		
		//p.35
		try 
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			pw.println("Hello!");
			pw.println("GoodBye!");
			pw.close();
			System.out.println("資料已經寫入檔案了");
		}
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
		
		//p.36
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println("寫入到檔案中的兩個字串是");
			System.out.println(str1);
			System.out.println(str2);
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
		
		//p.40
		if(args.length !=1)
		{
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
		//p.44
		Car car1 = new Car("1號車");
		car1.start();
		
		 //p.45
		Car car2 = new Car("2號車");
		car2.start();
		for(int i=0; i<5; i++)
		{
			try
			{
				//p.47
				Thread.sleep(1000);
				System.out.println("正在進行main()的處理工作");
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}	
	class Car extends Thread
	{
	private String name;
	public Car(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try 
			{
				//sleep(1000);
				System.out.println("正在進行"+name+"的處理工作");
			}
	}
	}
	}

		//p.48
		try
		{
			car1.join();
		}
		catch(InterruptedException e)
		{
			}
		System.out.println("結束main()的處理工作。");
		}
	}
		
	//p.50
	Car car1 = new Car("一號車");
	Thread th1 = new Thread(car1);
	th1.start();
	for(int i=0; i<5; i++)
	{
		System.out.println("正在進行main()的處理工作");
	}
	}
}
	//class Car extends Thread
	class Car implements Runnable
	{
		private String name;
		public Car(String nm)
		{
			name = nm;
		}
		public void run()
		{
			for(int i=0; i<5; i++)
			{
			System.out.println("正在進行"+name+"的處理工作");
			}
		}
	}
	**/
	//p.52
	Company cmp = new Company();
	Driver drv1 = new Driver(cmp);
	drv1.start();
	Driver drv2 = new Driver(cmp);
	drv2.start();
	}
}
	class Company
	{
		private int sum = 0;
		public synchronized void add(int a) {
			int tmp = sum;
			System.out.println("目前的合計金額是"+tmp+"元");
			System.out.println("賺到"+a+"元了。");
			tmp = tmp + a;
			System.out.println("合計金額是"+tmp+"元");
			sum = tmp;
		}
	}
	class Driver extends Thread
	{
		private Company comp;
		public Driver(Company c) {
			comp = c;
		}
		public void run() {
			for(int i=0; i<3; i++) {
				comp.add(50);
			}
		}
	}

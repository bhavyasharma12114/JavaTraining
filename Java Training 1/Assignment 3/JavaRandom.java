package Assignment3;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class RandomNumber implements Callable{
	
	@Override
	public Object call() throws Exception{
		Random r=new Random();
		Integer num=r.nextInt(20)-5;
		return num;
	}
	
}

public class JavaRandom {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		FutureTask[] task = new FutureTask[10];
		
		for(int i=0; i<10;i++)
		{
			Callable call=new RandomNumber();
			task[i] =new FutureTask(call);
			Thread t = new Thread(task[i]);
			t.start();
		}
		for(int j=0;j<10;j++)
		{
			Object obj=task[j].get();
			int n= (int) obj;
			Thread.sleep(1000);
			if(n>=0)
				{
				if(n%2 ==0) 
				{
					System.out.println("Number is Positive Even "+ n);
					
				}
				else
				{
					System.out.println("Number is Positive Odd "+ n);
				}
			}
			else {
				System.out.println("Number is Negative "+ n);
			}
		}
	
}
}

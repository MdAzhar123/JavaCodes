package q;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
//http://howtodoinjava.com/core-java/multi-threading/java-thread-pool-executor-example/
public class BasicThreadPoolExecutorExample {

	public static void main(String[] args) {
		 //Use the executor created by the newCachedThreadPool() method 
        //only when you have a reasonable number of threads 
        //or when they have a short duration.
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(9);
        //ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
       
        for (int i = 0; i <= 5; i++) 
        {
            Task task = new Task("Task " + i);
            System.out.println("A new task has been added : " + task.getName());
            executor.execute(task);            
           /* if(i==3)
            	System.out.println(executor.shutdownNow());*/
        }
       
       System.out.println("The current number of threads in the pool. "+executor.getPoolSize());
       System.out.println("The approximate number of threads that are actively executing tasks. "+ executor.getActiveCount());
       System.out.println("The approximate total number of tasks that have ever been scheduled for execution. "+ executor.getTaskCount());
       
       executor.shutdown();

	}

}

import java.util.*;

public class Algorithm 
{
	private int quantum = 5;
	
	/**
	 * 
	 * @param list
	 * @return  Average Waiting Time & Average Turnaround Time for FCFS (First Come First Serve)
	 */
	public double[] fcfs(ArrayList<Process> list )
	{
		int burst = 0 ; //burst times
		int total = 0;
		int current = 0;;
		int count = 0;
		int turnaround = 0; //turnaround times
		double ans[] = new double[2]; //create array of size 2 for avg waiting & turnaround time
			
		for(Process o : list)
		{
			o.newProcess = false; //process has arrived
			o.running = true; //process is going to be executed
			burst = burst + o.getProcessBurst(); //get burst times of each process
			current = total; //current burst
			total =total + burst; //total bursts 
			turnaround = burst; //total turnaround time
			count++; //counts number of processes assessed
		}
		 
		total = total - current; //remove last burst
		for(Process o : list)
		{
			o.running = false; //process is done executing
			o.terminated = true; //process is complete
		}
		double averageWait = current/(double)(count);
		ans[0] = averageWait;
		ans[1]=turnaround/(double)count;
		return ans;
	}
	
	/**
	 * 
	 * @param list
	 * @return Average Waiting Time & Average Turnaround Time for SJF (Shortest Job First)
	 */
	public double[] sjf(ArrayList<Process> list )
	{				
		  int n = list.size();  
	        Process P=new Process(1,0); //dummy process
	        
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i) ; j++){  
	                          if(list.get(j-1).getProcessBurst()> list.get(j).getProcessBurst()){  
	                                 //swap elements  
	                                 P = list.get(j-1);  
	                                 list.set(j-1, list.get(j));  
	                                 list.set(j, P);  
	                         }  	                          
	                 }  
	         }
	       return  fcfs(list);	  
	}
	
	/**
	 * 
	 * @param list
	 * @return Average Waiting Time & Average Turnaround Time for Priority Scheduling
	 */
	public double[] ps(ArrayList<Process> list )
	{
		  int n = list.size();  
	        Process P=new Process(1,0); //dummy process
	        	
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i) ; j++){  
	                          if(list.get(j-1).getPriority()> list.get(j).getPriority()){  
	                                 //swap elements  
	                                 P = list.get(j-1);  
	                                 list.set(j-1, list.get(j));  
	                                 list.set(j, P);  
	                         }  	                          
	                 }  
	         }
	       return  fcfs(list);
	}
	
}

import java.util.*;

public class User
{	
	public static void main(String [ ] args)
	{
		ArrayList<Process> listFcfs = new ArrayList<Process>();
		ArrayList <Process> listSjf = new ArrayList<Process>();
		ArrayList <Process> listPs = new ArrayList<Process>();
		
		LinkedList<?> linked = new LinkedList<Object>();
		
		Process P1 = new Process(0,24);
		Process P2 = new Process(1,3);
		Process P3 = new Process(2,3);
		Process P4 = new Process(3,2);
		listFcfs.add(P1);
		listFcfs.add(P2);
		listFcfs.add(P3);
		
		Process P5 = new Process(0,6);
		Process P6 = new Process(1,8);
		Process P7 = new Process(2,7);
		Process P8 = new Process(3,3);
		listSjf.add(P5);
		listSjf.add(P6);
		listSjf.add(P7);
		listSjf.add(P8);
		
		
		
		Process P9 = new Process(0,10,3);
		Process P10 = new Process(1,1,1);
		Process P11= new Process(2,2,4);
		Process P12= new Process(3,1,5);
		Process P13 = new Process(4,5,2);
		listPs.add(P9);
		listPs.add(P10);
		listPs.add(P11);
		listPs.add(P12);
		listPs.add(P13);
		
		System.out.println("Algorithm\tAverage Waiting Time \tAverage Turnarounnd Time");
		Algorithm al = new Algorithm();
		
		System.out.printf("    FCFS\t\t%.1f \t\t\t \t%.1f\n", al.fcfs(listFcfs)[0], al.fcfs(listFcfs)[1]);
		System.out.printf("    SJF \t\t%.1f \t\t\t\t%.1f \n", al.sjf(listSjf)[0],al.sjf(listSjf)[1]);
		System.out.printf("    PRIORITY \t\t%.1f\t\t\t \t%.1f \n", al.ps(listPs)[0],al.ps(listPs)[1]);	
	}
}

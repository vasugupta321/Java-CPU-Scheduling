public class Process 
{
		private int id; //process id
		protected int arrivalTime; // the time when process P first makes a request to the CPU Scheduler to e	execute on the CPU
		protected int priority ; //process priority 
		private int  burstTime; // Process Burst Time
	
		protected boolean newProcess = false; //process is not new
		protected boolean running = false;//process not running
		protected boolean ready = false ;//process not ready
		protected boolean  wait =  false;//process not waiting
		protected boolean terminated = false;//process not terminated

		
		public Process(int id, int burstTime)
		{
			this.id = id;//process ID
			this.arrivalTime = id;
			this.priority = 0; //default priority is 0
			this.burstTime = burstTime; //burst time given
			this.newProcess = true; //process now new
		}
		
		public Process(int id, int burstTime, int priority)
		{
			this.id = id;
			this.arrivalTime = id;
			this.priority = priority; //priority given
			this.burstTime = burstTime; //birst time given
			this.newProcess = true; //process now new
		}
		
		public int getProcessID()
		{
			return this.id;
		}
		
		public int getPriority()
		{
			return this.priority;
		}
		public int getProcessBurst()
		{
			return this.burstTime;
		}
		
		public boolean isNewProcess() {
			return newProcess;
		}

		public boolean isRunning() {
			return running;
		}

		public boolean isReady() {
			return ready;
		}

		public boolean isWait() {
			return wait;
		}

		public boolean isTerminated() {
			return terminated;
		}
}
public class Job {
	float rate,time;
	
	Job(float rate,float time)
		{
		this.rate=rate;
		this.time=time;
		}
	
	public float calculateJob()
		{
		return rate*time; //figures out how much the job is worth
		}
	
	public float FinalTotal(float calculateJob,float calculateRoom) //takes in the job total and the total of room
		{
		return calculateJob+calculateRoom; //adds the values together to get the cost of the job
		}
	
	public float rate()
		{
		return rate; //returns the rate of the job
		}

	public float time()
	{
	return time; //returns the time needed on the job
	}
}

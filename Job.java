public class Job {
	float rate,time;
	
	Job(float rate,float time)
		{
		this.rate=rate;
		this.time=time;
		}
	
	public float calculateJob()
		{
		return rate*time;
		}
	
	public float FinalTotal(float calculateJob,float calculateRoom)
		{
		return calculateJob+calculateRoom;
		}
	
	public float rate()
		{
		return rate;
		}

	public float time()
	{
	return time;
	}
}
public class Room {
	float area,cost;
	
	Room(float area,float cost)
		{
		this.area = area;
		this.cost = cost; 
		} 
	
	public float calculateRoom()
		{
		return area*cost;
		}

}
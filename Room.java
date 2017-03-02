public class Room {
	float area,cost;
	
	Room(float area,float cost)
		{
		this.area = area; //room area
		this.cost = cost; //cost of the material
		} 
	
	public float calculateRoom()
		{
		return area*cost; //returns the cost to furnish the room
		}

}

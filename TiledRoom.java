
public class TiledRoom extends Room {
	float grout; //grout cost for the room

	 public TiledRoom(float grout,float cost,float area){
		 super(cost,area); //gets the cost and area for tiled room from its extension (Room)
		 this.grout=area; //makes grout as equal to area
		 
	 }
	 
		public float extrarate(float rate) //used to figure out the extra rate 
		{
		return (float) (rate*1.5); //returns the value of the rate * 1.5
		}
		
		public float tileTotal(float calculateRoom,float extrarate,float time) //takes in room, rate and time
		{
			return (calculateRoom)+time*(extrarate)+grout; //figures out how much the tiling will cost
		}
}


public class TiledRoom extends Room {
	float grout;

	 public TiledRoom(float grout,float cost,float area){
		 super(cost,area);
		 this.grout=area;
		 
	 }
	 
		public float extrarate(float rate)
		{
		return (float) (rate*1.5);
		}
		
		public float tileTotal(float calculateRoom,float extrarate,float time)
		{
			return (calculateRoom)+time*(extrarate)+grout;
		}
}

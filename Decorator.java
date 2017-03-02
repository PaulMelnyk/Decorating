import java.util.Scanner;

public class Decorator {
	public static void main(String[] args) {
		Room room,roomtotal;
		Job job,jobtotal;
		TiledRoom troom;
		
		room = new Room (0,0); 
		job = new Job (0,0);
		
		Scanner in= new Scanner(System.in);
		System.out.println("Please Enter Hourly Rate: ");
		job.rate = in.nextFloat();
		
		System.out.println("Please Enter Room's Area: ");
		room.area= in.nextFloat();
		
		System.out.println("Please Enter Room's Unit Cost: ");
		room.cost= in.nextFloat();
		
		System.out.println("Please Enter Room's Decorating Time: ");
		job.time=in.nextFloat();
		in.close();
		
		roomtotal = new Room(room.area,room.cost);
		jobtotal = new Job(job.rate,job.time);
		troom= new TiledRoom(0,0,roomtotal.area);
		
		System.out.print("The job will cost: ");
		System.out.println(jobtotal.FinalTotal(jobtotal.calculateJob(),roomtotal.calculateRoom()));
		
		System.out.print("If room is tiled,job will cost: ");
		System.out.println(troom.tileTotal(roomtotal.calculateRoom(),troom.extrarate(job.rate),job.time));
	}
}
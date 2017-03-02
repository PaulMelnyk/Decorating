import java.util.Scanner;

public class Decorator {
	public static void main(String[] args) {
		Room room,roomtotal; //room constructors
		Job job,jobtotal; //job constructors
		TiledRoom troom; //tiled room constructor
		 
		room = new Room (0,0); //creates a room with 0 as parameters
		job = new Job (0,0); //creates job with 0 as parameters
		
		Scanner in= new Scanner(System.in); //creates scanner so input can be read
		System.out.println("Please Enter Hourly Rate: ");
		job.rate = in.nextFloat(); //rate of job taken in by next value input
		
		System.out.println("Please Enter Room's Area: ");
		room.area= in.nextFloat(); //area of room taken in by user input
		
		System.out.println("Please Enter Room's Unit Cost: ");
		room.cost= in.nextFloat(); //room cost from user input
		
		System.out.println("Please Enter Room's Decorating Time: ");
		job.time=in.nextFloat(); //takes the value input by user for time
		in.close(); //closes the scanner
		
		roomtotal = new Room(room.area,room.cost); 
		jobtotal = new Job(job.rate,job.time);
		troom= new TiledRoom(0,0,roomtotal.area);
		
		System.out.print("The job will cost: ");
		System.out.println(jobtotal.FinalTotal(jobtotal.calculateJob(),roomtotal.calculateRoom())); //calculates final cost from job total and room total
		
		System.out.print("If room is tiled,job will cost: ");
		System.out.println(troom.tileTotal(roomtotal.calculateRoom(),troom.extrarate(job.rate),job.time)); //calculates tile total from room total, extra rate, and the time needed
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	@Test
	public void testCalculateRoom() { //calculating the cost of the room
		int area = 10; //stores the area of the room
		int cost = 20; //stores the cost of the material
		
		Room room = new Room(area,cost); //new object room with parameters
		int total = Math.round(room.calculateRoom()); //total stores the cost of the room

		assertEquals(200,total); //compares the price of the room to 200, if they dont match then error in the tests
		
	}

}

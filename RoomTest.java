import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	@Test
	public void testCalculateRoom() {
		int area = 10;
		int cost = 20;
		
		Room room = new Room(area,cost);
		int total = Math.round(room.calculateRoom());

		assertEquals(200,total);
		
	}

}

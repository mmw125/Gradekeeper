package gradingSystems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import data.Assignment;
import data.Folder;

public class PointsBasedSystemTest {
	private Folder folder;

	@Before
	public void setUp() throws Exception {
		folder = new Folder("Folder");
	}

	@Test
	public void testBasics() {
		//Ensures that no items returns a grade of zero
		assertEquals(0, folder.getGrade(), .0001);
		folder.addItem(new Assignment("Quiz 1", 5, 10));
		assertEquals(.5, folder.getGrade(), .0001);
		folder.addItem(new Assignment("Quiz 2", 85, 90));
		assertEquals(.9, folder.getGrade(), .0001);
	}
	
	public void testPointsBasedInside() {
		
	}
}

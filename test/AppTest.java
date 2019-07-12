import junit.framework.*;

public class AppTest extends TestCase {
    public void test1() {
    	
    	App junit = new App();
		int result = junit.add(100, 200);
		assertEquals(300, result);
		assertEquals(302, result);
		assertEquals(303, result);
    }

   
}
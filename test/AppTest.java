import junit.framework.*;

public class AppTest {
    public void test1() {
    	
    	App junit = new App();
		int result = junit.add(100, 200);
		assertEquals(300, result);
		
    }

   
}
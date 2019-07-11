import static org.junit.jupiter.api.Assertions.assertEquals;

import InitialHello.MyJUnitClass;
import junit.framework.*;

public class AppTest extends TestCase {
    public void test1() {
    	
    	App junit = new App();
		int result = junit.add(100, 200);
		assertEquals(301, result);
    }

   
}
© 2019 GitHub, Inc.
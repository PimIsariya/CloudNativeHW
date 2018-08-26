package th.ac.kmutt.sit.MyFirstService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.ac.kmutt.sit.MyFirstService.Controller.User;
import static org.junit.Assert.*;
import th.ac.kmutt.sit.MyFirstService.Controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstServiceApplicationTests {
    
    
	@Test
	public void showUser() {
            UserController uc = new UserController();
            assertNotNull(uc.getAllUser());
            
	}

}

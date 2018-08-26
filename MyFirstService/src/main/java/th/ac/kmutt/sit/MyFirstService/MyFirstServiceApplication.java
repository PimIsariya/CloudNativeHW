package th.ac.kmutt.sit.MyFirstService;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import th.ac.kmutt.sit.MyFirstService.Controller.User;
import th.ac.kmutt.sit.MyFirstService.Controller.UserController;

@SpringBootApplication
public class MyFirstServiceApplication {

	public static void main(String[] args) {
            UserController usercon = new UserController();
            User user = new User();
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Insert yur ID: ");
            sc.next();
            
	}
}

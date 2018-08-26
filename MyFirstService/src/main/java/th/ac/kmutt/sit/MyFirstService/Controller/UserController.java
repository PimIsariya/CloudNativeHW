package th.ac.kmutt.sit.MyFirstService.Controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    ArrayList<User> users = new ArrayList<>();
    public void setUser(){
        users.add(0, new User(1, "Isariya"));
        users.add(1, new User(2, "Alfled"));
        users.add(2, new User(3, "Bruce"));
        users.add(3, new User(4, "Joker"));
        users.add(4, new User(5, "Salina"));
    }
    
    @RequestMapping("/user")
    public ArrayList<User> getAllUser(){
        setUser();;
        return users;
    }
    @RequestMapping("/user/{id}")
    public User getUserID(@PathVariable("id") int id){
        setUser();
        return users.get(id-1);
    }
            

}
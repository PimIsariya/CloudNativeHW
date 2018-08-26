package th.ac.kmutt.sit.MyFirstService.Controller;

public class User {

    private int id;
    private String name;
    
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public User() {
        
    }
    
    public int getId(int id){
        return id;
    }

    public String getName(String name){
        return name;
    }

    @java.lang.Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
   

}
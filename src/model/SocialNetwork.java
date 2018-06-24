package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SocialNetwork implements Serializable {
    private List<User> users;
    private User currentUser;
    
    public SocialNetwork() {
        this.users = new ArrayList();
    }
    
    public boolean login(String email, String password) {
        for(User user: users) {
           if (user.getEmail().equals(email) && user.getPassword().equals(password)){
               this.currentUser = user;
               return true;
           }
        }
        
        return false;
    }
    
    public void createUser(String name, String email, String password, 
                              String confirmPassword, Date dob){
        User newUser = new User(name, password, email, dob);
        this.users.add(newUser);
    }
    
    public boolean changePassword(String email, String password, String confirmPassword) {
        for(User user: users) {
           if (user.getEmail().equals(email)){
               user.setPassword(password);
               return true;
           }
        }
        
        return false;
    }
    
    public User getUser(String email){
        for(User userTmp: users){
            if(userTmp.getEmail().equals(email)){
                return userTmp;
            }
        }
   
        return null;
    }
    
    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public User getCurrentUser() {
        return currentUser;
    }    
}

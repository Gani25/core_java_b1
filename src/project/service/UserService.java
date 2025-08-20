package project.service;

import java.util.HashMap;
import java.util.Map;

import project.entity.User;

public class UserService {
    //username ----> user
    private Map<String,User> userMap=new HashMap<>();
    private User currentUser = null;

    public boolean registerUser(String username,String password,String fullName,String contact)
    {
        if(userMap.containsKey(username))
        {
            System.out.println("Username already taken, Please choose another");
            return false;
        }
        // Logic
        System.out.println("Registration Successful!");
        return true;
    }

    public boolean loginUser(String username,String password)
    {
        // Logic
    	return true;
    }

    public void logOutUSer()
    {
        if(currentUser!=null)
        {
            System.out.println("Logged Out "+currentUser.getFullName());
        }
        currentUser=null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn()
    {
        return currentUser!=null;
    }
}
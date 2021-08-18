package code;

import daoimpl.UserDaoImpl;
import java.util.List;
import java.util.Scanner;
import model.User;

public class TestClass {
    public static void main(String[] args) {
        UserDaoImpl udi = new UserDaoImpl();
        //All USers
//        List<User> ull = udi.getAllUsers();
//        for (User u : ull) {
//            System.out.println(u);
//        }

        //List of Active users
//        List<User> ull = udi.getAllActiveUsers();
//        for (User u : ull) {
//            System.out.println(u);
//        }
//list of Disabled USers
//                List<User> ull = udi.getAllDisabledUsers();
//        for (User u : ull) {
//            System.out.println(u);
//        }
        
//        //Get User by ID 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter id to be checked : ");
//        int id = sc.nextInt();
//        User u = udi.getUserByID(id);
//        System.out.println("Name : "+u.getName());
//        System.out.println("Email : "+u.getEmail());
//        
        //Get user by email

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter email to be checked : ");
//        String eml  = sc.next();
//        User u = udi.getUSerByEmail(eml);
//        System.out.println("Name : "+u.getUser_Name());
//        System.out.println("Email : "+u.getEmail());  
        
        //Add User
      
//        activating user
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the userid : ");
//        int id = sc.nextInt();
//        User u = udi.getUserByID(id);
//        u.setActive(true);
//        boolean b = udi.updateUser(u);
//        if (b) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Failure");
//        }
        //change password of user
//         Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the userid : ");
//        int id = sc.nextInt();
//        User u = udi.getUserByID(id);
//        System.out.println(u.getName()+"\n"+u.getEmail());
//        System.out.println("Enter new password : ");
//        String p = sc.next();
//        u.setPassword(p);
//        boolean b = udi.updateUser(u);
//        if (b) {
//            System.out.println("Success : Password changed");
//        } else {
//            System.out.println("Failure Password remains same");
//        }
        //to delete user
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the userid : ");
//        int id = sc.nextInt();
//        User u = udi.getUserByID(id);
//        System.out.println(u.getName()+"\n"+u.getEmail());
//        boolean b = udi.deleteUser(u);
//        if (b) {
//            System.out.println("Success : Deleted User");
//        } else {
//            System.out.println("Failure User not Deleted");
//        }
//        
    }
}

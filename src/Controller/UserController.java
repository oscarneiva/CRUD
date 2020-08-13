package Controller;

import Model.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserController {
    private LinkedList<User> users;
    private User user;


    public UserController(){
        users = new LinkedList<User>();
        try {
            readUser(); // reading all the users from the text file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CRUD - Create
    public void createUser(String username, String password) throws IOException {
        FileWriter file = new FileWriter("./data/users.csv", true);
        file.write(username + "," + password);
        file.write(System.lineSeparator());

        user = new User(username, password);
        users.add(user);

        file.close();
    }

    // CRUD - Read All
    public void readUser()throws IOException {
        FileReader file = new FileReader("./data/users.csv");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            user = new User(data[0], data[1]);
            users.add(user);
        }

        file.close();
    }

    // CRUD - Read a user and check if it exists
    public boolean readUser(String username, String password){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password)){
                System.out.println("welcome");
                return true;
            }
        }
        System.out.println("access denied");
        return false;
    }

    // CRUD - Update
    public void updateUser(){
        // flush text file
        // update one linked list element
        // rewrite elements in the text file
    }

    // CRUD - Delete
    public void deleteUser(){
        // flush text file
        // update one linked element to null
        // rewrite elements in the text file
    }
}

package CRUD;

import Controller.UserController;

import java.io.IOException;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your credentials to login:");
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String newUsername = scanner.nextLine();
        String newPassword = scanner.nextLine();

        UserController userController = new UserController();
        try {
            userController.deleteUser(username,password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package Lesson12;

import Controller.UserController;

import java.io.IOException;
import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your credentials to login:");
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        UserController userController = new UserController();
        userController.readUser(username, password);
    }
}

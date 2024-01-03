package TicTacToeGame.Authentication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Login {

    static ArrayList<User> userList = new ArrayList<>();

    public static void getUserList() {
        String filePath = "C:\\Users\\nichh\\OneDrive\\Documents\\OCC Project\\TicTacToeGame\\Userinfo.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("/");
                User tmp = new User(parts[0], parts[1]);
                userList.add(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean verifyUserName(String name) {
        getUserList();
        boolean exist = false;
        for (User i : userList) {
            if (i.getName().equals(name)) {
                exist = true;
                break; // exit loop early if name is found
            }
        }

        if (exist) {
            System.out.println("User exists. Please pick a different name.");
            return true;
        }

        return false;
    }

    public static boolean loginUser(User loginUser) {
        getUserList();
        boolean exist = false;
        for (User i : userList) {
            if (i.equals(loginUser)) {
                exist = true;
                break; // exit loop early if user is found
            }
        }

        if (exist) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed. User doesn't exist or incorrect credentials.");
            return false;
        }
    }
}


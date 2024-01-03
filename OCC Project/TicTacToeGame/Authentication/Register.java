package TicTacToeGame.Authentication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Register {

    public static void registerUser(String tmpName, String tmpPassword) {
        String filePath = "C:\\Users\\nichh\\OneDrive\\Documents\\OCC Project\\TicTacToeGame\\Userinfo.txt";
        String writingContent = tmpName + "/" + tmpPassword;

        User user1 = new User(tmpName, tmpPassword);
        System.out.println(user1);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            bufferedWriter.write(writingContent);
            bufferedWriter.newLine();
            System.out.println("Data has been appended to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


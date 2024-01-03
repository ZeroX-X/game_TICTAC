package TicTacToeGame.Authentication;

public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User is created\n" +
                "The name is: " + this.name +
                "\nThe password is: " + this.password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User tmpUser = (User) obj;
        return this.name.equals(tmpUser.name) && this.password.equals(tmpUser.password);
    }
}

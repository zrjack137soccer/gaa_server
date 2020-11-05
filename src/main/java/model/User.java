package model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String email;
    private int password;
    private String username;
    private String firstName;
    private String lastName;
    private Image profilePic;
    private Board profileBoard;
    private List<User> supporters;
    private List<User> supported;

    public User(@NotNull String email, @NotNull String password, @NotNull String username, @NotNull String firstName,
                @NotNull String lastName, Image profilePic) {
        this.email = email;
        this.password = encryptPassword(password);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
        this.profileBoard = new Board(UUID.randomUUID().toString());
        this.supporters = new ArrayList<User>();
        this.supported = new ArrayList<User>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encryptPassword(password);
    }

    private int encryptPassword(String password) {
        int hash = 1;
        for(int i = 0; i < password.length(); i++) {
            if ((i % 2) == 0) {
                hash += (i % password.charAt(i));
            } else if ((i % 5) == 0) {
                hash *= password.charAt(i);
            } else {
                hash += password.charAt(i);
            }
        }
        return hash;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Image getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Image profilePic) {
        this.profilePic = profilePic;
    }

    public Board getProfileBoard() {
        return profileBoard;
    }

    public void setProfileBoard(Board profileBoard) {
        this.profileBoard = profileBoard;
    }

    public List<User> getSupporters() {
        return supporters;
    }

    public int getSupporterNum() {
        return supporters.size();
    }

    public void setSupporters(List<User> supporters) {
        this.supporters = supporters;
    }

    public List<User> getSupported() {
        return supported;
    }

    public int getSupportedNum() {
        return supported.size();
    }

    public void setSupported(List<User> supported) {
        this.supported = supported;
    }
}

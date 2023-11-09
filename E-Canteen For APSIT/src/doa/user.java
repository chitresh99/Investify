/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doa;

/**
 *
 * @author avo.v
 */
public class user {
    private final int id;
    private final String name;
    private final String username;
    private final String mobileNumber;
    private final String password;
    private final String securityQuestion;
    private final String answer;
    private final String moodleId;
    private final String status;

    public user(int id, String name, String username, String mobileNumber, String password, String securityQuestion, String answer, String moodleId, String status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
        this.moodleId = moodleId;
        this.status = status;
    }

    // Generate getters and setters for the fields
    // ... (code for getters and setters)

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                ", securityQuestion='" + securityQuestion + '\'' +
                ", answer='" + answer + '\'' +
                ", moodleId='" + moodleId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

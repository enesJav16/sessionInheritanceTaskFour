import java.time.LocalDate;

public class Slack extends Chat{
    private String purpose;
    private int users;

    public Slack() {}

    public Slack(String name, String designColor, LocalDate dateOfIssue, boolean isNew, String purpose, int users) {
        super(name, designColor, dateOfIssue, isNew);
        this.purpose = purpose;
        this.users = users;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }
    void slackMethod(){
        System.out.println("Slack class method.");
        System.out.println("Purpose: "+purpose+
                "\nUsers: "+users);
    }

    @Override
    boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    @Override
    void getChatName() {
        super.getChatName();
        slackMethod();
    }

    @Override
    public String toString() {
        return super.toString()+"\nPurpose: "+purpose+"\nUsers: "+users;
    }
}

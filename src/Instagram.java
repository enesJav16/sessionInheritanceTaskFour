import java.time.LocalDate;

public class Instagram  extends Chat{
    private int users;
    private String version;

    public Instagram() {}

    public Instagram(String name, String designColor, LocalDate dateOfIssue, boolean isNew, int users, String version) {
        super(name, designColor, dateOfIssue, isNew);
        this.users = users;
        this.version = version;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    void instagramMethod(){
        System.out.println("Instagram class method.");
        System.out.println("Users: "+users+
                "\nVersion: "+version);
    }

    @Override
    boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    @Override
    void getChatName() {
        super.getChatName();
        instagramMethod();
    }

    @Override
    public String toString() {
        return super.toString()+"\nUsers: "+users+"\nVersion: "+version;
    }
}

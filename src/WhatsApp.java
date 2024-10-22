import java.time.LocalDate;

public class WhatsApp  extends Chat{
    private String owner;
    int users;

    public WhatsApp() {}

    public WhatsApp(String name, String designColor, LocalDate dateOfIssue, boolean isNew, String owner, int users) {
        super(name, designColor, dateOfIssue, isNew);
        this.owner = owner;
        this.users = users;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    void whatsappMethod(){
        System.out.println("WhatsApp class method.");
        System.out.println("Owner: "+owner+
                "\nUsers: "+users);
    }

    @Override
    boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    @Override
    void getChatName() {
        super.getChatName();
        whatsappMethod();
    }

    @Override
    public String toString() {
        return super.toString()+"\nOwner: "+owner+"\nUsers: "+users;
    }
}

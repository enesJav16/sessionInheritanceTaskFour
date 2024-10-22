import java.time.LocalDate;

public class Telegram  extends Chat{
    private String founder;
    private String countryOfOrigin;

    public Telegram() {}
    public Telegram(String name, String designColor, LocalDate dateOfIssue, boolean isNew, String founder, String countryOfOrigin) {
        super(name, designColor, dateOfIssue, isNew);
        this.founder = founder;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    void telegramMethod(){
        System.out.println("Telegram class method.");
        System.out.println("Founder: "+founder+
                "\nCountry of origin: "+countryOfOrigin);
    }

    @Override
    boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    @Override
    void getChatName() {
        super.getChatName();
        telegramMethod();
    }

    @Override
    public String toString() {
        return super.toString()+"\nFounder: "+founder+"\nCountry of origin: "+countryOfOrigin;
    }
}

import java.time.LocalDate;
import java.time.Period;

public class Chat {
    private String name;
    private boolean isNew;
    private LocalDate dateOfIssue;
    private String designColor;

    public Chat(){}

    public Chat(String name, String designColor, LocalDate dateOfIssue, boolean isNew) {
        this.name = name;
        this.designColor = designColor;
        this.dateOfIssue = dateOfIssue;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignColor() {
        return designColor;
    }

    public void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    void getChatName(){
        System.out.println("Name: "+name+
                           "\nColor: "+designColor);
    }
    boolean getIsNewChat(){
        if (Period.between(dateOfIssue,LocalDate.now()).getYears()>4){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Name: "+name+
                "\nIs new: "+isNew+
                "\nDate of Issue: "+dateOfIssue+
                "\nColor: "+designColor;
    }
}

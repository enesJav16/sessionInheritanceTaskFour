import java.time.LocalDate;
import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WhatsApp whatsApp1=new WhatsApp("WhatsApp Chat1","Blue", LocalDate.of(2020,4,6),true,"Enes",100);
        WhatsApp whatsApp2=new WhatsApp("WhatsApp Chat2","Yellow", LocalDate.of(2010,1,23),false,"Said",1000);
        WhatsApp whatsApp3=new WhatsApp("WhatsApp Chat3","Red", LocalDate.of(2019,5,18),true,"Adilet",500);
        WhatsApp whatsApp4=new WhatsApp("WhatsApp Chat4","Green", LocalDate.of(2023,8,22),true,"Mirlan",800);
        WhatsApp[]whatsAppChats={whatsApp1,whatsApp2,whatsApp3,whatsApp4};

        Telegram telegram1=new Telegram("Telegram Chat1","Purple", LocalDate.of(2020,4,6),true,"Max","Netherlands");
        Telegram telegram2=new Telegram("Telegram Chat2","Blue", LocalDate.of(2024,4,6),true,"Levi","Russia");
        Telegram telegram3=new Telegram("Telegram Chat3","Orange", LocalDate.of(2000,4,6),false,"Elon","RSA");
        Telegram telegram4=new Telegram("Telegram Chat4","Grey", LocalDate.of(2010,4,6),false,"Henry","Britain");
        Telegram []telegramChats={telegram1,telegram2,telegram3,telegram4};

        Instagram instagram1=new Instagram("Instagram Chat1","Pink",LocalDate.of(2018,3,1),false,500,"version 1");
        Instagram instagram2=new Instagram("Instagram Chat2","White",LocalDate.of(2016,11,15),false,1500,"version 2");
        Instagram instagram3=new Instagram("Instagram Chat3","Yellow",LocalDate.of(2008,4,13),false,5300,"version 3");
        Instagram instagram4=new Instagram("Instagram Chat4","Violet",LocalDate.of(2021,1,29),true,53300,"version 4");
        Instagram[]instagramChats={instagram1,instagram2,instagram3,instagram4};

        Slack slack1=new Slack("Slack Chat1","Brown",LocalDate.of(2000,1,1),false,"For Business #1",1000);
        Slack slack2=new Slack("Slack Chat2","Black",LocalDate.of(2010,3,12),false,"For Business #2",2000);
        Slack slack3=new Slack("Slack Chat3","Blue",LocalDate.of(2009,7,13),false,"For Business #3",3000);
        Slack slack4=new Slack("Slack Chat4","Shiny",LocalDate.of(2024,5,23),true,"For Business #4",4000);
        Slack[]slackChats={slack1,slack2,slack3,slack4};




        System.out.println(whatsApp1.getIsNewChat());
        whatsApp1.getChatName();
        System.out.println(whatsApp1);
        System.out.println("=================================");
        System.out.println(whatsApp2.getIsNewChat());
        whatsApp2.getChatName();
        System.out.println(whatsApp2);
        System.out.println("=================================");
        System.out.println(whatsApp3.getIsNewChat());
        whatsApp3.getChatName();
        System.out.println(whatsApp3);
        System.out.println("=================================");
        System.out.println(whatsApp4.getIsNewChat());
        whatsApp4.getChatName();
        System.out.println(whatsApp4);
        System.out.println("=================================");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(telegram1.getIsNewChat());
        telegram1.getChatName();
        System.out.println(whatsApp1);
        System.out.println("=================================");
        System.out.println(telegram2.getIsNewChat());
        telegram2.getChatName();
        System.out.println(whatsApp2);
        System.out.println("=================================");
        System.out.println(telegram3.getIsNewChat());
        telegram3.getChatName();
        System.out.println(whatsApp3);
        System.out.println("=================================");
        System.out.println(telegram4.getIsNewChat());
        telegram4.getChatName();
        System.out.println(whatsApp4);
        System.out.println("=================================");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(instagram1.getIsNewChat());
        instagram1.getChatName();
        System.out.println(instagram1);
        System.out.println("=================================");
        System.out.println(instagram2.getIsNewChat());
        instagram2.getChatName();
        System.out.println(instagram2);
        System.out.println("=================================");
        System.out.println(instagram3.getIsNewChat());
        instagram3.getChatName();
        System.out.println(instagram3);
        System.out.println("=================================");
        System.out.println(instagram4.getIsNewChat());
        instagram4.getChatName();
        System.out.println(instagram4);
        System.out.println("=================================");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(slack1.getIsNewChat());
        slack1.getChatName();
        System.out.println(slack1);
        System.out.println("=================================");
        System.out.println(slack2.getIsNewChat());
        slack2.getChatName();
        System.out.println(slack2);
        System.out.println("=================================");
        System.out.println(slack3.getIsNewChat());
        slack3.getChatName();
        System.out.println(slack3);
        System.out.println("=================================");
        System.out.println(slack4.getIsNewChat());
        slack4.getChatName();
        System.out.println(slack4);
        System.out.println("=================================");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        getNewestWhatsapp(whatsAppChats);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        getNewestTelegram(telegramChats);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        getNewestInstagram(instagramChats);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        getNewestSlack(slackChats);

    }
    public static void getNewestWhatsapp(WhatsApp[]a){
        WhatsApp newest=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(newest.getDateOfIssue().isAfter(a[i+1].getDateOfIssue())){
                newest=a[i+1];
            }
        }
        System.out.println("The newest chat is: "+newest);
    }
    public static void getNewestTelegram(Telegram[]a){
        Telegram newest=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(newest.getDateOfIssue().isAfter(a[i+1].getDateOfIssue())){
                newest=a[i+1];
            }
        }
        System.out.println("The newest chat is: "+newest);
    }
    public static void getNewestInstagram(Instagram[]a){
        Instagram newest=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(newest.getDateOfIssue().isAfter(a[i+1].getDateOfIssue())){
                newest=a[i+1];
            }
        }
        System.out.println("The newest chat is: "+newest);
    }
    public static void getNewestSlack(Slack[]a){
        Slack newest=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(newest.getDateOfIssue().isAfter(a[i+1].getDateOfIssue())){
                newest=a[i+1];
            }
        }
        System.out.println("The newest chat is: "+newest);
    }
}
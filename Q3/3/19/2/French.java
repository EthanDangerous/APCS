public class French implements Language{
    public String hello = "bonjour";
    public String goodBye = "au revoir";
    public String thankYou = "merci";

    @Override
    public String getAuthor(){
        return author + " Ethan";
    }
    @Override
    public String getHello(){
        return hello;
    }
    @Override
    public String getBye(){
        return goodBye;
    }
    @Override
    public String getThankYou(){
        return thankYou;
    }
}

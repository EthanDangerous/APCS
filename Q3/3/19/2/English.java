public class English implements Language{
    public String hello = "hello";
    public String goodBye = "good bye";
    public String thankYou = "thank you";

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
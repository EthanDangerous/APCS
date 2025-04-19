public class Japanese implements Language{
    public String hello = "konnichiwa";
    public String goodBye = "sayonara";
    public String thankYou = "arigato";

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

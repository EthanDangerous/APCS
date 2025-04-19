public class Spanish implements Language{
    public String hello = "hola";
    public String goodBye = "adios";
    public String thankYou = "gracias";

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

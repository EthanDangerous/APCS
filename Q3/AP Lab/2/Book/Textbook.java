public class Textbook extends Book{

    private int edition;

    public Textbook(String title, double price, int edition){
        super(title, price);
        this.edition = edition;
    }

    public int getEdition(){
        return edition;
    }

    public boolean canSubstituteFor(Textbook other){
        if(this.getTitle().equals(other.getTitle()) && this.edition >= other.getEdition()){
            return true;
        }
        return false;
    }

    @Override
    public String getBookInfo()
    {
        return this.getTitle() + "-" + this.getPrice() + "-" + edition;
    }
}
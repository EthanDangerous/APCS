public class Husky extends BigDog{
    public Husky(String name){
        super(name);
    }
    public String speak(){
        return super.speak() + " howl!!!";
    }
}

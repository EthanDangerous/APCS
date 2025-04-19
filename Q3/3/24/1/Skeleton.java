public class Skeleton extends Monster{
    public Skeleton(String name){
        super(name);
    }

    public String getName(){
        return "Skeleton";
    }
    public String toString(){
        return this.getName() + ": " + super.getName();
    }
}

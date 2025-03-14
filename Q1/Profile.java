public class Profile{
    private String name;
    private int age;
    public Profile(){
        name = "blank";
        age = 0;
    }
    public Profile(String nameIn, int ageIn){
        name = nameIn;
        age = ageIn;
    }
    public void printInfo(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
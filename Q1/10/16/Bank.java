public class Bank{
    private int pin;
    private String name;
    private boolean access;

    public Bank(String name, int pin){
        this.name = name;
        this.pin = pin;
        this.access = false;
    }

    public void checkPin(int userPin){
        if(userPin == pin){
            access = true;
        } else{
            access = false;
        }
    }

    public String getName(){
        if(access == true){
            return name;
        }else{
            return "Please log in";
        }
    }

    public boolean getAccess(){
        return access;
    }
}
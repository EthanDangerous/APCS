public class Split {
    private String email;

    public Split(String email){
        this.email = email;
    }

    public String getName(){
        int atPos = email.indexOf("@");
        String name = email.substring(0, atPos);
        return name;
    }

    public String getDomain(){
        int atPos = email.indexOf("@");
        int dotPos = email.lastIndexOf(".");
        String domain = email.substring(atPos + 1, dotPos);
        return domain;
    }

    public String getLastNameMVLA(String string){
        int firstDotPos = string.indexOf(".");
        int atPos = string.indexOf("@");
        String lastName = string.substring(firstDotPos + 1, atPos);
        return lastName;
    }

    public String toString(){
        return "address: " + email;
    }
}

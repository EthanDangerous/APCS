public class Contact {
    private String firstName;
    private String lastName;
    private String email;

    public Contact(String fn, String ln, String em){
        firstName = fn;
        lastName = ln;
        email = em;
    }

    public String getUserName(){
        int loc1 = 0;
        int loc2 = email.indexOf("@");
        String userName = email.substring(loc1, loc2);
        return userName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDomain(){
        int loc1 = email.indexOf("@");
        int loc2 = email.lastIndexOf('.');
        String domain = email.substring(loc1 + 1, loc2);
        return domain;
    }

    public String getDomainExt(){
        int loc1 = email.lastIndexOf('.');
        String domainExt = email.substring(loc1 + 1);
        return domainExt;
    }

    public String toString(){
        String text = firstName + " " + lastName + " - " + email;
        return text;
    }
}

public class Profile{
    private String name;
    private int age;
    private String subject;
    private String hobby;
    private String food;
    private String career;
    public Profile(String nameIn, int ageIn, String subjectIn, String hobbyIn, String foodIn){
        name = nameIn;
        age = ageIn;
        subject = subjectIn;
        hobby = hobbyIn;
        food = foodIn;
    }
    public void printInfo(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nSubject: "+subject+"\nHobby: "+hobby+"\nFood: "+food);
    }
    public void printCareer(String subjectChoice, String hobbyChoice, String foodChoice){
        if (subjectChoice.equals("math") && hobbyChoice.equals("drawing") && foodChoice.equals("healthy food")){
            career = "Data Analyst";
        } else if (subjectChoice.equals("math") && hobbyChoice.equals("drawing") && foodChoice.equals("healthy food")){
            career = "Graphic Designer";
        } else if (subjectChoice.equals("math") && hobbyChoice.equals("building") && foodChoice.equals("junk food")){
            career = "Engineer";
        } else if (subjectChoice.equals("math") && hobbyChoice.equals("building") && foodChoice.equals("junk food")){
            career = "Architect";
        } else if (subjectChoice.equals("art") && hobbyChoice.equals("drawing") && foodChoice.equals("healthy food")){
            career = "Illustrator";
        } else if (subjectChoice.equals("art") && hobbyChoice.equals("drawing") && foodChoice.equals("healthy food")){
            career = "Cartoonist";
        } else if (subjectChoice.equals("art") && hobbyChoice.equals("building") && foodChoice.equals("junk food")){
            career = "Interior Designer";
        } else if (subjectChoice.equals("art") && hobbyChoice.equals("building") && foodChoice.equals("junk food")){
            career = "Set Designer";
        } else if (subjectChoice.equals("science") && hobbyChoice.equals("drawing") && foodChoice.equals("healthy food")){
            career = "Medical Illustrator";
        } else if (subjectChoice.equals("science") && hobbyChoice.equals("drawing") && foodChoice.equals("healthy food")){
            career = "Product Designer";
        } else if (subjectChoice.equals("science") && hobbyChoice.equals("building") && foodChoice.equals("junk food")){
            career = "Research Scientist";
        } else if (subjectChoice.equals("science") && hobbyChoice.equals("building") && foodChoice.equals("junk food")){
            career = "Industrial Engineer";
        }
        System.out.println("Career: "+career);
    }
    public void updateProfile(String nameIn, int ageIn, String subjectIn, String hobbyIn, String foodIn){
        name = nameIn;
        age = ageIn;
        subject = subjectIn;
        hobby = hobbyIn;
        food = foodIn;
    }
}
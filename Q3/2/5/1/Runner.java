import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Henry", 34));
        studentList.add(new Student("Jose", 21));
        studentList.add(new Student("Clara", 21));
        studentList.add(new Student("Nancy", 19));
        System.out.println(studentList.get(0).getAge() + studentList.get(2).getAge() + studentList.get(2).getAge());

        for(int i = 0; i<studentList.size(); i++){
            if(studentList.get(i).getAge() == 21){
                studentList.remove(i);
                i--;
            }
        }

        System.out.println(studentList);
    }
}

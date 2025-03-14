public class Selection{
    public void gradeCalculator(int gradeIn){
        String result = "";
        if(gradeIn >= 90){
            result = "A";
        }else if (gradeIn >= 80){
            result = "B";
        }else if (gradeIn >= 70){
            result = "C";
        }else if (gradeIn >= 60){
            result = "D";
        } else{
            result = "F";
        }
        return result;
    }
    public String zipCode1(int zip1){
        String result = "";
        if(zip1 == 94040){
            result = "Mountain View";
        }else if (zip1 == 94115){
            result = "San Francisco";
        }else if (zip1 == 95051){
            result = "Santa Clara";
        }else if (zip1 == 95129){
            result = "San Jose";
        }else if (zip1 == 94607){
            result = "Oakland";
        }else if (zip1 == 95035){
            result = "Milpitas";
        } else{
            result = "Not Valid";
        }
        return result;
    }
    public String zipCode2(int zip2){
        String result = "";
        switch(zip2){
            case 94040:
                result = "Mountain View";
                break;
            case 94155:
                result = "San Francisco";
                break;
            case 95051:
                result = "Santa Clara";
                break;
            case 95129:
                result = "San Jose";
                break;
            case 94607:
                result = "Oakland";
                break;
            case 95035:
                result = "Milpitas";
                break;
            default:
                result = "Not Valid";
        }
        return result;
    }
}
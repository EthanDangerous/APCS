/* Write the complete Sign class */
public class Sign{
    private String text;
    private int width;

    public Sign(String str, int num){
        this.text = str;
        this.width = num;
    }

    public int numberOfLines(){
        if(text.length()%width == 0){
            return (text.length()/width);
        }else{
            return (text.length()/width) + 1;
        }
    }

    public String getLines(){
        String returnString = "";
        for(int i = 0; i < text.length(); i+=width){
            if(i+width<text.length()){
                returnString = new String(returnString + text.substring(i, i+width) + ";");
            }else{
                returnString = new String(returnString + text.substring(i, text.length()));
            }
        }
        if (returnString.equals("")) {
            return "null";
        }else{
            return returnString;
        }
    }
}
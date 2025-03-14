public class Phrase 
{ 

    private String currentPhrase; 



    public Phrase(String p) 
    { 
        currentPhrase = p; 
    } 



    public int findNthOccurrence(String str, int n) 
    { 

        int occurrence = 0;
        
        for(int i=0; i<currentPhrase.length(); i++)
        {
            if( i+str.length() < currentPhrase.length() )
            {
                if( currentPhrase.substring(i,i+str.length()).equals(str) )
                {
                    occurrence++;
                    if( occurrence == n )
                        return i;
                }
            }
        }
        
        return -1;
    
    }
    

    public void replaceNthOccurrence(String str, int n, String repl) 
    { /* to be implemented in part (a) */
        int findOccur = currentPhrase.findNthOccurance(str, n);
        String start = currentPhrase.substring(0, index);
        String end = currentPhrase.substring(index+str.length());
        currentPhrase = start + repl + end;
    }



    public int findLastOccurrence(String str) 
    { /* to be implemented in part (b) */
        int lastLocation = -1;
        for(int i = 0; i<= currentPhrase.length(); i++){
            int result = findNthOccurrence(str, i);
            if(result != -1){
                lastLocation = result;
            }else{
                return lastLocation;
            }
        }
        return -1;
    }

    public String toString() 
    { 
        return currentPhrase;
    } 

}

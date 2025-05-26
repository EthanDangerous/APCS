public class ScoreBoard{
    private String active;
    private String team1;
    private int score1;
    private int score2;
    private String team2;

    public ScoreBoard(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        this.active = team1;
    }

    public void recordPlay(int num){
        if (num > 0) {
            if (active.equals(team1)){
                score1 += num;
            } else{
                score2 += num;
            }
        } else {
            if (active.equals(team1)){
                active = team2;
            } else{
                active = team1;
            }
        }
    }

    public String getScore(){
        return score1 + "-" + score2 + "-" + active;
    }
}
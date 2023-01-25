public class TEAM1
{
    private int team1wickets_left=10;
    private int team1_total_score=0;

    public int present_score()
    {
        return team1_total_score;
    }
    public int present_wickets_left()
    {
        return team1wickets_left;
    }
    public void add_to_total_score(int x)
    {
        team1_total_score=team1_total_score+x;
    }
    public void wicket()
    {
        team1wickets_left=team1wickets_left-1;
    }
}

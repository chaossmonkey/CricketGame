public class TEAM2
{
    private int team2wickets_left=10;
    private int team2_total_score=0;

    public int present_score()
    {
        return team2_total_score;
    }
    public int present_wickets_left()
    {
        return team2wickets_left;
    }
    public void add_to_total_score(int x)
    {
        team2_total_score=team2_total_score+x;
    }
    public void wicket()
    {
        team2wickets_left=team2wickets_left-1;
    }
}


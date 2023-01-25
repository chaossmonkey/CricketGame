public class RANDOM_REACTION_TO_BOWL
{

    public int batsmen_reaction()
    {
        //here i am assuming a hit of 7 means a wickets
        int max_for_toss_1= 7;
        int min_for_toss_1 = 0;
        int range_for_toss_1 = max_for_toss_1 - min_for_toss_1 + 1;
        int random_toss_1 = (int) (Math.random() * range_for_toss_1) + min_for_toss_1;
        return random_toss_1;
    }
}

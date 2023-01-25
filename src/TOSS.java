public class TOSS
{
    public int toss_reaction()
    {
        System.out.println("ITS TYM FOR TOSS AND THE TOSS RESULTS ARE :PRESS ENTER TO SEE THE RESULT OF THE TOSS");
        ENTER e1=new ENTER();
        e1.enter();
        int max_for_toss = 2;
        int min_for_toss = 1;
        int range_for_toss = max_for_toss - min_for_toss + 1;
        int random_toss = (int) (Math.random() * range_for_toss) + min_for_toss;
        return random_toss;
    }
}

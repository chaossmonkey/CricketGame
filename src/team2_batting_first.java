public class team2_batting_first {

    public void team2_batting()
    {
        TEAM1 team1=new TEAM1();
        TEAM2 team2=new TEAM2();
        ENTER e1=new ENTER();
        RANDOM_REACTION_TO_BOWL random_reaction_to_bowl=new RANDOM_REACTION_TO_BOWL();
        while (team2.present_wickets_left()>0)
        {
            System.out.println();
            System.out.println("THE BOWLER IS ABOUT TO BOWL ..click enter for the delivery");
            e1.enter();
            int reaction= random_reaction_to_bowl.batsmen_reaction();
            if(reaction==7) {
                team2.wicket();
                System.out.println("HOWS THAT -->ITS AN WICKET"+"   "+"THE NO OF WICKETS LEFT ARE"+team2.present_wickets_left());
            }
            else
            {
                System.out.println("THE CURRENT BATSMEN JUST HIT "+"  "+" "+reaction+"runs"+"  "+" for the current delivery");
                team2.add_to_total_score(reaction);
                System.out.println("the present score is "+"->"+team2.present_score()+"with"+"->"+team2.present_wickets_left()+"wickets left");
            }
            if(team2.present_wickets_left()==0)
            {
                System.out.println("TEAM 2 HAS LOST ALL WICKETS ...AND MADE A SCORE OF "+"   "+"->"+team2.present_score());
                System.out.println("NOW ITS TYM FOR TEAM 1 TO BAT ");
            }
        }
        while (team1.present_score()<team2.present_score() && team1.present_wickets_left()>0)
        {
            System.out.println("THE BOWLER IS ABOUT TO BOWL ..click enter for the delivery");
            e1.enter();
            int reaction= random_reaction_to_bowl.batsmen_reaction();
            if(reaction==7) {
                team1.wicket();
                System.out.println("HOWS THAT -->ITS AN WICKET"+"  "+"THE NO OF WICKETS LEFT ARE"+"->"+team1.present_wickets_left());

            }
            else {
                System.out.println("the batsmen scored"+"->"+reaction+"runs");
                team1.add_to_total_score(reaction);
                System.out.println("THE CURRENT TOTAL SCORE IS"+"  "+"->"+"  "+team1.present_score()+"  "+"WITH"+"->"+team1.present_wickets_left()+"WICKETS LEFT");

            }
            if(team1.present_wickets_left()==0 && team1.present_score()<team2.present_score())
            {
                System.out.println("TEAM 2 WON AND TEAM 1 LOST");
                System.out.println("TEAM 2 MADE" + "  "+ team2.present_score()+"RUNS"+" "+"BUT"+"TEAM 1 ONLY MADE"+team1.present_score()+"RUNS");
            }
            if(team1.present_score()>team2.present_score() && team1.present_wickets_left()>0)
            {
                System.out.println("TEAM 1 WON AND TEAM 2 LOST");
                System.out.println("TEAMS 1 WON SINCE IT MADE"+"   "+team1.present_score()+"runs"+"  "+"with"+"  "+team1.present_wickets_left()+"wickets"+" "+"remaining");
            }
        }
    }
}

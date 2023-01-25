public class team1_batting_first
{

    public void team1_batting()
    {

        TEAM1 team1=new TEAM1();
        TEAM2 team2=new TEAM2();
        ENTER e1=new ENTER();
        RANDOM_REACTION_TO_BOWL random_reaction_to_bowl=new RANDOM_REACTION_TO_BOWL();
        while (team1.present_wickets_left()>0)
        {
            System.out.println();

            System.out.println("THE BOWLER OF TEAM 2 IS ON THE RUN-UP...CLICK ON ENTER -> FOR HIM TO BOWL");
            e1.enter();
            int reaction= random_reaction_to_bowl.batsmen_reaction();
            if(reaction==7) {
                team1.wicket();
                System.out.println("ITS A WICKET !!!!"+"     "+"NO OF WICKETS LEFT FOR TEAM 1 :"+"   "+team1.present_wickets_left());
            }
            else
            {
                System.out.println("THE CURRENT BATSMEN OF TEAM1 JUST HIT :"+"  " + "->" + reaction +"run");
                team1.add_to_total_score(reaction);
                System.out.println("THE TOTAL CURRENT SCORE OF TEAM 1 IS  :"+"->"+team1.present_score()+"  "+" with"+"  "+"->"+team1.present_wickets_left()+"wickets left");
            }
            if(team1.present_wickets_left()==0)
            {
                System.out.println("TEAM 1 HAS LOST ALL WICKETS ...AND MADE A SCORE OF "+"  "+"->"+team1.present_score()+" "+"RUNS ");
                System.out.println("NOW ITS TYM FOR TEAM 2 TO BAT ");
            }
        }
        while (team2.present_score()<team1.present_score() && team2.present_wickets_left()>0)
        {
            System.out.println();
            System.out.println("THE BOWLER OF TEAM1 IS ON RUN UP ..CLICK ON ENTER  ->FOR HIM TO BOWL");
            e1.enter();
            int reaction= random_reaction_to_bowl.batsmen_reaction();

            if(reaction==7) {
                team2.wicket();
                System.out.println("HOWS THAT -->ITS AN WICKET"+"THE NO OF WICKETS LEFT ARE"+"  "+team2.present_wickets_left());
            }
            else {
                System.out.println("THE CURRENT BATSMEN JUST HIT"+"  "+"->"+reaction+"runs");
                team2.add_to_total_score(reaction);
                System.out.println("THE PRESENT CURRENT SCORE IS "+"  "+"->"+team2.present_score()+"with"+"->"+team2.present_wickets_left()+"wickets left");
            }
            if(team2.present_wickets_left()==0 && team2.present_score()<team1.present_score())
            {
                System.out.println("TEAM 1 WON AND TEAM 2 LOST");
                System.out.println("TEAM 1 MADE" + " "+ team1.present_score()+"runs"+" "+"but"+"Team 2 only made"+team2.present_score()+"runs");
            }
            if(team2.present_score()>team1.present_score() && team2.present_wickets_left()>0)
            {
                System.out.println("TEAM 2 WON AND TEAM 1 LOST");
                System.out.println("TEAMS 2 WON SINCE IT MADE"+"   "+team2.present_score()+"runs"+"with"+" "+team2.present_wickets_left()+"wickets"+" "+"remaining");
            }
        }
    }
}

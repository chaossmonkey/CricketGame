import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        TOSS t1=new TOSS();
        int random_toss = t1.toss_reaction();//can be either 1 or 2-->1 means team1 will bat first...else team2 will bat first//

        if(random_toss==2)
        {
            System.out.println("TEAM2 HAS WON THE TOSS AND ITS GOING TO BAT FIRST.......SO TEAM 1 IS GOING TO BOWL FIRST");
        }
        else
        {
            System.out.println("TEAM 1 HAD WON THE TOSS AND ITS GOING TO BAT FIRST......SO TEAM 2 IS GOING TO BOWL FIRST");
        }


        if(random_toss==1)
        {
            team1_batting_first t11=new team1_batting_first();
            t11.team1_batting();

        }
        if(random_toss==2)
        {
            team2_batting_first t2=new team2_batting_first();
            t2.team2_batting();

        }
    }
}

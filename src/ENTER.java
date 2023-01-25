import java.util.Scanner;

public class ENTER {


        public  void enter() {
            Scanner sc = new Scanner(System.in);
            //System.out.println("Press a key");
            String entry = sc.nextLine();
            if(!"".equals(entry)) {
                System.out.println("Enter key not pressed");
            }
            else {
                //System.out.println("Enter key pressed");
            }
        }

}

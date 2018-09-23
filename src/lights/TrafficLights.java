package lights;
import java.util.Scanner;

/**
 * Traffic light task for Epam Java Development Courses.
 * Class TrafficLights checks what signal is shown to us by traffic light
 * @author Vadim Frants
 * @version 0.1.1
 */
public class TrafficLights {

    private int time;
    Scanner in = new Scanner(System.in);

    private void setTime() {
        System.out.println("Insert time(from 0 to 60). For turn off the program insert more than 60");
        this.time = in.nextInt();
    }

    public void checkLight(){
        for (int i = 0; i < 60; i++){
            setTime();
            if((time>60) || (time<0)){
                System.out.println("Turning off");
                i = 60;
            } else if ( ((time % 10) >= 0) && ((time % 10) < 3) ){
                System.out.println("Red");
            } else if ( ((time % 10) >= 3) && ( (time % 10) <= 5) ){
                System.out.println("Yellow");
            } else if (((time % 10) > 5) && ((time % 10) <=9)) {
                System.out.println("Green");
            }
            if (i==59){
                i=0;
            }
        }
    }
}

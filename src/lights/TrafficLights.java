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
        System.out.println("Введите время от 0 до 60. Для выхода введите больше 60");
        this.time = in.nextInt();
    }

    public void light(){
        for (int i = 0; i < 60; i++){
            setTime();
            if(time>60){
                System.out.println("Выход из программы");
                break;
            } else if ( ((time % 10) >= 0) && ((time % 10) < 3) ){
                System.out.println("Красный");
            } else if ( ((time % 10) >= 3) && ( (time % 10) <= 5) ){
                System.out.println("Желтый");
            } else if (((time % 10) > 5) && ((time % 10) <10)) {
                System.out.println("Зеленый");
            }
            if (i==59){
                i=0;
            }
        }
    }
}

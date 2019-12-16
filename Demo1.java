import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Demo1 {

    /**
     *
     * @author: ZD
     * @time: 2019/12/16 11:16
     * @description: 示例
     * @param
     * @return:
     */
    public static void main(String[] args){
//        int x = 3;
//        x += 3.5;
//        System.out.println(x);
//        System.out.println("We will not use 'Hello,World!'");
//        StringBuilder builder = new StringBuilder();
//        builder.append("ch");
//        builder.append("zd");
//        String completedString = builder.toString();
//        System.out.println(completedString);
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i =1;i<value;i++){
            System.out.print("   ");
        }
        while(date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue()!=1){
            System.out.println();
    }
    }
}

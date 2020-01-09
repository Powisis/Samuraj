import java.time.DayOfWeek;
import java.time.LocalDate;

public class Days extends Draw{

    private int val;
    private static DayOfWeek dayOfWeek;
    private static LocalDate localDate;

    public int getVal() {
        return val = dayOfWeek.getValue();
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static DayOfWeek getDayOfWeek() {
        return dayOfWeek = DayOfWeek.from(localDate);
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    static void date(){
        System.out.println("Today is " + getDayOfWeek().name());
    }

    static void valOfDate(){
        System.out.println("Int Value of " + getDayOfWeek().name() + " is " + getDayOfWeek().getValue());
    }



}

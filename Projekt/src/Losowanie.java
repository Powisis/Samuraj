import com.google.gson.Gson;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Losowanie {
    public int userID;
    public int drawID;
    public DayOfWeek day;

    LocalDate Data = LocalDate.now();


    public void Losuj() {
        userID = Draw.draw();
        drawID = Draw.objectList.size();
        day = Data.getDayOfWeek();
    }

    public String pobierzJSON(){
        Gson gson = new Gson();
        return gson.toJson(this);

    }

    public String name(){
        return Draw.givenList.get(userID);
    }

    public DayOfWeek getDay() {
        return day;
    }
}
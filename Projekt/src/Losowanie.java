import com.google.gson.Gson;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Losowanie {
    public int userID;
    public int drawID;
    public LocalDate date = LocalDate.now();
    public DayOfWeek day;


    public void Losuj() {
        userID = Draw.draw();
        drawID = Draw.objectList.size();
        day = date.getDayOfWeek();
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

    public LocalDate getDate(){
        return date;
    }


    }

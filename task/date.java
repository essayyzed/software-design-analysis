import java.awt.*;

public class Date {
    public int month;
    public int day;
    public int year;

    public Date(){
        day = 10;
        month = 10;
        year = 2020;
    }

    public void displayDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);

    }

    public boolean equals(Date input_date){
        if (this.day == input_date.day && this.month == input_date.month && this.year == input_date.year){
            System.out.println("True");
            return true;
        }
        else
            System.out.println("False");
            return false;

    }

    public Date differenceDate(Date date){
        date.day -= this.day;
        date.month -= this.month;
        date.year -= this.year;

        return date;
    }

    public static void main(String[] args){
        Date date = new Date();
        date.day = 10;
        date.month = 10;
        date.year = 2020;
        Date date2 = new Date();
        date2.day = 11;
        date2.month = 10;
        date2.year = 2020;

        date.equals(date2);


        //******************************************************************************************///

        Date date3 = new Date();
        date3.day = 10;
        date3.month = 10;
        date3.year = 2020;

        Date date4 = new Date();
        date4.day = 10;
        date4.month = 10;
        date4.year = 2020;

        date3.equals(date4);

        date.differenceDate(date2);
        System.out.println(date2.day + date2.month + date2.year);



    }
}




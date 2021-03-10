class Date{
    public int day;
    public int month;
    public int year;


    /// This is Constructor
    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Class method to display date
    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }


    // class method to check whether two dates are equal
    public boolean equals(Date current_date){
        if (current_date.day == this.day && current_date.month == this.month && current_date.year == this.year){
            System.out.print("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public Date differenceDates(Date current_date){
        current_date.day -= this.day;
        current_date.month -= this.month;
        current_date.year -= this.year;
        return current_date;

    }




    ///////////////MAIN Class//////////////////////////
    public static void main(String[] args) {
        Date obj_2 = new Date(10,10,2020);
        Date obj = new Date(10,10,2020);
        obj_2.displayDate();
        obj.displayDate();
        obj_2.equals(obj);
        obj_2.differenceDates(obj);
        System.out.println(obj_2.day);
}
}
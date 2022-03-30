package controllers;

public class DateTime {
    private int day;
    private int month;
    private int year;

    public DateTime (int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
        this.day = getDay();
        this.month = getMonth();
        this.year = getYear();
    }

    public void setDay(int day) {
        if(day<=31 && day>0) {
            this.day = day;
        }
        else {
            throw new IllegalArgumentException("Invalid Day");
        }
    }

    public void setMonth(int month) {
        if(month<=12 && month>0) {
            this.month = month;
        }else {
            throw new IllegalArgumentException("Invalid Month");
        }
    }
    public void setYear(int year) {
        if(year<=2100 && year >= 1940) {
            this.year = year;
        }else {
            throw new IllegalArgumentException("Invalid Year");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate(){
        return toString();
    }


    public String toString() {
        return String.format("%02d/%02d/%4d", day, month, year);
    }
}

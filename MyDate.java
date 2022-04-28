import javax.swing.JOptionPane;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        String[] components = java.time.LocalDate.now().toString().split("-");
        this.day = Integer.parseInt(components[2]);
        this.month = Integer.parseInt(components[1]);
        this.year = Integer.parseInt(components[0]);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date) {
        String[] components = date.split("\\s");
        this.year = Integer.parseInt(components[2]);
        if(components[1].length() == 4) {
            this.day = Integer.parseInt(components[1].substring(0, 2));
        }else {
            this.day = Integer.parseInt(components[1].substring(0, 1));
        }
        switch(components[0]) {
            case "January":
            this.month = 1;
            break;
            case "February":
            this.month = 2;
            break;
            case "March":
            this.month = 3;
            break;
            case "April":
            this.month = 4;
            break;
            case "May":
            this.month = 5;
            break;
            case "June":
            this.month = 6;
            break;
            case "July":
            this.month = 7;
            break;
            case "August":
            this.month = 8;
            break;
            case "September":
            this.month = 9;
            break;
            case "October":
            this.month = 10;
            break;
            case "November":
            this.month = 11;
            break;
            case "December":
            this.month = 12;
            break;
        }
    }
    
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        if(d>0 && d<=31) this.day=day;
        else this.day=0;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        if(month>0 && month<=12) this.month=month;
        else this.month=0;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if(year>0){
            this.year = year;
        }
    }


    public void accept() {
        String[] components = JOptionPane.showInputDialog(null, "day-month-year", "Please enter date", JOptionPane.INFORMATION_MESSAGE).split("-");
        setDay(Integer.parseInt(components[0]));
        setMonth(Integer.parseInt(components[1]));
        setYear(Integer.parseInt(components[2]));
    }

    public void print() {
        JOptionPane.showMessageDialog(null, Integer.toString(getDay()) + "-" + Integer.toString(getMonth()) + "-" + Integer.toString(getYear()), "Current date", JOptionPane.INFORMATION_MESSAGE);
    }
}
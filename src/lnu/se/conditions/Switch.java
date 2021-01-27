package lnu.se.conditions;

public class Switch {


    /**
     * It will print the day that corresponds to its integer.
     * A common mistake is to forget the key-word "break".
     * Observer if you pass the 1 the method will print "Monday" and then "Tuesday".
     * That is because there is no break at the end of the statement, thus it will execute the next one
     * and stop since the following one it has a break at its end.
     * @param day the number of the day.
     */
    public void printWeekDay(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Default");
        }
    }
}

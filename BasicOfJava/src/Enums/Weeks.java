package Enums;

public enum Weeks {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int day;

    Weeks(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public static void main(String[] args) {

        for (Weeks week : Weeks.values()) {
            System.out.println(week + " is day number " + week.getDay());
        }

        // Example of using the enum in a switch statement
        Weeks today = Weeks.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }
    }
}

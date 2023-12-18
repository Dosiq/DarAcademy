package HW_10;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isHoliday(){
        return this == SATURDAY || this == SUNDAY;
    }

    public boolean isWeekDay(){
        return !isHoliday();
    }


}

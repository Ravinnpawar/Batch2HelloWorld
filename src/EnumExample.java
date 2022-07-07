//Enum is just like class only but have only attributes as constants and should be same type.
//IT is a special data type that can be used a constants.
public class EnumExample {
    public static void main(String[] args) {
        //Days days=Days.FRI;

        for (Days days:Days.values()){
            System.out.println("Today's Day is "+days);
        }

    }

    enum Days{
        SUN,
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT
    }
}

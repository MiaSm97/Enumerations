package exercise.enumerations;

public class Start {
    public static void main(String[] args) {
        enum Months {
            January, February, March, April, May, June,
            July, August, September, October, November, December
        }

        // PROVA
        //EnumSet.allOf(Months.class).forEach(month -> System.out.println(month.toString().endsWith("y")));
        //Arrays.asList(Months.values()).forEach(month -> System.out.println(month.toString().endsWith("y")));

        for(Months months : Months.values()){
            if(months.toString().endsWith("y")){
                System.out.println(months + " ends with y");
            }else{
                System.out.println(months + " doesn't end with y");
            }
        }




    }
}
   /* create an enumeration Month with all the name of the months
        iterate all the values of the enumeration, printing the name of the month followed by:
        ends with y if the name ends with Y
        doesn't end with y if the name doesn't end with y*/
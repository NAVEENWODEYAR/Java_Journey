// Switch statement using enum .,

public class Eight{

    public enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

    public static void main (String[] args){

        Day[] DayNow = Day.values();    
        for (Day Now : DayNow) {   


                    switch (Now){

                        case Sunday:
                            System.out.println("Today is Sunday.");
                            break;
                        case Monday:
                            System.out.println("Today is Monday.");
                            break;
                        case Tuesday:
                            System.out.println("Today is Tuesday.");
                            break;
                        case Wednesday:
                            System.out.println("Today is Wednesday.");
                        case Thursday:
                            System.out.println("Today is Thursday.");
                            break;
                        case Friday:
                            System.out.println("Today is Friday.");
                            break;
                        case Saturday:
                            System.out.println("Today is Saturday.");
                            break;
                        default:
                            System.out.println("Enter the proper day");
                            break;
                    }
                  }

        }
}
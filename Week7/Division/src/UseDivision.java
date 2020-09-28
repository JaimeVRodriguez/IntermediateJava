import java.util.ArrayList;

public class UseDivision {

    public static void main(String[] args) {

        Object[] divisionArray = new Object[4];

        InternationalDivision divisionOne = new InternationalDivision("Sales", 991245, "Moldova", "Romanian");
        InternationalDivision divisionTwo = new InternationalDivision("Engineering", 921873, "Philippines", "Tagalog");
        DomesticDivision divisionThree = new DomesticDivision("Marketing", 982109, "Washington");
        DomesticDivision divisionFour = new DomesticDivision("Human Resources", 872019, "North Carolina");

        divisionArray[0] = divisionOne.display();
        divisionArray[1] = divisionTwo.display();
        divisionArray[2] = divisionThree.display();
        divisionArray[3] = divisionFour.display();

        System.out.println("==== Company XYZ Divisions ====");

        for (Object division : divisionArray) {
            System.out.println(division);
            System.out.println();
        }
        

    }
}

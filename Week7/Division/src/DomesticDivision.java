public class DomesticDivision extends Division {

    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String display() {
        return "Division: " + getDivisionName() + "\n" +
                "Account Number: " + getAccountNumber() + "\n" +
                "State: " + state;
    }
}

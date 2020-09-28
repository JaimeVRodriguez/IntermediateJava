public class InternationalDivision extends Division {

    private String country, language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String display() {
        return "Division: " + getDivisionName() + "\n" +
                "Account Number: " + getAccountNumber() + "\n" +
                "Country: " + country + "\n" +
                "Language: " + language;
    }
}

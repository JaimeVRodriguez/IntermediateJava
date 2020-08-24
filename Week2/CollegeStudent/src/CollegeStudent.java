import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CollegeStudent {

    private String firstName, lastName;
    private GregorianCalendar enrollmentDate, projectedGradDate;

    public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollmentDate = enrollmentDate;

        int year = enrollmentDate.get(Calendar.YEAR);
        int month = enrollmentDate.get(Calendar.MONTH);
        int day = enrollmentDate.get(Calendar.DAY_OF_MONTH);

        GregorianCalendar gc = new GregorianCalendar(year+4, month, day);

        setProjectedGradDate(gc);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public GregorianCalendar getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(GregorianCalendar enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    public GregorianCalendar getProjectedGradDate() {
        return projectedGradDate;
    }
    public void setProjectedGradDate(GregorianCalendar projectedGradDate) {
        this.projectedGradDate = projectedGradDate;
    }

    public static String format(GregorianCalendar date){
        Date newDate = date.getTime();

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatted = fmt.format(newDate);
        return dateFormatted;
    }

    public String toString() {
        return "First Name : "+firstName+"\t Last Name : "+lastName+"\t EnrollDate : "+format(enrollmentDate)+"\t Graduation Date : "+format(projectedGradDate);
    }
}

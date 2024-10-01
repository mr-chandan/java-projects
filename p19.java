// 19. The Citizen class with custom NonEligibleException.
class NonEligibleException extends Exception {
    NonEligibleException(String message) {
        super(message);
    }
}

class Citizen {
    String name, id, country, sex, maritalStatus;
    int age;
    double annualIncome;

    Citizen(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    void validate() throws NonEligibleException {
        if (age < 18 || !country.equals("India")) {
            throw new NonEligibleException("Citizen is not eligible.");
        } else {
            System.out.println("Citizen is eligible.");
        }
    }
}

public class CitizenTest {
    public static void main(String[] args) {
        try {
            Citizen citizen = new Citizen("John", 17, "USA");
            citizen.validate();
        } catch (NonEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
/* 
Output:
Citizen is not eligible.
*/

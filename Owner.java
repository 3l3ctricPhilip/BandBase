import java.io.Serializable;
import java.util.*;

public class Owner extends ObjectPlusPlus implements Serializable {
    private static List<Owner> extent = new ArrayList<>();


    private String firstName;
    private String lastName;
    private List<Building> ownedBuildings;

    public Owner(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ownedBuildings = new ArrayList<>();

        extent.add(this);
    }


}

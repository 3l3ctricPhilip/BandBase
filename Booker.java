import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Booker extends ObjectPlusPlus implements Serializable {

    private static List<Booker> extent = new ArrayList<>();

    private String companyName;

    public Booker(String companyName) {
        super();
        this.companyName = companyName;

        extent.add(this);
    }
}

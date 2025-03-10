import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Musician extends ObjectPlusPlus implements Serializable {
    private static List<Musician> extent = new ArrayList<>();

    private String types;
    private String instruments;
    private String genres;
    private String sex;
    private int yearOfBirth;
    private String note;

    public Musician(String types, String instruments, String genres, String sex, int yearOfBirth, String note) {
        super();
        this.types = types;
        this.instruments = instruments;
        this.genres = genres;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.note = note;

        extent.add(this);
    }


}

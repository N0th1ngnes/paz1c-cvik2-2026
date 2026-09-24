package sk.upjs.paz;
import java.util.List;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database) {
        this.database = database;
    }

    public GenderRatio computeGenderRatio() {

        double boys = 0;
        double girls = 0;
        double unknown = 0;

        for (User user : database) {
            switch (user.gender()) {
                case MALE:
                    ++boys;
                case FEMALE:
                    ++girls;
                case UNKNOWN:
                    ++unknown;
            }
        }

        double total = boys+girls+unknown;

        return new GenderRatio((total/100.0*boys), (total/100.0*girls), (total/100.0*unknown));

    }
}

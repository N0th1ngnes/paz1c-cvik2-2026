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
            System.out.println(user.name());
            switch (user.gender()) {
                case MALE:
                    boys++;
                case FEMALE:
                    girls++;
                case UNKNOWN:
                    unknown++;
            }
        }

        double total = (boys+girls+unknown);
        System.out.println(girls + " " + boys + " " + unknown + " " + total);
        return new GenderRatio((boys*100.0/total), (girls*100.0/total), (unknown*100.0/total));

    }
}

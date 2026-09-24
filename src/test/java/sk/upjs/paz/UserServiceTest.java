package sk.upjs.paz;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UserServiceTest {

    private UserService userService;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        userService = new UserService(List.of(
                new User(1L,
                        "Fedor",
                        "Alpivsky",
                        User.Gender.MALE,
                        User.Role.STUDENT,
                        LocalDate.of(2000,4,16)
                ),
                new User(2L,
                        "Alice",
                        "Borland",
                        User.Gender.FEMALE,
                        User.Role.PROFESSOR,
                        LocalDate.of(2000,4,16)
                ),
                new User(3L,
                        "Cat",
                        "Barsik",
                        User.Gender.UNKNOWN,
                        User.Role.ADMIN,
                        LocalDate.of(2010,10,10)
                )
            )
        );
    }

    @org.junit.jupiter.api.Test
    void computeGenderRatio(){
        GenderRatio got = userService.computeGenderRatio();
        assertEquals(33.33333333,got.unknown());
        assertEquals(33.33333333,got.boys());
        assertEquals(33.33333333,got.girls());

    }


}
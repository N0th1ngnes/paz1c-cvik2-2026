package sk.upjs.paz;

import java.time.LocalDate;

public record User(
        Long ID,
        String name,
        String Surname,
        Gender gender,
        Role title,
        LocalDate birthDate
) {
    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }
    public enum Role{
        Unknown,
        GUEST,
        ADMIN,
        PROFESSOR,
        STUDENT
    }
}

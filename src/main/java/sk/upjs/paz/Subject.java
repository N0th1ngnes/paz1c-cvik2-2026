package sk.upjs.paz;

import java.util.List;

public record Subject(
        Long ID,
        String name,
        int year,
        List<User> students
) {



}

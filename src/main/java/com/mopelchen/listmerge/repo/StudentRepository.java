package com.mopelchen.listmerge.repo;

import com.mopelchen.listmerge.model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentRepository {

    public List<Student> getStudents() {
        return Arrays.asList(
                new Student("Lisa",
                        "Meier",
                        "lime01"
                ),
                new Student("Adrian",
                        "Schiller",
                        "adsc01"
                ),
                new Student("Sebastian",
                        "Krause",
                        "sekr01"
                ),
                new Student("Linus",
                        "Mehl",
                        "lime02"
                ),
                new Student("Karola",
                        "Lang",
                        "kala01"
                ),
                new Student("Finn",
                        "Tiller",
                        "fiti01"
                ),
                new Student("Ariane",
                        "Klingel",
                        "arkl01"
                ),
                new Student("Steffen",
                        "Götz",
                        "stgo01"
                )
        );
    }
}

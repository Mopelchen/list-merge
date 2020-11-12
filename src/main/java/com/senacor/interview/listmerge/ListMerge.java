package com.senacor.interview.listmerge;


import com.senacor.interview.listmerge.model.Person;
import com.senacor.interview.listmerge.model.Student;
import com.senacor.interview.listmerge.repo.StudentRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMerge {

    private final StudentRepository studentRepository = new StudentRepository();

    private final List<Person> participants = Arrays.asList(
            new Person("Adele", "Frank"),
            new Person("Linus", "Mehl"),
            new Person("Herbert", "Engelmann"),
            new Person("Karola", "Lang"),
            new Person("Ariane", "Klingel"),
            new Person("Finn", "Tiller")
    );

    public List<Student>  getAllParticipants() {

        // Erstelle die Liste aller Kursteilnehmer.
        // Falls der Teilnehmer ein Student ist, soll die studentId mit ausgegeben werden.
        // Ist der Teilnehmer ein Gasthörer (also kein Student), so soll anstelle der studentId ein '-'
        // ausgegeben werden.


        return Collections.emptyList();
    }


}

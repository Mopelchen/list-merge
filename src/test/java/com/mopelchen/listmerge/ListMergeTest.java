package com.mopelchen.listmerge;

import com.mopelchen.listmerge.model.Student;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListMergeTest
{
    private final ListMerge unitUnderTest = new ListMerge();

    @Test
    public void test()
    {
        List<Student> result = unitUnderTest.getAllParticipants();

        assertThat(result)
                .isNotNull()
                .isNotEmpty()
                .hasSize(6)
                .containsExactly(
                        new Student("Adele", "Frank", "-"),
                        new Student("Linus", "Mehl", "lime02"),
                        new Student("Herbert", "Engelmann", "-"),
                        new Student("Karola", "Lang", "-"),
                        new Student("Ariane", "Klingel", "arkl01"),
                        new Student("Finn", "Tiller", "fiti01")
                );
    }
}

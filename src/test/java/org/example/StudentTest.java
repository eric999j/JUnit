package org.example;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class StudentTest {

    @Test
    void fullName() {
        Student std = new Student("Eric","Lu");

        String actual = std.getFullName();
        Assertions.assertThat(actual).isEqualTo("Eric Lu");
    }
}
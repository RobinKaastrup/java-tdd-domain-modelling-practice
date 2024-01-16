package com.booleanuk.core;

import com.booleanuk.StudentSelector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StudentSelectorTest {
    @Test
    public void showOptionsTest() {
        StudentSelector studentSelector = new StudentSelector();
        String userOptionsShouldBe = "";

        String optionKeys = studentSelector.options.keySet().toArray();
        String optionValues = studentSelector.options.values().toArray();
        for(int i = 0; i < studentSelector.options.size; i++) {
            userOptionsShouldBe += optionKeys[i] + " " + optionValues[i].userOption + "\n";
        }

        Assertions.assertEquals(userOptionsShouldBe, studentSelector.showOptions());

    }

    public void getRandomStudentTest() {
        Random randomizer = new Random(681);

    }
}

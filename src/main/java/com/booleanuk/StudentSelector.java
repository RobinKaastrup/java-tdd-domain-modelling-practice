package com.booleanuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentSelector {

    public ArrayList<String> students;
    public HashMap<String, Option> options;
    public Scanner userInput;

    public StudentSelector() {
        this.options.put("S", new Option("Get Random Student", selectRandomStudent()));
    }
}

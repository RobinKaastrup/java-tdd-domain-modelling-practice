# User Stories Ex1
```
1. When I run the program I see a menu giving me options to use each of the functions of the program.

2. When I select the option it will output a randomly chosen student from the list.

3. When I select the option it will output a list of all of the students as randomly chosen pairs.

4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).

5. When I run the program it should load the list of current students from a text file. 
```

| User Story | Class           | Member Variables                | Method                                        | Situation                                               | Output/Response                                                             |
|------------|-----------------|---------------------------------|-----------------------------------------------|---------------------------------------------------------|-----------------------------------------------------------------------------|
|            | Option          | Runnable method                 |                                               |                                                         |                                                                             |
|            |                 | String userOption               |                                               |                                                         |                                                                             |
|            | StudentSelector |                                 | run()                                         | a new StudentSelector is created                        | the program loop starts                                                     |
|            |                 | ArrayList<String> students      |                                               |                                                         |                                                                             |
|            |                 | Scanner userInput               |                                               |                                                         |                                                                             |
|            |                 | HashMap<String, Option> options |                                               |                                                         |                                                                             |
| 1          |                 |                                 | String showOptions()                          | the user starts the program or selects an option        | A String with a list of options is written to the console                   |
| 2          |                 |                                 | String selectRandomStudent()                  | the user selects the select random student option       | A random students name is returned                                          |
| 3          |                 |                                 | String[][] pairRandomStudents()               | the user selects the select pair random students option | An array of string arrays containing each pair is returned                  |
| 4          |                 |                                 | String[][] groupRandomStudents(int groupSize) | the user selects the group random students option       | An array of string arrays containing each group is returned                 |
| 5          |                 |                                 | boolean getStudentsFromFile()                 | a new StudentSelector is created                        | returns true if the contents of the file was loaded correctly. false if not |

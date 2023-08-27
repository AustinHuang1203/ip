package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//duke.Deadline class
public class Deadline extends Task {
    LocalDate by;

    //Stores the due date as by
    public Deadline(String name, String by) {
        super(name);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            this.by = LocalDate.parse(by, inputFormatter);
        } catch (Exception e) {
            System.out.println("Invalid date!");
        }
    }


    //default display for this type
    public String display() {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
        if (done) {
            return "[D][X] " + this.name + " (Due By: " + by.format(outputFormatter) + ")";
        }
        return "[D][] " + this.name + " (Due By: " + by.format(outputFormatter) + ")";
    }
}

package studentStoryRating;

import classes.ChemistryClass;
import classes.MathClass;
import person.Student;

public class StoryRating {
    public static void main(String[] args) {
        Student addStudent = new Student("Jakub", "Podolski");
        MathClass match = new MathClass();
        ChemistryClass chem = new ChemistryClass();
        System.out.println("historia ocen ucznia: " + addStudent.getFirstName() + " "
                + addStudent.getLastName() + ", ocena z matematyki: "
                + match.rating + ", ocena z chemii:" + chem.rating);
    }
}

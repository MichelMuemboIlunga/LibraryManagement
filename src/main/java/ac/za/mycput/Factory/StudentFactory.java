/*
 * Entity for the StudentFactory
 * Author: Chriszano Cleophas (219258341)
 * Date: 10 April 2022
 */


package ac.za.mycput.Factory;

import ac.za.mycput.Entity.Student;

public class StudentFactory {
    public static Student createStudent(int studentId, String firstName, String lastName, String gender) {
        return new Student.Builder().setStudentId(id).setFirstName(firstName).setLastName(lastName).setGender(Gender).build();
    }

}

package ac.za.mycput.Factory;

import ac.za.mycput.Entity.Course;

public class CourseFactory {
    public static Course create(int courseId, String courseName, String description) {
        return new Course.Builder().setCourseId(courseId).setCourseName(courseName).setDescription(description).build();
        }
    }


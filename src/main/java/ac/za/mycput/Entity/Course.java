package ac.za.mycput.Entity;

public class Course {

    private int courseId;
    private String courseName;
    private String description;

    public Course(Course.Builder builder) {
        this.courseId = builder.courseId;
        this.courseName = builder.courseName;
        this.description = builder.description;
    }

    public int getcourseId() {
        return courseId;
    }

    public void setcourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private int courseId;
        private String courseName;
        private String description;


        public Course.Builder setcourseId(int courseId) {
            this.courseId = courseId;
            return this;
        }

        public Course.Builder setcourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Course.Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Course.Builder copy(Course course) {
            this.courseId = course.courseId;
            this.courseName = course.courseName;
            this.description = course.description;

            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}

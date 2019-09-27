package OOP.StudentPackage;

public class Student
{
    private Long studentId;
    private String name;
    private String surname;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private Long phone;
    private Faculty faculty;
    private Integer course;
    private Group group;

    public Student(Long studentId, String name, String surname, String middleName, String dateOfBirth, String address, Long phone, Faculty faculty, Integer  course, Group group)
    {
        if(studentId < 0) throw new ExceptionInInitializerError();
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhone() {
        return phone;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public Group getGroup() {
        return group;
    }

    public void setStudentId(long studentId)
    {
        if(studentId < 0) throw new ExceptionInInitializerError();
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "sudentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

package OOP.StudentPackage;

enum Faculty
{
    Химии,
    Строительства,
    Инфорамтики,
    Энергетики
}

public class Student
{
    private Long sudentId;
    private String name;
    private String surname;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private Long phone;
    private Faculty faculty;
    private Integer course;
    private String group;

    public Student(Long sudentId, String name, String surname, String middleName, String dateOfBirth, String address, Long phone, Faculty faculty, Integer  course, String group)
    {
        if(sudentId < 0) throw new ExceptionInInitializerError();
        this.sudentId = sudentId;
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

    public Long getSudentId() {
        return sudentId;
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

    public String getGroup() {
        return group;
    }

    public void setSudentId(long sudentId)
    {
        if(sudentId < 0) throw new ExceptionInInitializerError();
        this.sudentId = sudentId;
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

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "sudentId=" + sudentId +
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

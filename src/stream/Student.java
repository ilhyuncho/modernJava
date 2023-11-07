package stream;

public class Student implements Comparable<Student> {

    int age;
    int classNumber;

    public Student() {
    }
    public Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    public int getAge() {
        return age;
    }

    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public int compareTo(Student o) {

        return this.age - o.age;
    }
}

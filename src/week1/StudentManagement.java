package week1;


public class StudentManagement {


	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
    	Student s1=new Student();
    	s1.setName("Nguyen Minh Hai");
    	s1.setId("17020716");
    	s1.setGroup("INT22042");
    	s1.setEmail("haimu.99@gmail.com");
    	s1.getInfo();
    	Student s2=new Student();
    	s2.getInfo();
    	Student s3=new Student(s1);
    	s3.getInfo();
    }
}

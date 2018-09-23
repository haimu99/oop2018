package week1;


public class StudentManagement {


	// TODO: khai bÃ¡o thuá»™c tÃ­nh students lÃ  array chá»©a cÃ¡c Ä‘á»‘i tÆ°á»£ng thuá»™c lá»›p Student (max. 100)
    public Student[] s_Array= new Student[100];
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO: 
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO
	//tao sinh vien thu nhat
    	Student s1=new Student();
    	s1.setName("Nguyen Minh Hai");
    	s1.setId("17020716");
    	s1.setGroup("INT22042");
    	s1.setEmail("haimu.99@gmail.com");
    	s1.getInfo();
	//tao sinh vien thu 2 giong sv thu nhat
    	Student s2=new Student(s1);
    	s2.getInfo();
	//tao sinh vien thu 3
    	Student s3=new Student();
    	s3.getInfo();
    	System.out.println("Sinh vien 1 và 2 cung lop? "+sameGroup (s1,s2));
    	System.out.println("Sinh vien 1 và 3 cung lop? "+sameGroup (s1,s3));
    }
}

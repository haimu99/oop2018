package week1;

public class Student {

	private String name,id,group,email;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setGroup(String group){
		this.group = group;
	}
	public String getGroup(){
		return group;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
    Student() {
    	name= "Student";
    	id="000";
    	group="INT22041";
    	email="uet@vnu.edu.vn";
    }

    public Student(String n, String sid,String em) {
    	name=n;
    	id=sid;
    	email=em;
    	group= "INT22041";
    }
    Student(Student s) {
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

    public void getInfo() {
    	System.out.println("Ho va ten sinh vien: " +getName()+"\n");
    	System.out.println("Ma sinh vien: " +getId() +"\n");
    	System.out.println("Lop: " + getGroup() + "\n");
    	System.out.println("Email: " + getEmail() +"\n");
    }
}

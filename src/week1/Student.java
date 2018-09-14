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
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String name, String id, String group, String email) {
        // TODO:
    	this.name= name;
    	this.id=id;
    	this.group= group;
    	this.email= email;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    public void getInfo() {
    	System.out.println("Ho va ten sinh vien " +getName()+"\n");
    	System.out.println("Ma sinh vien " +getId());
    }
}

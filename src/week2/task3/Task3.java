package week2.task3;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import static week2.task3.Footballer.moreGoal;
import static week2.task3.Teacher.sameFaculty;

public class Task3 {
    public static void main(String[] args) {
        
        //lớp Giáo viên
        Teacher t1=new Teacher("Le Khoi", "CNTT", "khoiln@vnu.edu.vn", 10000000, 18);
        Teacher t2=new Teacher("Pham Huong", "DTVT", "phamhuong@vnu.edu.vn",9500000, 20);
        t1.getInfo();
        t2.getInfo();
        System.out.println("Giao vien "+t1.getName()+" co thu nhap la: "+t1.earn()+"\n");
        System.out.println("Giao vien "+t1.getName()+" va "+t2.getName()+" cung khoa khong? "+sameFaculty(t1, t2)+"\n");
        
        // lớp Football
        Footballer f1=new Footballer("Quang Hai", 9, 23, true);
        Footballer f2=new Footballer("Van Quyet", 12, 21, true);
        Footballer f3=new Footballer("Hoang Vu Samson", 18, 11, false);
        moreGoal(f1, f2);
        moreGoal(f2, f3);
        f1.nationalPlayer();
        f2.nationalPlayer();
        f3.nationalPlayer();
        f1.performanceScore();
        f2.performanceScore();
        f3.performanceScore();
        
        //Lớp HinhThangCan
        HinhThangCan hinh1=new HinhThangCan(4, 4, 8);
        System.out.println("Canh ben cua hinh la: "+ hinh1.canhBen()+"\n");
        System.out.println("Dien tich hinh la: "+hinh1.dienTich()+"\n");
        System.out.println("Hinh co phai la hinh chu nhat? "+hinh1.hinhChuNhat()+"\n");
    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class HinhThangCan{
    private double canhDay1,canhDay2,chieuCao;

    public double getCanhDay1() {
        return canhDay1;
    }

    public void setCanhDay1(double canhDay1) {
        this.canhDay1 = canhDay1;
    }

    public double getCanhDay2() {
        return canhDay2;
    }

    public void setCanhDay2(double canhDay2) {
        this.canhDay2 = canhDay2;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public HinhThangCan(double canhDay1, double canhDay2, double chieuCao) {
        this.canhDay1 = canhDay1;
        this.canhDay2 = canhDay2;
        this.chieuCao = chieuCao;
    }
    
    public double canhBen(){
        double side=sqrt(getChieuCao()*getChieuCao()+abs(getCanhDay1()-getCanhDay2())*abs(getCanhDay1()-getCanhDay2())*0.25);
        return side;
    }
    public double dienTich(){
        double S=(getCanhDay1()+getCanhDay2())*getChieuCao()*0.5;
        return S;
    }
    public boolean hinhChuNhat(){
        return getCanhDay1()==(getCanhDay2());
    }
    
}
class Teacher {
    private String name,faculty,email;
    private double salary, teachHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTeachHour() {
        return teachHour;
    }

    public void setTeachHour(double teachHour) {
        this.teachHour = teachHour;
    }
    public void getInfo(){
         System.out.println("Ho va ten giao vien: "+getName()+"\n");
         System.out.println("Khoa: "+getFaculty()+"\n");
         System.out.println("Email: "+getEmail()+"\n");
    }
    public static boolean sameFaculty(Teacher t1, Teacher t2){
        return t1.getFaculty().equals(t2.getFaculty());
    }
    public double earn(){
        return getSalary()+getTeachHour()*10000;
    }

    public Teacher(String name, String faculty, String email, double salary, double teachHour) {
        this.name = name;
        this.faculty = faculty;
        this.email = email;
        this.salary = salary;
        this.teachHour = teachHour;
    }
}
class Footballer{
    private String name;
    private boolean nationalPlayer;
    private double goal,game;

    public double getGame() {
        return game;
    }
    public void setGame(int game) {
        this.game = game;
    }
    public boolean isNationalPlayer() {
        return nationalPlayer;
    }

    public void setNationalPlayer(boolean nationalPlayer) {
        this.nationalPlayer = nationalPlayer;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGoal(int goal){
        this.goal=goal;
    }
    public double getGoal(){
        return goal;
    }
    public Footballer(String name,double goal,double game,boolean nation){
        this.name=name;
        this.nationalPlayer=nation;
        this.game=game;
        this.goal=goal;
    }
    public static void moreGoal(Footballer f1,Footballer f2){
        if(f1.getGoal()>f2.getGoal()) 
            System.out.println(f1.getName()+" ghi nhieu ban thang hon "+ f2.getName()+"\n");
        else if(f1.getGoal()==f2.getGoal())
            System.out.println(f1.getName()+" ghi bang so ban "+ f2.getName()+"\n");
        else System.out.println(f1.getName()+" ghi it ban hon "+f2.getName()+"\n");
    }
    public void nationalPlayer(){
        if (isNationalPlayer())
            System.out.println(getName()+" la tuyen thu quoc gia\n");
        else System.out.println(getName() + " khong duoc goi len tuyen\n");
    }
    public void performanceScore(){
        double x=getGoal()/getGame();
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(getName()+" co hieu suat ghi "+df.format(x)+" ban/tran\n");
    }
}


package week2.task2;
import static week2.task1.Task1.gcd;

public class Fraction {

    // TODO: khai bao tu va mau so
    int numerator,denomianator;

    public Fraction(int numerator, int denominator) {
        // TODO: khoi tao gia tri
        this.numerator=numerator;
        this.denomianator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: PhÆ°Æ¡ng thá»©c cá»™ng hai phÃ¢n sá»‘ (this vÃ  other), tráº£ vá»� Ä‘á»‘i tÆ°á»£ng Fraction má»›i
        Fraction tong=new Fraction(1,1);
        tong.numerator=this.numerator*other.denomianator+this.denomianator*other.numerator;
        tong.denomianator=this.denomianator*other.denomianator;
        tong.toigian();
        return tong;
    }

    public Fraction subtract(Fraction other) {
        // TODO: PhÆ°Æ¡ng thá»©c trá»« hai phÃ¢n sá»‘ (this vÃ  other), tráº£ vá»� Ä‘á»‘i tÆ°á»£ng Fraction má»›i
        Fraction hieu=new Fraction(1,1);
        hieu.numerator=this.numerator*other.denomianator-this.denomianator*other.numerator;
        hieu.denomianator=this.denomianator*other.denomianator;
        hieu.toigian();
        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: PhÆ°Æ¡ng thá»©c nhÃ¢n hai phÃ¢n sá»‘ (this vÃ  other), tráº£ vá»� Ä‘á»‘i tÆ°á»£ng Fraction má»›i
        Fraction tich=new Fraction(1,1);
        tich.numerator=this.numerator*other.numerator;
        tich.denomianator=this.denomianator*other.denomianator;
        tich.toigian();
        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: PhÆ°Æ¡ng thá»©c chia hai phÃ¢n sá»‘ (this vÃ  other), tráº£ vá»� Ä‘á»‘i tÆ°á»£ng Fraction má»›i
        Fraction thuong= new Fraction(1, 1);
        thuong.numerator=this.numerator*other.denomianator;
        thuong.denomianator=this.denomianator*other.numerator;
        thuong.toigian();
        return thuong;
    }
    public void toigian(){
        //tối giản phân số
        int a=gcd(this.numerator,this.denomianator);
        this.numerator=this.numerator/a;
        this.denomianator=this.denomianator/a;
    }

    public boolean equals(Object obj){
        Fraction hieu=new Fraction(1, 1);
        if (obj instanceof Fraction){
            Fraction other=(Fraction) obj;
            if (this.denomianator==0||other.denomianator==0) return false;
            hieu=this.subtract(other);
            return hieu.numerator==0;
        }
        else return false;
    }
    public static void main(String[] args) {
        Fraction a=new Fraction(2,3);
        Fraction b=new Fraction(4,6);
        Fraction c=new Fraction(1,1);
        c=a.add(b);
        System.out.println(c.numerator+"/"+c.denomianator);
        c= a.subtract(b);
        System.out.println(c.numerator+"/"+c.denomianator);
        c=a.multiply(b);
        System.out.println(c.numerator+"/"+c.denomianator);
        c=a.divide(b);
        System.out.println(c.numerator+"/"+c.denomianator);
  
        System.out.println(a.equals(b));
    }
}

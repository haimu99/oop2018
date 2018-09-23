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
        int a=gcd(this.numerator,this.denomianator);
        this.numerator=this.numerator/a;
        this.denomianator=this.denomianator/a;
    }
    public static void main(String[] args) {
        Fraction a=new Fraction(5,12);
        Fraction b=new Fraction(5,25);
        a = a.add(b);
        System.out.println(a.numerator+"/"+a.denomianator);
    }
}

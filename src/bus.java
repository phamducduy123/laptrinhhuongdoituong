import java.util.Scanner;

public class bus  extends xe{
    int sotuyen;

    int dodailotrinh;
Scanner scanner=new Scanner(System.in);
bus()
{

}
bus(int a, String b, String c, int d,int e)
{
    super(a,b,c);
    sotuyen=d;
    dodailotrinh=e;
}
    @Override
    void nhap() {
        super.nhap();
        System.out.println("nhap so tuyen");
        sotuyen=scanner.nextInt();
        System.out.println("nhap do dai lo trinh");
        dodailotrinh=scanner.nextInt();
    }

    @Override
    void xuat() {
        super.xuat();
        System.out.print("so tuyen"+sotuyen);
    }

    @Override
    int tinhtienquatram() {
    if(dodailotrinh>20)
        return 10000;
    return 5000;
    }
}

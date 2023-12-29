import java.util.Scanner;

abstract class xe {
    int bienso;
    String mau;
    String nhanhieu;
    Scanner scanner=new Scanner(System.in);
    xe()
    {

    }
    xe(int a,String b,String c)
    {
        bienso=a;
        mau=b;
        nhanhieu=c;
    }
    void nhap()
    {
        System.out.println("Nhap bien so");
        bienso=scanner.nextInt();
        System.out.println("Nhap mau");
        mau=scanner.nextLine();
        System.out.println("Nhap nhan hieu");
        nhanhieu=scanner.nextLine();

    }
    void xuat()
    {
        System.out.println("bien so "+bienso);

        System.out.println("mau"+mau);

        System.out.println("Nhap nhan hieu"+nhanhieu);


    }
  abstract   int tinhtienquatram();

}

import java.util.Scanner;

public class xetai extends xe{
    int trongtai;
    Scanner scanner=new Scanner(System.in);
    public xetai() {
    }


    public xetai(int a, String b, String c, int trongtai) {
        super(a, b, c);
        this.trongtai = trongtai;
    }

    @Override
    void nhap() {
        super.nhap();
        System.out.println("nhap trong tai");
        trongtai=scanner.nextInt();
    }

    @Override
    void xuat() {
        super.xuat();
        System.out.println("trong tai"+trongtai);
    }

    @Override
    int tinhtienquatram() {
        if(trongtai<3)
            return 15000;
        return 30000;
    }
}

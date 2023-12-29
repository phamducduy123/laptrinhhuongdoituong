import java.util.Scanner;

public class dsxe {
    xe [] arr=new xe[100];
    int soluongxe=0;
    Scanner scanner=new Scanner(System.in);
    dsxe()
    {

    }
    dsxe(xe[] ds)
    {
        arr=ds;
        soluongxe=ds.length;
    }
    void them1xe()
    {
        int loai;
        System.out.println("nhap loai xe 0 bus, 1 tai");
        loai=scanner.nextInt();
        if(loai==0) {
            arr[soluongxe] = new bus();
            soluongxe++;

        }else
        {
            arr[soluongxe] = new xetai();
            soluongxe++;

        }

    }
    void  tinhtongsotien()
    {
        int sum=0;
        for (int i=0;i<soluongxe;i++)
        {
            sum+=arr[i].tinhtienquatram();
        }
        System.out.println("Tong so tien la :"+sum);
    }
}

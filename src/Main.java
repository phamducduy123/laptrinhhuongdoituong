public class Main {
    public static void main(String[] args) {
        xe xe1=new bus(1223,"do","toyota",100,10);
        xe xe2=new bus(1983,"vang","honda",20,30);
        xe xe3=new xetai(1113,"den","yamaha",27);
        xe []  arr=new xe[3];
        arr[0]=xe1;
        arr[1]=xe2;
        arr[2]=xe3;
      dsxe dsxe=  new dsxe(arr);
      dsxe.tinhtongsotien();

    }
}
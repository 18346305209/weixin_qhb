package day12.hongbao;

public class Bootstrap {
    public static void main(String[] args) {
     //设置标题
        MyRed myRed = new MyRed("Java9班抢红包");
        //设置群主名
        myRed.setOwnerName("马云");
        // 设置分发策略
        //普通红包
        //NormalMode normalMode = new NormalMode();
        //myRed.setOpenWay(normalMode);
        RadomMode radomMode = new RadomMode();
        myRed.setOpenWay(radomMode);
    }

}

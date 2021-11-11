public class ThisDetail {
    public void f1(){
        System.out.println("f1() 方法");
    }
    public void f2(){
        System.out.println("f2() 方法");
        f1();
        this.f1();
    }

    public static void main(String[] args) {
        ThisDetail thisDetail=new ThisDetail();
        thisDetail.f2();
    }
}

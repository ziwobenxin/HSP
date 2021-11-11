public class hanoiTower {
    public void move (int num,char a,char b,char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有多个盘可以看成两个，最下面的和上面的所有盘
            //先移动上面所有的盘到B，借助C
            move(num-1,a,c,b);
            System.out.println(a+"->"+c);
            //将b塔中的所有盘移动到C借助A
            move(num-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        hanoiTower tower=new hanoiTower();
        tower.move(5,'A','B','C');
    }

}

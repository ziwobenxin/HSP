public class hsp2 {
    public static void main(String[] args) {
        a a1=new a();
        double arr[]={1.0,4.7,1.8};
        System.out.println(a1.max(arr));
        hsp1 h1=new b();
        System.out.println(h1);
    }
}
class a{
    public double max(double[] arr){
        double max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }

        return max;
    }


}

class  b extends hsp1{
    int count=10;
}

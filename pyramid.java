package Java;
public class Pattern{
    public static void main(String[] args) {
        int n=4;
        int z=0;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.printlj" ");
            }
            for(int k=i-1;k>=-(i-1);k--){
                System.out.println((char)(z-Math.abs(k)+65));
            }
            z=z+2;
            System.out.println();
        }
    }
}
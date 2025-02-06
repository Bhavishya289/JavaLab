
public class SumOfintegers{
    public static void main(String[] args){
        int x = 10;
        int y = 950;
        int sum = 0;

        for(int i=x; i<=y; i++){
            if(i%6 == 0 && i%9 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of integers from 10 to 950 divisible by 6 and 9: "+sum);
    }
}
//import java.util.*;
public class  findHarshadNumber{
    public static void main(String a[]){
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the number to check the given number is Harshad number or not: ");
        int num=ss.nextInt();

        findHarshadNumber obj=new findHarshadNumber();
        
        boolean k=obj.isHarshadNumber(num);
        if(k)
            System.out.println("The given is Harshad Number.");
        else    
            System.out.println("The given number is not a Harshad Number.");
        
    }  
    boolean isHarshadNumber(int numb){
        
        int num1=numb;
        int sum=0;
        while(num1!=0){
            int nume=num1%10;
            sum+=nume;
            num1/=10;
        }
        if(numb%sum==0){
            return true;
        }else{
            return false;
        }
    }  
}


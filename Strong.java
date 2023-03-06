import java.util.Scanner;
public class Strong {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  int firstnumber, endnumber, i;
        System.out.println("Enter the First number:");
        firstnumber=cs.nextInt();
        System.out.println("Enter the Last number:");
        endnumber=cs.nextInt();
    System.out.println("Strong numbers between "+firstnumber+" and "+endnumber+" are:");
    for(i=firstnumber;i<=endnumber;i++)
      {
       int num2=i;
       int num1=i;
       int sum=0;
       int fact=1;
      while(num1!=0)
      {   fact=1;
          int rem=num1%10;
          num1=num1/10;
          for(int j=1;j<=rem;j++){
			  
			  fact=fact*j;
		    }
           
          sum=sum+fact;
      }
      if(sum==num2)
       System.out.println(i+" ");
      }
  cs.close();
 }
}

import java.util.Scanner;
class PrimeCheck
{
         private int num;
         //Constructor 
         PrimeCheck(int num)
         {
               this.num=num;
          }
          //Function to check whether num is prime or not 
          int isprime()
          {
                int i=0,c=0;
                for(i=1;i<=num;i++)
                {
                       if(num%i==0)
                       {
                             c++;
                        }
                 }
                 if(c==2)
                        return 1;
                 else 
                        return 0;
            }
            //Function to display the result
            void display()
            {
                   if(isprime()==1)
                            System.out.println(num+" is prime number");
                    else
                            System.out.println(num+" is not a prime number");
             }
              public static void main(String args[])
              {
                    System.out.println("Please insert any number:");
                    Scanner s=new Scanner(System.in);
                    int n=s.nextInt();
                    PrimeCheck ob=new PrimeCheck(n);
                    ob.display();
               }
}

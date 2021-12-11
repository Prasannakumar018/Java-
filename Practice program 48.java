public class PerfectNUmber
{
    public static void main(String[] args)
    {
        long n,sum=0;
        BufferefReader br = new BufferedReader(new InputStreamReader)(System.in));
        System.out.println("Enter the number:");
        n=Integer.parseInt(br.readLine())

        int i = 1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
            if(sum==n)
            {
                System.out.println(n+"is perfect number");
            }
            else
            System.out.println(n+"is not perfect number");
        
        }
        try{
            FileOutputStream fout = new FileOutputStream("perfect.txt");
            fout.write(n);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

 class Prime
 {
  void printprimes(int start,int end)
 { 
  int sum=0; 

  for(int n=start;n<=end;n++)
  {
      for(int i=2;i<n;i++)
   {
    if(n/i==0)
     {
     sum=sum+1; 
      break;
     }

}

    if(sum!=0)
    {
      System.out.println(n+"System");
      }
   
 }
 
 }
 public static void main(String a[])
 {
 Prime p=new Prime();
 p.printprimes(100,200);
 }
}
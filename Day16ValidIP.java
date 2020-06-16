class Solution 
{
    public String validIPAddress(String IP)
    {     
      if(IP.indexOf(".")!=-1)
      {   
         if(IP.charAt(0)!='.'&&IP.charAt(IP.length()-1)!='.')
         {        
            int count=0;          
            String[] a = IP.split("\\.");  
            for(int i=0;i<a.length;i++)
            {
               String s=a[i];
                if(s.length()>=1)
                {
                 if(s.indexOf('-')==-1&&((s.charAt(0)!='0'&&s.length()>=1)||     (s.length()==1&&s.charAt(0)=='0')))
                  {
                    try
                    {
                       int n=Integer.parseInt(s); 
                       if(n>=0&&n<=255)
                        count++; 
                     }
                    catch(NumberFormatException n)
                    {
                        return "Neither";
                     }
                   }
                  }
              }
              if(count==4)
                return "IPv4";
              else
                return "Neither";
            }
        }
        else if(IP.indexOf(":")!=-1)
        {
            int count =0;
            if(IP.charAt(0)!=':'&&IP.charAt(IP.length()-1)!=':')
            {
                String []a=IP.split("\\:");
              if(a.length==8)
              {
                for(int i=0;i<a.length;i++)
                {
                  String s=a[i];
                  if(s.length()>=1)
                  {
                    int flag=0;
                    boolean r=true;
                    for(int j=0;j<s.length();j++)
                     {
                        int v=s.charAt(j);
                        if((v>=48&&v<=57)||(v>=65&&v<=70)||(v>=97&&v<=102))
                         flag++;
                        else
                         r=false;
                       }
                      if(flag<=4&&r== true)
                       count++;
                    }
                  }
                 }
                   if(count==8)
                    return "IPv6";
                   else
                     return "Neither";
               }
          }
       return "Neither"; 
    }
}

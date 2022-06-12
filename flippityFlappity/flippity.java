public class Solution {
    public static int[] flip(int[] x,int l, int r)
    {
       
        for(int i=l;i<r;i++)
        {
            if(x[i]==0)
            {
                x[i]=1;
            }
            else
            {
                x[i]=0;
            }
        }
        return x;
        
    }
    public static int[] add(int[] y,int p)
    {
        for(int i=0;i<y.length;i++)
        {
            y[i] = y[i] + x[i] * p;
        }
        return y;
    }
  
    
    public long[] solve(int A, int[][] B) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] x = new int[A];
        int[] y = new int[A]
        
        int l=0,r=0,p=0,j=0;
        
        for(int i=0;i<A;i++)
        {
            x[i]=0;
            y[i]=0;
        }
        
        for(int row=0;row<B.length;i++)
        {
                if(B[row][0]==1)
                {
                    l = B[row][1];
                    r = B[row][2];
                    x=flip(x,l,r);
                }
                else if(x[row][0]==2)
                {
                    p = B[row][1];
                    y = add(y,p)
                }
                else if(B[row][0]==3)
                {
                    j = B[row][1];
                    list.add(y[j]);
                }
        }
        int results[] = list.toArray();
        return results;
    }
}


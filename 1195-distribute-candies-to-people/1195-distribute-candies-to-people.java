class Solution {
    public int[] distributeCandies(int candies, int k) {
        int ary[]=new int[k];
        int val=1;
        int indexstore=0;
        int sum=0;
        int count=0;
  while(candies>0) // Travels ary Untile Your canie not finish
  {
      for(int i=0;i<k;i++)
      {
          candies-=val;
          if(candies>=0)
          {
          ary[i]+=val;
          if(candies==0) // If your candi finish stop and break loop
          {
              break;

          }
          }
          else
          {
              ary[i]+=val+candies;
              indexstore=i;
              break;
          }
          val++;
      }
      count++;
  }
  if(indexstore!=0 && indexstore!=k-1 && count==0) // when your candi finish but pepole who have not even one canie give them o candie
  {
        for (int i = indexstore; i < k; i++) {
                ary[i] = 0;
            }
  }
  return ary;
    }
}
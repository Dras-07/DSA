class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       
        List<Integer> lst=new ArrayList<>();
     for(int i:arr)
         lst.add(i);
        Collections.sort(lst,new Comparator<Integer>()
                    {
                 public int compare(Integer a, Integer b){
          
                if((Math.abs(x-a) - Math.abs(x-b)) == 0)
                    return a-b;
                else
                return (Math.abs(x-a) - Math.abs(x-b));
            }
    });
       List<Integer> lst1=new ArrayList<>();
        for(int i=0;i<k;i++)
            lst1.add(lst.get(i));
    Collections.sort(lst1);
    return lst1;
    }
}

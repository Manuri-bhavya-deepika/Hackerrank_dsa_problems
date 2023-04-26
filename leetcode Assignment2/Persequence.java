class Persequence 
{
    public String getPermutation(int n, int k) 
    {
        int fact = 1;
        List<Integer> al = new ArrayList<>();
        for(int i = 1;i < n; i++)
        {
            fact *= i;
            al.add(i);
        }
        al.add(n);
        String ans = "";
        k--;
        while(true)
        {
            ans += al.get(k / fact); 
            al.remove(k / fact); 
            if(al.size() == 0)
            break; 
            k %= fact; 
            fact /= al.size();
        }
        return ans;
    }   
}
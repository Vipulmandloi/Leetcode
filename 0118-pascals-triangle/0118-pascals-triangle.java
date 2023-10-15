class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> list1 = new LinkedList<>();
                list1.add(1);
                List<Integer> list2 = list.get(i-1);

                for (int k = 0; k < list2.size() - 1 ; k++)
                {
                    list1.add(list2.get(k) + list2.get(k+1));
                }
                list1.add(1);

            list.add(list1);
        }


        return list;
        
    }
}
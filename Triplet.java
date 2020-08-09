 ArrayList <Integer> list=new ArrayList <>();
        list.add(0);
        list.add(0);
        for (int i=0;i<a.size();i++)
        {
            if(a.get(i)==b.get(i))
            {
                continue;
            }
            else if(a.get(i)>b.get(i))
            {
                int j = list.get(0)+1;
                list.set(0,j);
            }
            else{
                 int k = list.get(1)+1;
                list.set(1,k);
            }
           
        
           
        }

        return list;

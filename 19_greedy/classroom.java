import java.util.*;

public class classroom{
    static class job{
        int deadline;
        int id;
        int profit;
        public job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main( String args[]){
        int info[][]= {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i = 0;i<info.length;i++){
            jobs.add(new job(i,info[i][0],info[i][1]));

        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0;i<jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max job = "+seq.size());
        for(int i = 0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");

        }
        System.out.println();

    }
}
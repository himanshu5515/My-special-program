import java.util.ArrayList;
import java.util.Collections;

public class Job_Sequencing_problem {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d,int p){
            id=i;
            profit=p;
            deadline=d;
        }
    }
    public static void main(String[] args) {
        int JobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        // class in Arraylist
        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0; i<JobInfo.length; i++ ){
            jobs.add(new Job(i,JobInfo[i][0], JobInfo[i][1]));

        }
        // for aending sort a-b
        Collections.sort(jobs, (obj_a, obj_b)->obj_b.profit-obj_a.profit); //descending sort

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0; i<jobs.size(); i++){
            Job curr=jobs.get(i);

            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        // print seq
        System.out.println("max job = "+ seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}

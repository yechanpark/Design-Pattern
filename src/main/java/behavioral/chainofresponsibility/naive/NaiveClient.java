package behavioral.chainofresponsibility.naive;

import java.util.ArrayList;
import java.util.List;

public class NaiveClient {
    public static void main(String args[]) {
        List<Job> jobList =  new ArrayList<Job>();
        jobList.add(new Job('A'));
        jobList.add(new Job('E'));
        jobList.add(new Job('C'));
        jobList.add(new Job('D'));
        jobList.add(new Job('B'));
        jobList.add(new Job('F'));
        jobList.add(new Job('A'));

        JobExecutor jobExecutor = new JobExecutor();
        jobExecutor.setJobList(jobList);
        jobExecutor.executeJobs();

    }
}

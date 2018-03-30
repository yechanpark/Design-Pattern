package behavioral.chainofresponsibility.naive;

import java.util.List;

public class JobExecutor {
    private List<Job> jobList;

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }

    public void executeJobs() {

        for (Job job : jobList) {
            char type = job.getType();
            if (type == 'A')
                System.out.println("Job A is executed By JobExecutor");
            else if (type == 'B')
                System.out.println("Job B is executed By JobExecutor");
            else if (type == 'C')
                System.out.println("Job C is executed By JobExecutor");
            else if (type == 'D')
                System.out.println("Job D is executed By JobExecutor");
            else
                System.out.println("JobExecutor can't execute '" + job.getType() + "' Job");

        }

    }
}

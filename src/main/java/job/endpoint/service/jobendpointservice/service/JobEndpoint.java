package job.endpoint.service.jobendpointservice.service;

import job.endpoint.service.jobendpointservice.model.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/randomWaitEndpoint")
public class JobEndpoint {

    @GetMapping()
    public Job generate(@RequestParam("id") String id) throws InterruptedException {

        Random random = new Random();
        Integer sleepTime = random.nextInt(6);
        Thread.sleep(sleepTime*1000);
        String uuid= UUID.randomUUID().toString();
        Job job = new Job(uuid);
        System.out.println("sleep time  " + sleepTime + " " + " id= " + id + " " + uuid);
        return job;
    }

}
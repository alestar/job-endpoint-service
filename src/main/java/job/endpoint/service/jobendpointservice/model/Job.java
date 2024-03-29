package job.endpoint.service.jobendpointservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.xml.ws.developer.Serialization;

@Serialization
public class Job {

    private String id;

    public Job(@JsonProperty("jobId") String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id ;
    }
}

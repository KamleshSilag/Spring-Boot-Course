package org.example.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("Spring","Spring Framework","Spring Framework Description"),
                new Topic("Vertx","Vertx Framework","Spring Framework Description"),
                new Topic("Couchbase","Couchbase DB","Couchbase DB Description"),
                new Topic("Kafka","Kafka Stream","Kafka Stream Description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}

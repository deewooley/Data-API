package com.dew98.demotopicsapideeOne;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "SpringFrameWork Description" ),
            new Topic("java","Core Java", " Core Java Description"),
            new Topic("JavaScript","JS101", " JavaScript Description")
    ));

    public List <Topic>getAllTopics(){
        return topics;
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }


    public void deleteTopic(String id){
        for(int x = 0; x < topics.size(); x++){
            Topic t = topics.get(x);
            if(t.getId().equals(id)){
                topics.remove(x);
            }
        }
    }
}

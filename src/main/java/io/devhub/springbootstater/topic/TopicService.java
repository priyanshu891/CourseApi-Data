package io.devhub.springbootstater.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
/*-----------------Get All Topics--------------------*/

public List<Topic> getAllTopics() {
	//return topics;
	List<Topic> topics = new ArrayList<>();
	topicRepository.findAll().forEach(topics::add);
	return topics;
}

/*-----------------Get a Topic----------------------*/

public Topic getTopic(String id)
{
//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();	
	return topicRepository.findById(id).orElse(null);	
}

/*-----------------Adding Topic--------------------*/

public void addTopic(Topic topic) {
	topicRepository.save(topic);	
}

/*-----------------Updating Topic--------------------*/

public void updateTopic(String id, Topic topic) {
/*	for(int i=0;i < topics.size();i++) {
		Topic t = topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
			return;
		}
	}*/
	topicRepository.save(topic);	
}

/*-----------------Deleting Topic--------------------*/

public void deleteTopic(String id) {
//topics.removeIf(t -> t.getId().equals(id));
	topicRepository.deleteById(id);
}

}

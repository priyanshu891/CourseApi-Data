package io.devhub.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
/*-----------------Get All Topics--------------------*/

public List<Course> getAllCourses(String topicId) {
	List<Course> courses = new ArrayList<>();
	courseRepository.findByTopicId(topicId).forEach(courses::add);
	return courses;
}

/*-----------------Get a Topic----------------------*/

public Course getCourse(String id)
{
	return courseRepository.findById(id).orElse(null);	
}

/*-----------------Adding Topic--------------------*/

public void addCourse(Course course) {
	courseRepository.save(course);	
}

/*-----------------Updating Topic--------------------*/

public void updateCourse(Course course) {

	courseRepository.save(course);	
}

/*-----------------Deleting Topic--------------------*/

public void deleteCourse(String id) {
	courseRepository.deleteById(id);
}

}

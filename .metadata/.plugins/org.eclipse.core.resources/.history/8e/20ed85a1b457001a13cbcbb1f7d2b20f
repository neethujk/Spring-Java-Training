package com.courses.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.model.Course;
import com.courses.repository.CourseRepository;

@RestController
@RequestMapping("/open-api")
public class OpenApiController {
	@Autowired
	  CourseRepository crepo;
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
       return (List<Course>)crepo.findAll();
	}
	

	@RequestMapping(
			  value = "/images/{filename}",
			  produces = MediaType.IMAGE_JPEG_VALUE
			)
			public @ResponseBody byte[] getImageWithMediaType(@PathVariable String filename) throws IOException {
		     File f=new File("D:\\projectimages\\"+filename);
			    FileInputStream in = new FileInputStream(f);
			    return IOUtils.toByteArray(in);
			}
	

	@RequestMapping(
			  value = "/userimages/{filename}",
			  produces = MediaType.IMAGE_JPEG_VALUE
			)
			public @ResponseBody byte[] getUserImageWithMediaType(@PathVariable String filename) throws IOException {
		     File f=new File("D:\\projectimages\\users\\"+filename);
			    FileInputStream in = new FileInputStream(f);
			    return IOUtils.toByteArray(in);
			}

}

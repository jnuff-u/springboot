package test.com.exa.springboot.web; 

import com.exa.springboot.mapper.StudentMapper;
import com.exa.springboot.pojo.Student;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;

import java.util.ArrayList;
import java.util.List;

/** 
* StudentController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 10, 2018</pre> 
* @version 1.0 
*/

@RunWith(JUnit4.class)
@SpringBootConfiguration
public class StudentControllerTest {
    @Autowired
    StudentMapper studentMapper;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: fintStudent(Model model) 
* 
*/ 
@Test
public void testFintStudent() throws Exception { 
//TODO: Test goes here...

    List<Student> students = new ArrayList<>();
    students = studentMapper.findByName("华");
    System.out.println(students.size());

} 


} 

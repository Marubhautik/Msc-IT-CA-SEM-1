
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    public static void main(String[] args) {  
     ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
      
    NewClass student=(NewClass)context.getBean("studentbean");  
    student.display();  
}  
     
    
    
}


import org.springframework.jdbc.core.JdbcTemplate;


public class studentDao {
    private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(student e){  
    String query="insert into student values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateEmployee(student e){  
    String query="update student set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(student e){  
    String query="delete from student where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
  
}

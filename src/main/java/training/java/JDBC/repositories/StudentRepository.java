package training.java.JDBC.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import training.java.JDBC.models.Student;
import training.java.JDBC.services.StudentService;

import java.util.List;


@Repository
public class StudentRepository {


    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
    private JdbcTemplate jdbcTemplate;

    public void save(Student student) {
        String sql = "insert into student(rownumber, name, age) values (?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(sql, student.getRowNumber(), student.getName(), student.getAge());
        logger.info("{} rows affected", rowsAffected);
    }

    public List<Student> findAll() {
        String sql="select * from student"; RowMapper<Student> mapper=(rs, rowNum) ->
        {
            Student s=new Student();
            s.setRowNumber(rs.getInt("rownumber"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));
            return s;

        };

        return jdbcTemplate.query(sql, mapper);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbc) {
        this.jdbcTemplate = jdbc;
    }

    public void delete(Student s) {
        String sql = "delete from student where rownumber=?";
        int rowsAffected = jdbcTemplate.update(sql, s.getRowNumber());
        logger.info("{} rows deleted", rowsAffected);
    }
}
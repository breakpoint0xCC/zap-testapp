package breakpoint.apiscan.example;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/example")
public class ExampleController {

    private final JdbcTemplate jdbcTemplate;

    public ExampleController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public List<Example> getAllExamples(@RequestParam(value = "title", required = false) String title) {
        if (title == null) {
            return this.jdbcTemplate.query("""
                SELECT id, title, description FROM examples
                """,
                    (rs, rowNum)
                            -> new Example(
                            rs.getLong(1),
                            rs.getString(2),
                            rs.getString(3)
                    )
            );
        } else {
            return this.jdbcTemplate.query(
                    "SELECT id, title, description FROM examples WHERE title LIKE '%" + title + "%'",
                    (rs, rowNum)
                            -> new Example(
                            rs.getLong(1),
                            rs.getString(2),
                            rs.getString(3)
                    )
            );
        }
    }



}

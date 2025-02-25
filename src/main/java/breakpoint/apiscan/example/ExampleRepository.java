package breakpoint.apiscan.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;

public class ExampleRepository implements CrudRepository<Example, Long> {

    private JdbcTemplate jdbcTemplate;

    public ExampleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public <S extends Example> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Example> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Example> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Example> findAll() {
        return null;
    }

    @Override
    public Iterable<Example> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Example entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Example> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

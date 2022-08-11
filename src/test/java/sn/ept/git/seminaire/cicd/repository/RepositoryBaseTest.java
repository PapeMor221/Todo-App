package sn.ept.git.seminaire.cicd.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import sn.ept.git.seminaire.cicd.TodoApplication;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(classes = {TodoApplication.class})
@Transactional
class RepositoryBaseTest {


    @Test
    void contextLoads()
    {
        assertThat(Boolean.TRUE).isTrue();
    }
}
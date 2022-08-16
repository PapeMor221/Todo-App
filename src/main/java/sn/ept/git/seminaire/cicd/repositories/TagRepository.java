package sn.ept.git.seminaire.cicd.repositories;

import sn.ept.git.seminaire.cicd.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TagRepository extends JpaRepository<Tag, UUID> {

    @Query("select t from Tag  t where t.name=:name")
    Optional<Tag> findByName(@Param("name") String name);

    @Query("select t from Tag  t where t.name=:name and t.id<>:id")
    Optional<Tag> findByNameWithIdNotEquals(@Param("name") String name, @Param("id")  UUID id);
}
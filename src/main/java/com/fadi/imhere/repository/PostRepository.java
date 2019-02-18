package com.fadi.imhere.repository;

import com.fadi.imhere.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

   /*
    extends JpaRepository<Post, String>

    List findById(String id);

    List<Void> deleteById(String id);*/
}

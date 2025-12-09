package com.gk_bk.mapper;

import com.gk_bk.domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    int insert(Post post);
    int update(Post post);
    int delete(@Param("id") Long id, @Param("authorId") Long authorId);
    Optional<Post> findById(@Param("id") Long id);
    List<Post> findPage(@Param("offset") int offset, @Param("limit") int limit);
    long count();
}



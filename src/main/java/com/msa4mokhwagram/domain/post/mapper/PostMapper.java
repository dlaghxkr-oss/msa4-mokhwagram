package com.msa4mokhwagram.domain.post.mapper;

import com.msa4mokhwagram.domain.post.entities.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> getPagination(int limit, int offset);
    long getTotal();
}

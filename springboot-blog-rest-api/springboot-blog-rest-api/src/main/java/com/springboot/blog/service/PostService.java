package com.springboot.blog.service;

import com.springboot.blog.Dto.PostDto;
import com.springboot.blog.Dto.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById (Long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostbById(long id);
}

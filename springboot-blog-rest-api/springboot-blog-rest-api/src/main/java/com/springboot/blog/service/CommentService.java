package com.springboot.blog.service;

import com.springboot.blog.Dto.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
}

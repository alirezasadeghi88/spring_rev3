package com.learn.ch4.repository;

import com.learn.ch4.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

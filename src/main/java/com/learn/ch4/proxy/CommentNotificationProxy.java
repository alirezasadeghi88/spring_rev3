package com.learn.ch4.proxy;

import com.learn.ch4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

package com.learn.ch4.proxy;

import com.learn.ch4.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " +
                comment.getText());
    }
}

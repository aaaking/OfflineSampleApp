package com.example.offline.comments;

import com.example.offline.model.Comment;

import io.reactivex.Completable;

class AddCommentUseCase {
    private final CommentsRepository commentsRepository;

    AddCommentUseCase(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    Completable addComment(Comment comment) {
        return commentsRepository.addComment(comment);
    }
}
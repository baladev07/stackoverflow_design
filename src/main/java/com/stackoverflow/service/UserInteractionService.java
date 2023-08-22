package com.stackoverflow.service;

public interface UserInteractionService {

    public void upVote(Long entityId,boolean isLiked);

    public void flag(Long entityId,boolean isFlagged);
}

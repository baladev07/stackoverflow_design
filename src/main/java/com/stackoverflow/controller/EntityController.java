package com.stackoverflow.controller;


import com.stackoverflow.account_enums.EntityType;
import com.stackoverflow.dto.QuestionRequest;
import com.stackoverflow.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EntityController {

    @Autowired
    MemberService memberService;


    @PostMapping("/question")
    public ResponseEntity createQuestion(@RequestBody QuestionRequest questionRequest)
    {
        memberService.createQuestion(questionRequest.getDescription(), questionRequest.getTitle(), questionRequest.getUserName());
        return ResponseEntity.ok("Success");
    }

    @PostMapping("/answer")
    public ResponseEntity createAnswer(@RequestParam Long questionId)
    {
        memberService.addAnswer(questionId);
        return ResponseEntity.ok("Success");
    }


    @PostMapping("/comment")
    public ResponseEntity addComment(@RequestParam EntityType entityType,@RequestParam Long entityId,@RequestParam String comment)
    {
        memberService.addComment(entityType,entityId,comment);
        return ResponseEntity.ok("Comment added successfully.");
    }

    @PutMapping("/upvote/{entityType}/{entityId}")
    public ResponseEntity upVote(@RequestParam boolean upVote,@PathVariable EntityType entityType,@PathVariable Long entityId)
    {

        memberService.upVote(entityType,entityId,upVote);
        return ResponseEntity.ok("Success.");
    }


    @PutMapping("/flag/{entityType}/{entityId}")
    public ResponseEntity flagEntity(@RequestParam boolean flag,@PathVariable EntityType entityType,@PathVariable Long entityId)
    {

        memberService.flag(entityType,entityId,flag);
        return ResponseEntity.ok("Success.");
    }


}

package com.issuetracker.controller;

import com.issuetracker.model.Issue;
import com.issuetracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    // CREATE
    @PostMapping
    public ResponseEntity<Issue> createIssue(@RequestBody Issue issue) {
        return ResponseEntity.ok(issueService.createIssue(issue));
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<Issue>> getAllIssues() {
        return ResponseEntity.ok(issueService.getAllIssues());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Issue> getIssueById(@PathVariable Long id) {
        return ResponseEntity.ok(issueService.getIssueById(id).orElseThrow());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Issue> updateIssue(@PathVariable Long id, @RequestBody Issue issue) {
        return ResponseEntity.ok(issueService.updateIssue(id, issue));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteIssue(@PathVariable Long id) {
        issueService.deleteIssue(id);
        return ResponseEntity.ok("Issue deleted successfully");
    }

    // GET BY STATUS
    @GetMapping("/status/{status}")
    public ResponseEntity<List<Issue>> getByStatus(@PathVariable String status) {
        return ResponseEntity.ok(issueService.getByStatus(status));
    }
}
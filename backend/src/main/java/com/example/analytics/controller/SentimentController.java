package main.java.com.example.analytics.controller;

import com.example.analytics.model.Sentiment;
import com.example.analytics.service.SentimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sentiments")
public class SentimentController {

    @Autowired
    private SentimentService sentimentService;

    @GetMapping
    public List<Sentiment> getAllSentiments() {
        return sentimentService.getAllSentiments();
    }

    @GetMapping("/{id}")
    public Sentiment getSentimentById(@PathVariable String id) {
        return sentimentService.getSentimentById(id);
    }

    @PostMapping
    public Sentiment createSentiment(@RequestBody Sentiment sentiment) {
        return sentimentService.createSentiment(sentiment);
    }

    @PutMapping("/{id}")
    public Sentiment updateSentiment(@PathVariable String id, @RequestBody Sentiment sentiment) {
        return sentimentService.updateSentiment(id, sentiment);
    }

    @DeleteMapping("/{id}")
    public void deleteSentiment(@PathVariable String id) {
        sentimentService.deleteSentiment(id);
    }
}

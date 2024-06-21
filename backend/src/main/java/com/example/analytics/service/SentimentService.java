package main.java.com.example.analytics.service;

import com.example.analytics.model.Sentiment;
import com.example.analytics.repository.SentimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentimentService {

    @Autowired
    private SentimentRepository sentimentRepository;

    public List<Sentiment> getAllSentiments() {
        return sentimentRepository.findAll();
    }

    public Sentiment getSentimentById(String id) {
        return sentimentRepository.findById(id).orElse(null);
    }

    public Sentiment createSentiment(Sentiment sentiment) {
        return sentimentRepository.save(sentiment);
    }

    public Sentiment updateSentiment(String id, Sentiment sentiment) {
        sentiment.setId(id);
        return sentimentRepository.save(sentiment);
    }

    public void deleteSentiment(String id) {
        sentimentRepository.deleteById(id);
    }
}

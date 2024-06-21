package main.java.com.example.analytics.repository;

import com.example.analytics.model.Sentiment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentimentRepository extends MongoRepository<Sentiment, String> {
    
    Sentiment findSentimentByText(String text);

}
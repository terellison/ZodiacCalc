package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class HelpIntentHandler implements RequestHandler {

    
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("AMAZON.HelpIntent"));
    }


    public Optional<Response> handle(HandlerInput input) {
        String speechText = "You can ask me to determine your zodiac sign!";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("ZodiacCalc", speechText)
                .withReprompt(speechText)
                .build();
    }
}
package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final ObjectProvider<MyLogger> objectProvider;

    public void logic(String testId) {
        final MyLogger myLogger = objectProvider.getObject();
        myLogger.log("service testId = " + testId);
    }
}

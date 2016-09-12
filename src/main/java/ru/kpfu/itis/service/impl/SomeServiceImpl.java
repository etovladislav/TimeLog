package ru.kpfu.itis.service.impl;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.annotation.TimeLog;
import ru.kpfu.itis.service.SomeService;

@Service
public class SomeServiceImpl implements SomeService {

    @Override
    @TimeLog
    public void someMethod() {
        int i = 0;
        while (i != 10000000) {
            i++;
        }
    }
}

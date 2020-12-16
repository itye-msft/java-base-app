package com.microsoft.baseapp;

import com.microsoft.baseapp.config.IConfigService;
import org.springframework.stereotype.Component;

@Component
public class MockConfigureService  {
    public String getSecret() {
        return "123";
    }
}

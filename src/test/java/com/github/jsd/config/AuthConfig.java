package com.github.jsd.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    @Key("username.selenoid")
    String remoteUsername();

    @Key("password.selenoid")
    String remotePassword();
}

package com.github.jsd;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import com.github.jsd.config.WebDriverProvider;
import com.github.jsd.pages.RegistrationPage;
import com.github.jsd.utils.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBaseExtended {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void setup() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}

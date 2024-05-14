package org.vnsemkin.semkintelegrambot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.vnsemkin.semkintelegrambot.component.TelegramBot;
import org.vnsemkin.semkintelegrambot.constant.BotConstant;

@Getter
@Configuration
@PropertySource(BotConstant.PROPERTY_SOURCE)
@ComponentScan(basePackages = "org.vnsemkin.semkintelegrambot")
public class BotConfig {
    @Value("${telegram.gpb-bot.name}")
    private String botName;
    @Value("${telegram.gpb-bot.token}")
    private String token;

    @Bean
    public TelegramBot telegramBot(BotConfig botConfig) throws TelegramApiException {
        TelegramBot bot = new TelegramBot(botConfig);
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
        return bot;
    }
}
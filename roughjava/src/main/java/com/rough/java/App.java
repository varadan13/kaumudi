package com.rough.java;

import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.dto.tweet.Tweet;
import io.github.redouane59.twitter.signature.TwitterCredentials;

public class App {
    public static void main(String[] args) {
        TwitterClient client = new TwitterClient(TwitterCredentials.builder()
                .accessToken("<access_token>")
                .accessTokenSecret("<secret_token>")
                .apiKey("<api_key>")
                .apiSecretKey("<secret_key>")
                .build());

        Tweet tweet = client.getTweet("1224041905333379073");
        System.out.println(tweet.getText());
        System.out.println(tweet.getCreatedAt());
        System.out.println(tweet.getLang());
        System.out.println(tweet.getLikeCount());
        System.out.println(tweet.getRetweetCount());
        System.out.println(tweet.getReplyCount());
        System.out.println(tweet.getUser().getName());
        System.out.println("Hello World!");
    }
}

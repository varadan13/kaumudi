import { TwitterApi } from "twitter-api-v2";

const twitterClient = new TwitterApi();

const readOnlyClient = twitterClient.readOnly;

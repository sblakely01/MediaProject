//package com.project.music;
//
//import java.util.HashMap;
////import org.json.JSONObject;
////import com.listennotes.podcast_api.Client;
////import com.listennotes.podcast_api.ApiResponse;
////import com.listennotes.podcast_api.exception.ListenApiException;
//
//public class PodcastApi {
//    public static void main(String[] args) {
//        try {
//          // If apiKey is null or "", then we'll use mock api for test data
//          String apiKey = System.getenv("LISTEN_API_KEY");
// //         Client objClient = new Client(apiKey);
//
//          // Set timeout for 15 seconds
////          objClient.setResponseTimeoutMs(15000);
//
//          // Customize your user agent
////          objClient.setUserAgent("My Great Podcast App");
//
//          // All parameters can be found at
//          //    https://www.listennotes.com/api/docs/
//          HashMap<String, String> parameters = new HashMap<>();
//          parameters.put("q", "startup");
//          parameters.put("type", "podcast");
//
// //         ApiResponse response = objClient.search(parameters);
//
//          // For successful response, you get an org.json.JSONObject
//          System.out.println(response.toJSON().toString(2));
//
//          // Some handy methods to get your account stats
//          System.out.println("\n=== Some Account Information ===\n");
//          System.out.println("Free Quota this month: " + response.getFreeQuota() + " requests");
//          System.out.println("Usage this month: " + response.getUsage() + " requests");
//          System.out.println("Next billing date: " + response.getNextBillingDate());
//        } catch (ListenApiException e) {
//          e.printStackTrace();
//        }
//    }
//}
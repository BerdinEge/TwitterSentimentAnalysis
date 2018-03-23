/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;
import java.io.IOException;
import java.util.ArrayList;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author turker
 */
public class Tweet_Cekme {
   public static ArrayList Tweet_Bul(String hashtag) throws IOException{
        ArrayList partslar = new ArrayList<>();
        ConfigurationBuilder cf=new ConfigurationBuilder();
            cf.setDebugEnabled(true).setOAuthConsumerKey("MBQhdwkWW2Mz6bDGhz8R0spwm")
            .setOAuthConsumerSecret("cuyQcj4FG0zJZ1NF3euMUqkv7w9Jyqm4q4AS54Lex0mbRtnAPx")
            .setOAuthAccessToken("926886279140270080-j4PL2mB1W7i6usQgO0xiGrHl1lunGz3")
            .setOAuthAccessTokenSecret("8NRszoxt4G3SSJTOFBGSQR4t4biZzV0IGaiP4a3EyvUNh");
            TwitterFactory tf = new TwitterFactory(cf.build());
            Twitter twitter = tf.getInstance();
            try {
                Query query = new Query(hashtag);
                query.lang("en");
                QueryResult result;
                result = twitter.search(query);
                java.util.List<Status> tweets = result.getTweets();                    
                        
                for (Status tweet : tweets) { 
                                    String cumle = tweet.getText();
                                    String[] parts = cumle.split(" ");
                                    partslar.add(parts);
 
            }
               
                 return partslar;
                
                
        } catch (TwitterException te) {
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
     
        return partslar;
    
}}

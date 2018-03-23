/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.io.IOException;

/**
 *
 * @author turker
 */
public  class Tweet implements Comparable<Tweet> {
    
    private final StrategyPolarityCalculation  yöntem;
    
    
    private String hashtag;    
    private double kutupDegeri;    
    
    public Tweet( final StrategyPolarityCalculation yöntem,String hashtag) throws IOException {
     
     this.yöntem = yöntem;
     this.kutupDegeri =yöntem.PolarityCalculation(hashtag);
     this.hashtag=hashtag;
    
    }
   
    public String getHashtag() {
        return hashtag;
    }

    public double getKutupDegeri() {
        return kutupDegeri;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setKutupDegeri(float kutupDegeri) {
        this.kutupDegeri = kutupDegeri;
    }
   
    public String ToString(){return "Hashtag :"+getHashtag()+"Polarity :"+getKutupDegeri();}
    
    public int compareTo(Tweet tw){
        if(tw instanceof Tweet){
            Tweet t=(Tweet)tw;
            if(this.kutupDegeri>t.getKutupDegeri())
                return 1;
            else if(this.kutupDegeri<t.getKutupDegeri())
                return -1;
        }
        return 0;
    }

   
}

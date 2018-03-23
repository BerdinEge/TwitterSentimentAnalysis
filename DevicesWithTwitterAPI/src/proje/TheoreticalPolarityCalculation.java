/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cagin
 */
public class TheoreticalPolarityCalculation implements StrategyPolarityCalculation{

     @Override
     public  double PolarityCalculation(String hashtag) {
        ArrayList  partslar ;

        HashTableMap yeni;
        
          
        
        double polarity = 0.0;
               
        String temp_tweet = "";
         try {
             partslar = Tweet_Cekme.Tweet_Bul(hashtag);
          yeni = HashTableMap.singleton();
        Iterator k = partslar.iterator();
        while(k.hasNext()){
            String[] tweet = (String[]) k.next();
            
           
            for(int j = 0 ; j< tweet.length-1;++j)
                {   
         
                    if(!tweet[j].equals(" "))
                    {
                        temp_tweet+=tweet[j];
                        polarity+=yeni.getValue(temp_tweet);
                            for(int i = j+1 ;i<tweet.length;i++)
                         
                            {
                                if(!tweet[i].equals(" "))
                                 {
                                    temp_tweet+=" "+tweet[i];
                                    polarity+=yeni.getValue(temp_tweet);
                                 }
                            }
                    }
                     
                        temp_tweet="";    
                }
           
        }
                
    
      return (polarity/partslar.size());
   

      } catch (IOException ex) {
             Logger.getLogger(TheoreticalPolarityCalculation.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0.0;
}}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proje.HashTableMap;

/**
 *
 * @author cagin
 */
public class Test_Senticnet {
    
    @Test
    public void Test_Senticnet() throws IOException {
       HashTableMap yeni = new HashTableMap();
       assertEquals(-0.56, yeni.getValue("ambidextrous"),0.0);
       assertEquals(0.761, yeni.getValue("ambient illumination"),0.0);
       assertEquals(0.599, yeni.getValue("ambient noise"),0.0);
       assertEquals(-0.64, yeni.getValue("ba lot of out"),0.0);
       assertEquals(0.837, yeni.getValue("byzantine rite"),0.0);
       assertEquals(-0.78, yeni.getValue("c clamp"),0.0);
       assertEquals(0.62,  yeni.getValue("zymosis"),0.0);
       assertEquals(-0.74, yeni.getValue("yup"),0.0);
       assertEquals(0.763, yeni.getValue("z skayr"),0.0);
       assertEquals(-0.08, yeni.getValue("x-ray"),0.0);
       assertEquals(0.036, yeni.getValue("xerosis"),0.0);
       assertEquals(0.413, yeni.getValue("wyeth"),0.0);
       assertEquals(0.413, yeni.getValue("wyeth trade"),0.0);
       assertEquals(-0.74, yeni.getValue("vulvovaginitis"),0.0);
       assertEquals(-0.81, yeni.getValue("wackett"),0.0);
       assertEquals(0.033, yeni.getValue("wadded up"),0.0);
    }
    
    
}

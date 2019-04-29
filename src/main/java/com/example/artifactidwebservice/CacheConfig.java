package com.example.artifactidwebservice;

import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.xml.XmlConfiguration;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class CacheConfig {

    // This should go in a method of some kind for xml config for Ehcache
//    private String xmlFile = "ehcache.xml";
//    URL myUrl = getClass().getResource(xmlFile);
//    XmlConfiguration xmlConfig = new XmlConfiguration(myUrl);
//    CacheManager myCacheManager = CacheManagerBuilder
//            .newCacheManager(xmlConfig);
}

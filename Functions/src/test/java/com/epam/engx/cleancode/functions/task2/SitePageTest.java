package com.epam.engx.cleancode.functions.task2;

import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class SitePageTest {

    @Test
    public void shouldGenerateUrlWithEmptyParams() {
        assertEquals("http://mysite.com/?edit=true&siteGrp=default&userGrp=admin",
                new SitePage("default", "admin").getEditablePageUrl(new LinkedHashMap<String, String>()));
    }

    @Test
    public void shouldGenerateUrlWithSeveralParams() {
        assertEquals("http://mysite.com/?edit=true&id=1234&user=Alex&redirect=true&siteGrp=mySite&userGrp=std",
                new SitePage("mySite", "std").getEditablePageUrl(new LinkedHashMap<String, String>() {{
                    put("id", "1234");
                    put("user", "Alex");
                    put("redirect", "true");
                }}));
    }
}

package com.stackoverflow.config;

public class SecurityValidator {

    protected static final String[] publicURI= new String[]{
            "/signup",
            "/questions"

    };


    public static boolean isPublicURI(String requestURI)
    {
        for(String publicURI :publicURI)
        {
            if(publicURI.equals(requestURI))
            {
                return true;
            }
        }

        return false;
    }
}

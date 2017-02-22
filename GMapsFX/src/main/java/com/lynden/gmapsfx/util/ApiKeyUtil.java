package com.lynden.gmapsfx.util;

import com.lynden.gmapsfx.ClusteredMainApp;

import java.io.InputStream;
import java.util.Scanner;

public class ApiKeyUtil {
    private ApiKeyUtil(){}

    /**
     * Convenience method that reads the API-key from the file "google-api.key"
     */
    public static String getApiKey() {

        final InputStream apiKeyResource = ClusteredMainApp.class.getResourceAsStream("/google-api.key");
        if (apiKeyResource != null)
            return new Scanner(apiKeyResource).nextLine();
        else
            return null;
    }
}

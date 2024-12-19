package com.companyname.config;

public class ApplicationConfig {

   // Application name constant
   public static final String APP_NAME = "TDD Framework";

   // Application version constant
   public static final String APP_VERSION = "1.0.0";

   // Retrieves the environment property from system, defaulting to "dev" if not set
   public static final String ENV = System.getProperty("env", "dev");

   // Determines the base URL depending on the environment (prod or dev)
   // If the environment is "prod", the production API URL is used
   // Otherwise, the development API URL is used
   public static final String BASE_URL = ENV.equals("prod")
           ? "https://api.production.com"
           : "https://api.development.com";

   // Enables debug logging only in the "dev" environment
   public static final boolean ENABLE_DEBUG_LOGGING = ENV.equals("dev");

}

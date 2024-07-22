public final class Config {
    private static final Dotenv dotenv = 
        Dotenv.configure().load();

    /* Web Server */
    public static final int PORT          = dotenv.get("PORT"); 
    public static final int MAX_THREADS   = dotenv.get("MAX_THREADS");
    public static final int MIN_THREADS   = dotenv.get("MIN_THREADS");
    public static final int IDLE_TIMEOUT  = dotenv.get("IDLE_TIMEOUT");

    public static Dotenv get_dotenv() { return dotenv; }
}

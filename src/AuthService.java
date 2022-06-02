public interface AuthService {
    void start();

    void stop();

    String getNickByLoginPass(String part, String part1);
}
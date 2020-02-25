package in.conceptarchitect.authentication;

public interface Authenticator {

	void authenticate(String username, String password);

	boolean isAuthenticated();

}
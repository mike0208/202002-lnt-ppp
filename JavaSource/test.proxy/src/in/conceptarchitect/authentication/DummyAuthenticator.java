package in.conceptarchitect.authentication;

public class DummyAuthenticator implements Authenticator  {
	
	boolean success=false;
	
	/* (non-Javadoc)
	 * @see in.conceptarchitect.authentication.Authenticator#authenticate(java.lang.String, java.lang.String)
	 */
	@Override
	public void authenticate(String username,String password){
		success= username!=password && username.equalsIgnoreCase(password);
	}
	
	/* (non-Javadoc)
	 * @see in.conceptarchitect.authentication.Authenticator#isAuthenticated()
	 */
	@Override
	public boolean isAuthenticated(){
		return success;
	}
}

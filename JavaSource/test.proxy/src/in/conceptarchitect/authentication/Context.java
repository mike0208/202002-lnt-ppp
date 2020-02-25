package in.conceptarchitect.authentication;

public class Context implements Authenticator{

	Authenticator current;
	
	public static final Context instance=new Context();
	
	
	public Authenticator getCurrent() {
		return current;
	}



	public void setCurrent(Authenticator current) {
		this.current = current;
	}



	public Context(){
		this.current=new DummyAuthenticator();
	}



	@Override
	public void authenticate(String username, String password) {
		// TODO Auto-generated method stub
		current.authenticate(username, password);
	}



	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return current.isAuthenticated();
	}
	
	
	
}

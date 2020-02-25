package test.callback;

public class FastPrimeFinder implements PrimeFinder{

	public boolean isPrime(int n) {
		// TODO Auto-generated method stub
		n=Math.abs(n);
		
		if(n<2) return false;
		
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		
		return true;
	}

}

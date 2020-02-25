package test.callback;

public class BetterPrimeCounter {

	public int countPrimes(int min,int max,SimplePrimeFinder finder){
		
		int c=0;
		
		for(int i=min;i<max;i++){
			if(finder.isPrime(i)){
				c++;
			}
		}
		
		return c;
		
	}
}

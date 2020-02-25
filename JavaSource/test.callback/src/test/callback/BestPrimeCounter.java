package test.callback;

public class BestPrimeCounter {

	public int countPrimes(int min,int max,PrimeFinder finder){
		
		int c=0;
		
		for(int i=min;i<max;i++){
			if(finder.isPrime(i)){
				c++;
			}
		}
		
		return c;
		
	}
}

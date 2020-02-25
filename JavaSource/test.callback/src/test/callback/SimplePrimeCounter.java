package test.callback;

public class SimplePrimeCounter {

	public int countPrimes(int min,int max){
		
		int c=0;
		SimplePrimeFinder finder=new SimplePrimeFinder();
		
		for(int i=min;i<max;i++){
			if(finder.isPrime(i)){
				c++;
			}
		}
		
		return c;
		
	}
}

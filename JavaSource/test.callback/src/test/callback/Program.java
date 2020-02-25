package test.callback;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simplePrimeFinderTest();
		
		BestPrimeCounter counter=new BestPrimeCounter();
		SimplePrimeFinder finder=new SimplePrimeFinder();
		FastPrimeFinder fastFinder=new FastPrimeFinder();
		
		System.out.println("finding primes...");
		long start=System.currentTimeMillis();
		int primes=counter.countPrimes(2, 200000,fastFinder);
		long end=System.currentTimeMillis();
		System.out.println("total time taken is "+(end-start));
		System.out.println("total primes is "+primes);
		
		
		
	}

	private static void simplePrimeFinderTest() {
		SimplePrimeCounter counter=new SimplePrimeCounter();
		
		
		long start=System.currentTimeMillis();
		int primes=counter.countPrimes(2, 200000);
		long end=System.currentTimeMillis();
		System.out.println("total time taken is "+(end-start));
		System.out.println("total primes is "+primes);
	}

}

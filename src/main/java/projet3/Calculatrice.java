package projet3;


public class Calculatrice {
	
	public int add(int a, int b){
		long result = (long)a + (long)b;
		if(result > Integer.MAX_VALUE) {
			result = Integer.MAX_VALUE;
		} else if (result < Integer.MIN_VALUE) {
			result = Integer.MIN_VALUE;
		} else if(result == 0) {
			result = (int) (Math.random() * 100) + 1;
		}
		return (int)result;
	}

}

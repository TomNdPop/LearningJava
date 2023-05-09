class quadrant{
	static int quadrantTeller(double x, double y){
		if(x > 0 && y > 0){
			return 1;
		}else if(x<0 && y>0){
			return 2;
		}else if(x<0 && y<0){
			return 3;
		}else if(x>0 && y<0){
			return 4;
		}else{
			return 0;
		}
	}

	public static void main(String[] args) {
		int quadrant = quadrantTeller(12.4, -5);
		System.out.println(quadrant);
	}
}
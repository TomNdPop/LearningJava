class numberTotal{
	public static void main(String[] args) {
		int total = 25;
		int result = (total/2);
		System.out.println(result);
		for (int number = 1; number <= (total/2); number++){
			total = total-number;
			System.out.println(total + " " + number);
		}
	}
}


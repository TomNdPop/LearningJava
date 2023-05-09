class printIndexed{
	static void printIndexed(String first){
		String entireRevString = "";
		for (int i = 0; i <= first.length()-1; i++){
			char c = first.charAt(i);
			int number = first.length()-i-1;
			String foundIndex = Integer.toString(number);
			String chInd = c + foundIndex;
			entireRevString+=chInd;
		}
		System.out.println(entireRevString);
	}

	public static void main(String[] args) {
		printIndexed("ZELDA");
	}
}
class stutter{
	static String stutter(String toRepeat){
		String stuttered = "";
		for(int i = 0; i <= toRepeat.length()-1; i++){
			char rep = toRepeat.charAt(i);
			String repeat = String.valueOf(rep);
			String repeated = repeatString(repeat, 2);
			stuttered += repeated;
		}
		return stuttered;
	}

	static String repeatString(String str, int n){
		String repeated = "";
		for(int i = 0; i < n; i++){
			repeated += str;
		}
		return repeated;
	}

	public static void main(String[] args) {
		String example = stutter("Hello");
		System.out.println(example);
	}
}
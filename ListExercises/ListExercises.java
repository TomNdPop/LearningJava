import java.util.List;
import java.util.ArrayList;

class ListExercises{
	public static int sum(List<Integer> L){
		int total = 0;
		for(Integer elem : L){
			total += elem;
		}
		return total;
	}
	public static List<Integer> evens(List<Integer> L){
		List<Integer> evenCommon = new ArrayList<Integer>();
		for(Integer elem : L){
			if(elem%2 ==0){
				evenCommon.add(elem);
			}
			else
				continue;
		}
		return evenCommon;
	}

	public static List<Integer> common(List<Integer> L1, List<Integer> L2){
		List<Integer> common = new ArrayList<Integer>();
		for(Integer elem1 : L1){
			for(Integer elem2 : L2){
				if(elem1 == elem2){
					common.add(elem1);
				}
			}
		}
		return common;
	}

	public static int countOccurencesOfC(List<String> words, char c){
		int count = 0;

		for(String elem : words){
			for(char ch : elem.toCharArray()){
				if(c==ch){
					count+=1;
				}
			}
		}
		return count;
	} 

	public static int countOccurencesOfC2(List<String> words2, char c2){
		int count = 0;

		for(String elem: words2){
			for(int i=0; i<=elem.length()-1;i++){
				char com = elem.charAt(i);
				if (com==c2){
					count+=1;
				}
			} 
		}
		return count;
	}


	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		int total = sum(nums);
		System.out.println(total);
		List<Integer> evens = evens(nums);
		System.out.println(evens);
		List<Integer> one = new ArrayList<Integer>(List.of(1,2,3));
		
		List<Integer> two = new ArrayList<Integer>(List.of(1,3,5));
		
		List<Integer> common = common(one,two);
		System.out.println(common);

		List<String> words = new ArrayList(List.of("Charlie", "Carly", "crab"));
		char c = 'c';
		int count = countOccurencesOfC(words,c);
		System.out.println(count);

		List<String> words2 = new ArrayList(List.of("Charlie", "Carly", "crab"));
		char c2 = 'C';
		int count2 = countOccurencesOfC(words2,c2);
		System.out.println(count2);
	}
	
}
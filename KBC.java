import java.util.Scanner;
public class KBC{
	public static void main(String[] args) {
		int i=0;
		String user_input;
		String questions[] = new String[]{"Who is the CEO of Google. ?", "Where is he from", "Who is the CEO of Facebook", "how many state in india", "What is state of india : ", "What is Japan also known as?" };
		String first_options[] = new String[]{"Sunil Parcha", "Madurai", "Mark Zuckerberg", "27", "Nagpur", "The machine"};
		String second_options[] =new String[]{"Sundar Pichai", "America", "Ankit Sharma", "30","Delhi", "the confu town"};
		String third_options[] = new String[]{"Amit bhanada", "Delhi", "larry page", "28", "Alaska","The land of rising sun"};
		String four_options[] = new String[]{"Annabel Fenwick Elliott", "Mumbai", "Oliver", "41" , "Dharasala", "Intelligents"};
		String answers[] = new String[]{second_options[0], first_options[1], first_options[2], third_options[3], second_options[4], third_options[5] };
		int rps[] = new int[]{1000, 2000, 5000, 10000, 20000, 50000};
		int n=0;
		int nameLength = questions.length;
		while(n < nameLength){
			System.out.println("yeh question "  + rps[n] + " ke  liye hai");
			System.out.println(questions[n]);
			System.out.println(first_options[n]);
			System.out.println(second_options[n]);
			System.out.println(third_options[n]);
			System.out.println(four_options[n]);
			System.out.println("Aap answer input kijiye");
			Scanner obj = new Scanner(System.in);
			user_input = obj.nextLine();
			System.out.println(user_input);
			if (answers[n].equals(user_input )) {
				System.out.println("EK DUM SAHI JABAB");
			}else{
				System.out.println("AAPKA JABAB SAHI NHI HAI");
				break;
			}
			i = i + rps[n];
			System.out.println("Abhi aap " + i + " Jeet cuke hai");
			n++;
		}
		System.out.println("You Win " + i);
		}
	}
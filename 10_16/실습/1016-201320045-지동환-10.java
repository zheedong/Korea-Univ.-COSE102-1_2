package exercise;

public class Exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book loveStory = new Book("춘향전");
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");

		System.out.println(littlePrince.title + ":" + littlePrince.author);
		System.out.println(loveStory.title + ":" + loveStory.author);
	}

}

package harb;
//https://habr.com/ru/post/440436/
public class RandomElementWeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arrayValue = {1,5,9};
		int[]arrayWeight = {1,3,8};
		RandomElementWeight  newElement= new RandomElementWeight(arrayValue,arrayWeight);
		
		System.out.println(newElement.numberFromArray());

	}

	

}

package Lambda;

public class OddNumber {

	public static void main(String[] args) {
		oddIn o=(int a)->{if(a%2==0)return false;else return true;};
		System.out.println(o.oddNo(11));
	}

}
interface oddIn{
	public boolean oddNo(int a);
}
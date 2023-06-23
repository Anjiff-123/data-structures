package asignment;
abstract class abstractaction
{
	abstract void walk(String walk);
}
class action extends abstractaction
{
	public void walk(String walk)
	{
		System.out.println(walk);
	}
}
class actionDriver {
	public static void main(String[] args) {
		action a=new action();
		a.walk("i am walking");
	}
}
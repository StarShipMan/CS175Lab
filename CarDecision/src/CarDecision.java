
public class CarDecision {

	public static void main(String[] args) {
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		String [] stuff = stickerHybrid.split(",");
		int stuffLength = stuff.length;
		int i;
		String [] moreStuff;
	    for (i = 0;i < stuffLength;i++) {
			System.out.println( stuff[i]);
			moreStuff = stuff[i].split(":");
			System.out.println(moreStuff [1]);
			int n = 0;
		}
	    System.out.println(moreStuff[0]);
	}
}
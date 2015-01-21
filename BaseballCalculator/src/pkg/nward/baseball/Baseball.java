package pkg.nward.baseball;

public class Baseball {

	//vars for relevant info
	
	private static int atBats;
	private static int hits;
	private static int outs;
	private static int walks;
	
	//get/set methods
	
	public static int GetBats(){
		return atBats;
	}
	
	public static void SetBats(int b){
		atBats = b;
	}
	
	public static int GetHits(){
		return hits;
	}

	public static void SetHits(int h){
		hits = h;
	}
	
	public static int GetOuts(){
		return outs;
	}

	public static void SetOuts(int o){
		outs = o;
	}
	
	public static int GetWalks(){
		return walks;
	}
	
	public static void SetWalks(int w){
		walks = w;
	}
	
	//calculation methods
	public static double GetBatAvg(){
		double avg = hits / atBats;
		return avg;
	}
	
	public static double GetBaseAvg(){
		double avg = (hits + walks) / atBats;
		return avg;
	}
	
}


public class Racun {
	
	public enum Tip{
		DINARSKI,
		DEVIZNI,
		INTERNET
	}
	
	protected String mId;
	protected String mName;
	protected String mJmbg;
	protected String mPrezime;
	protected int mBalance = 0;
	protected Tip mTip;
	
	public Racun(String id,String name, String prezime,String jmbg) {
		mId = id;
		mName = name;
		mPrezime = prezime;
		mJmbg = jmbg;
	}
	
	public Racun(String Id,String name,int balance,String prezime,String jmbg) {
		mId = Id;
		mName = name;
		mBalance = balance;
		mPrezime = prezime;
		mJmbg = jmbg;
	}
	
	public Tip getTipRacuna(){
		return mTip;
	}
	
	public void setTipRacuna(Tip noviTip){
		mTip = noviTip;
	}
	
	public String getID() {
		return mId;
	}
	
	public String getName() {
		return mName;
	}

	public String getJmbg() {
		return mJmbg;
	}
	
	public int getBalance() {
		return mBalance;
	}
	
	public void addToBalance(int vrednost) {
		mBalance = mBalance + vrednost;
	}
	
	public void substractFromBalance(int vrednost) {
		mBalance = mBalance - vrednost;
	}
	
	public String toString() {
		return "Racun korisnika \n" + mName + "\n sa identifikacionim brojem \n" + mId + "\n ima trenutno stanje \n"+mBalance;
	}
	
	public boolean transferTo(Racun account, int amount) {
		if (mBalance < amount){
			return false;
		} else {
			substractFromBalance(amount);
			account.addToBalance(amount);
			return true;
		}
	}
}

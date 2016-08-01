
public class Covek {
	
	public enum Pol {
		MUSKI,
		ZENSKI,
		DRUGI
	}
	
	protected String mName,mSurname,mPin;
	protected Address mAddress;
	protected Pol mPol;
	
	public Covek(String novoIme, String prezimeNovo, String jmbgNovi, Address novaAdresa) {
		mName = novoIme;
		mSurname = prezimeNovo;
		mPin = jmbgNovi;
		mAddress = novaAdresa;
	}
	
	public Pol getPol(){
		return mPol;
	}
	
	public void setPol(Pol noviPol){
		mPol = noviPol;
	}
	
	public String getIme() {
		return mName;
 	}
	
	public void setIme(String ime) {
		mName = ime;
	}
	
	public void setPrezime(String prezime) {
		mSurname = prezime;
	}
	
	public String getPrezime() {
		return mSurname;
	}
	
	public void setAdresa(Address adresa) {
		mAddress = adresa;
	}
	
	public Address getAdresa() {
		return mAddress;
	}
	
	public String getPunoIme() {
		String punoIme = mName + " " + mSurname;
		return punoIme;
	}
	
	public void setJmbg(String jmbg) {
		mPin = jmbg;
	}
	
	public String getJmbg() {
		return mPin;
 	}
	
}

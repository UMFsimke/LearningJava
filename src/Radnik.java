
public class Radnik extends Covek {
	
	public enum UgovornaObaveza{
		PROBNI_RAD,
		RADNIK_PO_UGOVORU,
		STALNI_RADNI_ODNOS
	}
	
	protected int mId, mPlata;
	protected Racun mTekuciRacun;
	protected UgovornaObaveza mUgovornaObaveza;
	
	public Radnik(int idBroj, int plataBroj, boolean automatskoOtvaranjeRacuna, Covek noviCovek) {
		super(noviCovek.getIme(), noviCovek.getPrezime(), noviCovek.getJmbg(), noviCovek.getAdresa() );
		mId = idBroj;
		mPlata = plataBroj;
		otvaranjeRacuna (automatskoOtvaranjeRacuna);
	}
	
	public UgovornaObaveza getUgovornaObaveza(){
		return mUgovornaObaveza;
	}
	
	public void setUgovornaObaveza(UgovornaObaveza ugovorStatus){
		mUgovornaObaveza = ugovorStatus;
	}
	
	public void setRacun(Racun racun) {
		mTekuciRacun = racun;
	}
	
	public void uplatiRacun () {
		mTekuciRacun.addToBalance(mPlata);
	}
	
	public int getId() {
		return mId;
	}
	
	public int getPlata() {
		return mPlata;
	}
	
	public void setPlata(int plata1) {
		mPlata = plata1;
	}
	
	public int getGodisnjaPlata() {
		int gPlata = mPlata * 12;
		return gPlata;
 	}
	
	public void povecajPlatu(int procenat) {
		mPlata=(1 + (procenat / 100)) * mPlata;
	}

	public void otvaranjeRacuna(boolean otvaranjeRacuna){
		if(otvaranjeRacuna == true){
			mTekuciRacun = new Racun ( "null",mName,mPlata,mSurname,mPin);
		} 
	}

}

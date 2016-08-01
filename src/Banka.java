import java.util.ArrayList;
import java.util.List;

public class Banka {
	
	protected String mName,mContactNumber,mWebSite;
	protected List<Racun> mRacuni;
	protected Address mAddress;
	
	public Banka(String name, Address address){
		mName = name;
		mAddress = address;
		mRacuni = new ArrayList<>();
	}
	
	public String getName() {
		return mName;
	}
	
	public void setName(String name) {
		mName = name;
	}
	
	public Address getAddress(){
		return mAddress;
	}
	
	public void setAddress(Address address){
		mAddress = address;
	}
	
	public String getContactNumber(){
		return mContactNumber;
	}
	
	public void setContactNumber(String cNumber){
		mContactNumber = cNumber;
	}
	
	public String getWebSite(){
		return mWebSite;
	}
	
	public void setWebSite(String webSite){
		mWebSite = webSite;
	}
	
	public List<Racun> getRacuni(){
		return mRacuni;
	}
	
	public void setRacuni(List<Racun> racuni){
		mRacuni = racuni;
	}
	
	public void openAccount(String ime, String prezime, String jmbg){
		String newId;
		Racun noviRacun;
		newId = System.currentTimeMillis()+"";
		noviRacun = new Racun ( newId,ime,prezime,jmbg);
		mRacuni.add(noviRacun);
	}
	
	public void closeAccount(String id){
		int n = mRacuni.size();
		int listPosition = n;
		for (int i=0; i<n ; i++){
			Racun racun = mRacuni.get(i);
			if(id == racun.getID()){
				listPosition = i;
			}
		}
		
		if (listPosition < n ){
			mRacuni.remove(listPosition);
		}
	}
	
	public boolean transfer(Racun racunFrom, Racun racunTo, int amount){
		boolean result = racunFrom.transferTo(racunTo, amount);
		return result;
	}
	
	public Racun getRacun( String id ){
		int n = mRacuni.size();
		int listPosition = n;
		for (int i =0; i<n; i++){
			Racun racun = mRacuni.get(i);
			if (id == racun.getID()){
				listPosition = i;
			}
		}
		
		if (listPosition < n ){
			return mRacuni.get(listPosition);
		}
		
		return null;
	}
	
	public Racun getRacunByJmbg( String jmbg ){
		int n = mRacuni.size();
		int listPosition = n;
		for (int i=0; i<n; i++){
			Racun racun = mRacuni.get(i);
			if(jmbg == racun.getJmbg()){
				listPosition = i;
			}
		}
		
		if (listPosition < n ){
			return mRacuni.get(listPosition);
		}
		
		return null;
	}
}

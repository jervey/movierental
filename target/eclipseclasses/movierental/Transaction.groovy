package movierental

class Transaction {

	String customerId
	String type
	String movieId
	Date date
	double fee

<<<<<<< HEAD

	
    static mapping = {
    }
    
	static constraints = {
=======
    static constraints = {
>>>>>>> 1a6d97f912a0ed6ec36fea4c2115715844aa52ac
		customerId(blank:false)
		type(blank:false)
		movieId(blank:false)
		date(blank:false)
		fee(blank:false)
    }
<<<<<<< HEAD
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId
	}
	
	public void setType(String type) {
		this.type = type
	}
	
	public void setMovieId(String movieId) {
		this.movieId = movieId
	}
	
	public void setDate(Date date) {
		this.date = date
	}
	
	public void setFee(double fee) {
		this.fee = fee
	}
	
	public String getCustomerId() {
		return customerId
	}
	
	public String getType() {
		return type
	}
	
	public String getMovieId() {
		return movieId
	}
	
	public String getDate() {
		return date
	}
	
	public double getFee() {
		return fee
	}
	
=======
>>>>>>> 1a6d97f912a0ed6ec36fea4c2115715844aa52ac
}

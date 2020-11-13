package com.maBanque;

public class CompteImpl implements Compte{ 
 
 	float solde; 
 	 
 	@Override 
 	public void crediter(float credit) throws NumberNullException{ 
 		
 		if(credit < 0)
 			throw new NumberNullException();
 			
 		else 
 			this.solde += credit;
 	}

	@Override
	public float getSolde() {
		return this.solde;
	}

	@Override
	public float debiter(float debit) throws NumberNullException {
		
		if(debit < 20 || debit > 1000) {
			throw new NumberNullException();
		}
			
		else if(debit > this.solde)
			return this.solde;
			
		else 
			return debit;
		
		
	}

	@Override
	public void setSolde(float solde) throws NumberNullException {
		
		if(solde < 0)
			throw new NumberNullException();
		
		else 
			this.solde = solde;
	} 
  
} 

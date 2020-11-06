package com.maBanque;

public interface Compte {

	/** 
	*	Credite le compte du montant donn� en argument. 
	*	@param credit 
	*	@throws Exception si credit <= 0 
	 	 */ 
	 	void crediter(float credit) throws Exception; 
	 
	 	float getSolde(); 
	 
	 	/** 
	*	D�bite le compte de la valeur donn�e en argument 
	*	@param debit 
	*	@return le montant demand� si le solde du compte est sup�rieur au montant demand�, 
	*	retourne la valeur du solde si le solde est inf�rieur au montant demand�.  
	*	@throws Exception si debit < 20 ou si debit > 1000 euros. 
	 	 */ 
	 	float debiter(float debit) throws Exception; 
	 	 
	 	/** 
	*	Reinitialise 
	*	@param solde 
	*	@throws Exception si solde <= 0 
	 	 */ 
	 	void setSolde(float solde) throws Exception; 
	 

}

package test.com.maBanque;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;  
import com.maBanque.CompteImpl;
import com.maBanque.NumberNullException; 
 
public class CompteTest { 
 	 
	@Test
 	public void setSolde(){ 
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  		 	 	
 	 	 	compteImpl.setSolde(0);  	 	 	
 	 	 	float solde = compteImpl.getSolde();  	 	
 	 	 	assertTrue(solde >= 0);  
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}
	
	@Test
 	public void crediter(){ 
		
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  	
 	 	 	compteImpl.setSolde(0); 
 	 	 	compteImpl.crediter(1);  	 	 	
 	 	 	float solde = compteImpl.getSolde(); 
 	 	 	
 	 	 	assertTrue(solde >= 0);  
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}
 	
	@Test
 	public void debiter(){ 
		
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  	
 	 	 	compteImpl.setSolde(10); 
 	 	 	compteImpl.debiter(21);  	 	 	
 	 	 	float solde = compteImpl.getSolde(); 
 	 	 	
 	 	 	assertTrue(solde >= 0);  
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}
	

	
	@Test(expected = NumberNullException.class)
	public void setSoldeErreur() throws NumberNullException{
	 	 	CompteImpl compteImpl = new CompteImpl();  	
	 	 	compteImpl.setSolde(-1); 	 	 	
	}
	
	
	@Test(expected = NumberNullException.class)
	public void debiterErreur() throws NumberNullException{
	 	 	CompteImpl compteImpl = new CompteImpl();  	
	 	 	compteImpl.setSolde(0); 
	 	 	compteImpl.debiter(5);  	 	 	
	}
	
	@Test(expected = NumberNullException.class)
	public void crediterErreur() throws NumberNullException{
	 	 	CompteImpl compteImpl = new CompteImpl();  	
	 	 	compteImpl.setSolde(0); 
	 	 	compteImpl.crediter(-3);	 	 	
	}



} 

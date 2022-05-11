package trycatchexample;

import javax.xml.bind.ValidationEvent;

public class VoteException extends Exception
{
	VoteException(String errormsg) 
	{
		super(errormsg);
	}
	VoteException() 
	{
		
	}
	
	void validateAge(int age) throws VoteException {
		if(age<18) {
			throw new VoteException("Not right age for vote casting");
		}
		else {
			System.out.println("Cast your vote");
		}
	}
	
	
	
	public static void main(String[] args) throws VoteException {
	 
		VoteException m = new VoteException();
		m.validateAge(17);
		
	}

}



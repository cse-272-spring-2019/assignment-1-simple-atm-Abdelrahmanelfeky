package atm;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Client {
    ArrayList<String> his = new ArrayList<String>();
    private double balance=0.0;
    int index = 0;
    
    public double getBalance()
    {
        return this.balance;
        
}
    public double getBalance2()
    {
         String x = String.valueOf(getBalance());
	
	String z = "Balance " + x;
	his.add(z);
	if(his.size()>5)
	{his.remove(0);
		}
	index=his.size()-1;
        return this.balance;
        
}
    public void depositeTheValue(double value)
    {
     this.balance=this.balance+value;
     String x = String.valueOf(value);
	
	String z = "Deposite " + x;
	his.add(z);
	if(his.size()>5)
	{his.remove(0);
		}
	index=his.size()-1;
    }
    
    public void withdrawTheValue(double value)
    {    
        this.balance=this.balance-value;
             String x = String.valueOf(value);
	
	String z = "withdraw " + x;
	his.add(z);
	if(his.size()>5)
	{his.remove(0);
		}
	index=his.size()-1;
    }
    
    public String Next()
{
	if(index==his.size()-1)
		return null;

	index++;
	return his.get(index);
	
	}

public String Previous()
{
    
	if(index==0)
		return null;
        

	index--;
	return his.get(index);
	
	}



public int getIndex()
{
	return index;
}



public int getSize()
{
	return his.size();
	}


}
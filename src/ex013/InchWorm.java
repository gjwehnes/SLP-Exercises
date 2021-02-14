package ex013;

public class InchWorm {
	
	private int position;
	private int direction;  
	
    public InchWorm() 
	{
    	position = 0;
    	direction = 1;
    }
    
    public InchWorm(int initialPosition)  
    {
    	 position = initialPosition;
    	 direction = 1;
    }
    
    public void move()
    {
         position = position + direction;   
    }
    
    public void turn()
    {
         direction = direction * -1; 
    }
   
    public int getPosition()
    {
        return position;
    }
   
    public int getDirection()
    {
        return direction;
    }
}


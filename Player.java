class Player
{
    public static void main(String args[])
    {
        Player p = new Player();
        p.evaluate(0.297f);		
        p.evaluate(0.327f);
        p.evaluate(0.195f);
    }

    public void evaluate(float battingAverage)
    {
        if (battingAverage >= 0.300f)
            System.out.println("Great Great Great");
        else if (battingAverage >= 0.200f)
            System.out.println("Great Great");
        else 
            System.out.println("Great");
    }
}
	
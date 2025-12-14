
public class Test11Void {
	

    // Since return type of demofunction method is void
    // so this method should return any value
    // Method 1
    void demofunction(double j)
    {
        return;

        // Here get compile error since can't
        // write any statement after return keyword

        //++j;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Calling the above defined function
        new Test11Void().demofunction(5);
    }

}

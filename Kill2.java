
/**
 * Module 2 Project Java Review<p>
 * A Simple program to remove the second letter from a String provided as a single command line arg
 * 
 * @param args      A single command line String
 * @throws Error    If there is more or less than 1 commandline arg, or if the arg length is less than 2 an error will be thrown
 * @author Peter Hartnett
 */
public class Kill2 {
    public static void main(String[] args){
        try{
            //Guard against cmdln arg errors
            if (args.length != 1) {
                throw new Exception("Error. One command line argument is required.");
            }
            if (args[0].length() < 2) {
                throw new Exception("Error. Argument length must be greater than one.");
            }

            //create StringBuilder and deleteCharacter at index 1
            StringBuilder workingString = new StringBuilder(args[0]);
            workingString.deleteCharAt(1);
            //output workingString
            System.out.println(workingString.toString() + "\n");

        //propogate and print out the error if one was thrown
        } catch (Exception e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}

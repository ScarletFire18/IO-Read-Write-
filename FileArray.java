import java.io.*;

public class FileArray
{     

   public FileArray(int[] data, String filename)
      {
      }
         public void writeArray(int[] data, String filename) throws IOException
            {
               // Create the binary output objects.
               FileOutputStream fstream = new FileOutputStream(filename);
               DataOutputStream outputFile = new DataOutputStream(fstream);
               System.out.println("Writing the integers to the file...");
            
               // Write the array elements (integers) to the file.
               for (int i = 0; i < data.length; i++)
               outputFile.writeInt(data[i]);
               System.out.println("Done.");
            
               // Close the file.
               System.out.println("Closing file.\n");
               outputFile.close();
            }
      
         public static void readArray(String filename) throws IOException
            {
               int number;  // A number read from the file
               boolean endOfFile = false;       // EOF flag
               String str = "";
            
               // Create the binary file input objects.
               FileInputStream fstream = new FileInputStream(filename);
               DataInputStream inputFile = new DataInputStream(fstream);
               System.out.println("Reading numbers from the file:");
            
               // Read the integer contents of the file.
               while (!endOfFile)
                  { 
                     try
                        {
                           number = inputFile.readInt();
                           str = number + " ";
                           System.out.print(str);
                        }
                     
                     catch (EOFException e)
                        {
                           endOfFile = true;
                        }
                  }
               // Close the file.
               System.out.println("\nClosing file.\n");
               inputFile.close();
         }
   
}
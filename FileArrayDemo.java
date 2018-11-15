public class FileArrayDemo
{
      public static void main(String[] args)
         {
            // An array to write to the file
            int[] numbers1 = { 2, 5, 6, 8, 7, 12 };
            int[] numbers2 = { 18, 5, 67, 32, 45 };
            String file1 = "Numbers.dat";
            String file2 = "Numbers1.dat";
            
            try
               {
                  System.out.println("demo1:");
                  FileArray demo1 = new FileArray(numbers1, file1);
                  demo1.writeArray(numbers1, file1);
                  demo1.readArray(file1);  
               }
            
            catch(Exception e)
               {
                  System.out.println(e.getMessage());
               }
               
            try
               {
                  System.out.println("demo2:");
                  FileArray demo2 = new FileArray(numbers2, file2);
                  demo2.writeArray(numbers2, file2);
                  demo2.readArray(file2);  
               }
            
            catch(Exception e)
               {
                  System.out.println(e.getMessage());
               }
          }
                  
}

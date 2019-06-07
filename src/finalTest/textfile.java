package finalTest;



import java.io.*;
import java.util.ArrayList;

public class textfile {
	
	public static void main(String[] args) throws IOException
	{
		String path = "‪C:\\Users\\Gaurav\\Desktop\\Cheat Sheets\\JAVA\\Dict.txt";
			File f= new File(path);
			doesFileExist(path);
			FileReader fr = new FileReader(f);
			ArrayList <String> dic= new ArrayList <String>();
			BufferedReader br= new BufferedReader(fr);
	        String line = null;
	                
	        while ((line =br.readLine())!= null)
	        {
	        	String[] linearray = line.split("-");
	        	dic.add(linearray[0]);
	        	dic.add(linearray[1]);
	        	dic.add(linearray[2]);
	        	dic.add(linearray[3]);
	        	dic.add(linearray[4]);
	        	dic.add(linearray[5]);
	        	dic.add(linearray[6]);       	
	        }
	        System.out.println(dic);
	}
	
	//method to find if file exists or not
	public static void doesFileExist(String path)
	{
		try
		{
			File file = new File(path);
			boolean exists = file.exists();
				if(exists = true)
					System.out.println("File exists");
				else
					System.out.println("File does not exists");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
	
	}

	




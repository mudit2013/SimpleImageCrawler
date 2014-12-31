package utility;

import java.io.BufferedReader;
import java.io.FileReader;

import com.mminc.imageCrawler.CrawlImages;

public class ReadCSVFiles {

	/**
	 * main method, starting point for crawling
	 * @param args
	 */
public static void main(String[] args) {
	CrawlImages objCrawlImages = new CrawlImages();
	ReadCSVFiles objReadCSVFiles = new ReadCSVFiles();
	objReadCSVFiles.readFollowerCsv(objCrawlImages);
	objReadCSVFiles.readFriendCsv(objCrawlImages);
	System.out.println("Images from all rows collected");
}

/**
 * method to read different follower files
 * @param objCrawlImages
 */
public void readFollowerCsv(CrawlImages objCrawlImages){
	
	String path = "your path";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	String file = "";
	for(int i=1;i<=3;i++){
		switch (i){
		case 1: file = "/filename1";
		        break;
		case 2: file = "/filename2";
                break;
		case 3: file = "/filename3";
                break;
		}
		try {
			String finalPath = path+file+".csv";
			br = new BufferedReader(new FileReader(finalPath));
			while ((line = br.readLine()) != null) {
				String[] twitterPerson = line.split(cvsSplitBy);
	            objCrawlImages.getImageFromLink(twitterPerson[0], twitterPerson[1], twitterPerson[2],path, file);
			}
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * method to read different friends file
 * @param objCrawlImages
 */
public void readFriendCsv(CrawlImages objCrawlImages){
	
	String path = "your path";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	String file = "";
	for(int i=1;i<=3;i++){
		switch (i){
		case 1: file = "/filename1";
		        break;
		case 2: file = "/filename2";
                break;
		case 3: file = "/filename3";
                break;
		}
		try {
			String finalPath = path+file+".csv";
			br = new BufferedReader(new FileReader(finalPath));
			while ((line = br.readLine()) != null) {
				String[] twitterPerson = line.split(cvsSplitBy);
	            objCrawlImages.getImageFromLink(twitterPerson[0], twitterPerson[1], twitterPerson[2],path, file);
			}
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}

package dentsu.isobarFM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import netscape.javascript.JSObject;

@RestController
public class IsobarController {
    //returns all bands
	@GetMapping("/Bands")
	public List<Band> GetBands() {
		//if(has cache on sqlite database){return database response} 
		//else{
		
		ObjectMapper mapper = new ObjectMapper();
		List<Band> bandList = new ArrayList<>();
		try {

            URL url = new URL("https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            //String line;
			bandList = Arrays.asList(mapper.readValue(br, Band[].class));
			// StringBuilder sb = new StringBuilder()
            // while ((line = br.readLine()) != null) {
			// 	sb.append(line);
            //  }
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
		return bandList;}
    }
    //return bands filtered by name
	@GetMapping("/Bands/{bandName}")
	public List<Band> GetBandsFilteredByName(String bandId) {
		//if(has cache with this bandName on sqlite database){return database response} 
		//else{
		ObjectMapper mapper = new ObjectMapper();
		List<Band> bandList = new ArrayList<>();
		try {

            URL url = new URL("https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            //String line;
			bandList = Arrays.asList(mapper.readValue(br, Band[].class));
			// StringBuilder sb = new StringBuilder()
            // while ((line = br.readLine()) != null) {
			// 	sb.append(line);
            //  }
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
		return bandList;
    }
	//return one band by id
	@GetMapping("/Band/{bandId}")
	public Band GetBand(String bandId) {
		//if(has cache on sqlite cache database){return database response} 
		//else{
		ObjectMapper mapper = new ObjectMapper();
		List<Band> bandList = new ArrayList<>();
		try {

            URL url = new URL("https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            //String line;
			bandList = Arrays.asList(mapper.readValue(br, Band[].class));
			// StringBuilder sb = new StringBuilder()
            // while ((line = br.readLine()) != null) {
			// 	sb.append(line);
            //  }
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
		Band band //receives data from the band with correspondent id 
		return band;
    }

}


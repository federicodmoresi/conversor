package ar.com.conversor.modelo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ApiCotizaciones {

	private String eur;
	private String usd;
	private String ars;
	private String brl;
	private String mxn;

	public void ObtenerCotizaciones() {

		try {

			URL url = new URL("http://api.exchangeratesapi.io/v1/latest?access_key=1d262f2682e58b90c6886aa3063239eb");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int responseCode = conn.getResponseCode();

			if (responseCode != 200) {
				throw new RuntimeException("Ocurrio un error" + responseCode);
			} else {
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());

				while (scanner.hasNext()) {

					informationString.append(scanner.nextLine());
				}
				scanner.close();
				JSONObject jsonObj = new JSONObject(informationString.toString());
				JSONObject jsonFinal = new JSONObject(jsonObj.getJSONObject("rates").toString());
				this.eur = jsonFinal.toMap().get("EUR").toString();
				this.usd = jsonFinal.toMap().get("USD").toString();
				this.ars = jsonFinal.toMap().get("ARS").toString();
				this.brl = jsonFinal.toMap().get("BRL").toString();
				this.mxn = jsonFinal.toMap().get("MXN").toString();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getEur() {
		return eur;
	}

	public String getUsd() {
		return usd;
	}

	public String getArs() {
		return ars;
	}

	public String getBrl() {
		return brl;
	}

	public String getMxn() {
		return mxn;
	}

}

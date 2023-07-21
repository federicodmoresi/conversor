package ar.com.conversor.modelo;


public class Monedas {
	private double dolar;
	private double euro;
	private double pesoArgentino;
	private double real;
	private double pesoMexicano;
	public String monedas[] = { "Dolar", "Euro", "Peso Argentino", "Peso Mexicano", "Real" };

	public double getPesoMexicano() {
		return pesoMexicano;
	}

	public void setPesoMexicano(double pesoMexicano) {
		this.pesoMexicano = pesoMexicano;
	}

	public Monedas() {
		ApiCotizaciones cotizaciones = new ApiCotizaciones();
		cotizaciones.ObtenerCotizaciones();
		
		this.dolar = Double.parseDouble(cotizaciones.getUsd());
		this.euro = Double.parseDouble(cotizaciones.getEur());
		this.pesoArgentino = Double.parseDouble(cotizaciones.getArs());
		this.real = Double.parseDouble(cotizaciones.getBrl());
		this.pesoMexicano = Double.parseDouble(cotizaciones.getMxn());

	}

	public String[] monedas() {
		return this.monedas;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public double getPesoArgentino() {
		return pesoArgentino;
	}

	public void setPesoArgentino(double pesoArgentino) {
		this.pesoArgentino = pesoArgentino;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}
}

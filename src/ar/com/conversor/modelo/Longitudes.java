
package ar.com.conversor.modelo;

import java.util.ArrayList;


public class Longitudes {

    public ArrayList<String> longitudes = new ArrayList();
    private String ingreso;
    private String retorno;

    public Longitudes() {
        longitudes.add("milimetro");
        longitudes.add("centimetro");
        longitudes.add("decimetro");
        longitudes.add("metro");
        longitudes.add("kilometro");
        longitudes.add("milla");
        longitudes.add("yarda");
        longitudes.add("pie");

    }

    public ArrayList<String> getLongitudes() {
        return longitudes;
    }


    public void obtenerDatosIngresados(String ingreso, String retorno) {
        for (String longitudes : longitudes) {
            if (longitudes == ingreso) {
                this.ingreso = longitudes;
            }
            if (longitudes == retorno) {
                this.retorno = longitudes;
            }
        }
    }

    public double calcularConversion(double ingreso) {

        switch (this.ingreso) {
            case "milimetro":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso;

                    case "centimetro":
                        return ingreso / 10;

                    case "decimetro":
                        return ingreso / 100;

                    case "metro":
                        return ingreso / 1000;

                    case "kilometro":
                        return ingreso / 1000000;

                    case "milla":
                        return ingreso * 6.21 * Math.pow(10, -7);

                    case "yarda":
                        return ingreso * 1.09 * Math.pow(10, -3);

                    case "pie":
                        return ingreso * 3.28 * Math.pow(10, -3);

                    default:
                        return 0;
                }
            case "centimetro":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 10;

                    case "centimetro":
                        return ingreso;

                    case "decimetro":
                        return ingreso / 10;

                    case "metro":
                        return ingreso / 100;

                    case "kilometro":
                        return ingreso / 100000;

                    case "milla":
                        return ingreso * 6.21 * Math.pow(10, -6);

                    case "yarda":
                        return ingreso / 100;

                    case "pie":
                        return ingreso / 30;

                    default:
                        return 0;
                }
            case "decimetro":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 100;

                    case "centimetro":
                        return ingreso * 10;

                    case "decimetro":
                        return ingreso;

                    case "metro":
                        return ingreso / 10;

                    case "kilometro":
                        return ingreso / 10000;

                    case "milla":
                        return ingreso * 6.21 * Math.pow(10, -5);

                    case "yarda":
                        return ingreso / 0.9;

                    case "pie":
                        return ingreso / 3;

                    default:
                        return 0;
                }
            case "metro":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 1000;

                    case "centimetro":
                        return ingreso * 100;

                    case "decimetro":
                        return ingreso * 10;

                    case "metro":
                        return ingreso;

                    case "kilometro":
                        return ingreso / 1000;
                    //break;
                    case "milla":
                        return ingreso * 6.21 * Math.pow(10, -4);
                    //break;
                    case "yarda":
                        return ingreso * 1.09;
                    //break;
                    case "pie":
                        return ingreso * 3.28;
                    // break;
                    default:
                        return 0;
                }
            case "kilometro":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 10000;
                   
                    case "centimetro":
                        return ingreso * 1000;
                    
                    case "decimetro":
                        return ingreso * 100;
                    
                    case "metro":
                        return ingreso * 10;
                    
                    case "kilometro":
                        return ingreso;
                    
                    case "milla":
                        return ingreso * 0.62;

                    case "yarda":
                        return ingreso * 1093.61;
                   
                    case "pie":
                        return ingreso * 3280.84;
                   
                    default:
                        return 0;
                }
            case "milla":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 1609344;
                    
                    case "centimetro":
                        return ingreso * 160934.40;
                    
                    case "decimetro":
                        return ingreso * 16093.44;
                    
                    case "metro":
                        return ingreso * 1609.34;
                    
                    case "kilometro":
                        return ingreso * 1.61;
                    
                    case "milla":
                        return ingreso;
                    
                    case "yarda":
                        return ingreso * 1760;
                    
                    case "pie":
                        return ingreso * 5280;
                   
                    default:
                        return 0;
                }
            case "yarda":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 914.4;
                    
                    case "centimetro":
                        return ingreso * 91.44;
                    
                    case "decimetro":
                        return ingreso * 914.4;
                   
                    case "metro":
                        return ingreso * 0.91;
                    
                    case "kilometro":
                        return ingreso * 9.14 * Math.pow(10, -4);
                        
                    case "milla":
                        return ingreso * 5.68 * Math.pow(10, -4);
                   
                    case "yarda":
                        return ingreso;
                    
                    case "pie":
                        return ingreso * 3;
                    
                    default:
                        return 0;
                }
            case "pie":
                switch (this.retorno) {
                    case "milimetro":
                        return ingreso * 304.8;
                    
                    case "centimetro":
                        return ingreso * 30.48;
                    
                    case "decimetro":
                        return ingreso * 3.48;
                    
                    case "metro":
                        return ingreso * 0.348;
                    
                    case "kilometro":
                        return ingreso * 3.048 * Math.pow(10, -4);
                    
                    case "milla":
                        return ingreso * 1.89 * Math.pow(10, -4);
                   
                    case "yarda":
                        return ingreso * 0.33;
                    
                    case "pie":
                        return ingreso;
                    
                    default:
                        return 0;
                }
            default:
                return 0;
        }

    }



}


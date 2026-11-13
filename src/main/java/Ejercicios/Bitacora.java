/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author brann
 */
public class Bitacora {

    private static final String RUTA = "bitacora.txt";

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void registrar(String mensaje) throws IOException {

        LocalDateTime fecha = LocalDateTime.now();

        String fechaTexto = fecha.format(FORMATO);

        FileWriter fw = new FileWriter(RUTA, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("[" + fechaTexto + "] " + mensaje);

        pw.close();
    }

    public List<String> leer() throws IOException {

        List<String> lineas = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(RUTA));

        String linea;

        while ((linea = br.readLine()) != null) {lineas.add(linea);
        }

        br.close();

        return lineas;
    }

    public int contar(String palabra) throws IOException {

        int contador = 0;

        List<String> lineas = leer();

        for (int i = 0; i < lineas.size(); i++) {

            if (lineas.get(i).toLowerCase().contains(palabra.toLowerCase())) {

                contador++;
            }
        }

        return contador;
    }
}

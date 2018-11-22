package com.jram.navwebjavaswing.models;

import com.jram.navwebjavaswing.entity.Documentacion;
import java.util.ArrayList;
import java.util.regex.*;

/**
 * @version 1.0
 * @author JavierT
 */
public class Operaciones {

    //Instancia a la clase Documentacion
    Documentacion document = new Documentacion();
    //Creacion de ArrayList de la clase Documentacion, ADT a utilizar
    static ArrayList<Documentacion> documentList = new ArrayList<>();
    //Expreción regular de validacion
    private static final String URL_REGEX
            = "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))"
            + "(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$, A-Za-z0-9])+)" + "([).!';/?:, ][[:blank:]])?$";
    //Compilacion de la validacion
    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

    //Metodo agregar datos y validandolos
    public void addData(String url, String docu) {
        if (validateUrl(url)) {
            if (docu.length() <= 90) {
                document = new Documentacion(url, docu);
                documentList.add(document);
            }
        }
    }

    //Metodo validar URL sea valida
    public boolean validateUrl(String url) {
        if (url == null) {
            return false;
        }
        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
    }

    //Metodo que retorna el valor de ArrayList
    public ArrayList<Documentacion> getList() {
        return documentList;
    }

    //Metodo que retorna el tamaño de la ArrayList
    public int sizeList() {
        return documentList.size();
    }
}

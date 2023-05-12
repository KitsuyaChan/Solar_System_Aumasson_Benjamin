package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logmachine {

    PrintWriter rfile = new PrintWriter("log.js");

    List<String> templog = new ArrayList<>();

    List<String> backlog = new ArrayList<>();

    public Logmachine() throws FileNotFoundException {
    }

    public void meteoriteEntreePerimetre(CorpsCeleste corpsCeleste, Meteorite meteorite) {
        String message = "Une météorite est entrée dans le périmètre de " + corpsCeleste.getName() + " : " + meteorite.getId();
        addjson(message);
    }

    public void meteoriteSortiePerimetre(CorpsCeleste corpsCeleste, Meteorite meteorite) {
        String message = "Une météorite est sortie du périmètre de " + corpsCeleste.getName() + " : " + meteorite.getId();
        addjson(message);
    }

    public void meteoriteDesintegree(Meteorite meteorite) {
        String message = "La météorite " + meteorite.getId() + " s'est désintégrée après une collision";
        addjson(message);
    }

    public void corpsCelesteDetruit(CorpsCeleste corpsCeleste) {
        String message = corpsCeleste.getName() + " a été détruite après une collision avec une météorite";
        addjson(message);
    }

    public void addjson(String s) {
       templog.add(s);
    }

    public void wcycle(){
        backlog.add(templog.toString());
        System.out.println(backlog.toString());
        templog.clear();
    }

    public void printlog(){
        rfile.print("const logs ="+backlog.toString());
        rfile.close();
    }
}

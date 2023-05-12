import main.*;
import org.json.JSONObject;
import java.io.IOException;
import java.lang.System;

import static main.Facto_enum.*;


public class Main {
    public static void main(String[] args) throws IOException {
        JSONObject sun = Tools.jsonFileToJsonObject("sun.json");
        JSONObject earth = Tools.jsonFileToJsonObject("earth.json");
        JSONObject moon = Tools.jsonFileToJsonObject("moon.json");
        JSONObject jmars = Tools.jsonFileToJsonObject("mars.json");
        JSONObject phob = Tools.jsonFileToJsonObject("phobos.json");



        Etoile soleil = (Etoile) Factorycorpceleste.facto_cc(ETOILE,sun);
        Planet terre = (Planet) Factorycorpceleste.facto_cc(PLANET , earth);
        Planet mars = (Planet)Factorycorpceleste.facto_cc(PLANET,jmars);
        Satellite lune = (Satellite) Factorycorpceleste.facto_cc(SATELLITE,moon);
        Satellite phobos = (Satellite) Factorycorpceleste.facto_cc(SATELLITE,phob);



        terre.add_satellite(lune);
        mars.add_satellite(phobos);
        terre.turn();



        System.out.println(soleil.getName());
        System.out.println(terre.getName());
        System.out.println(terre.pos_to_string());
        System.out.println(lune.pos_to_string());
        System.out.println(terre.distance(soleil));
        System.out.println(terre.getClass());



        System_s sol = new System_s("Systaire");
        sol.addCorp(soleil);
        sol.addCorp(terre);
        sol.addCorp(lune);
        sol.addCorp(mars);
        sol.addCorp(phobos);
        sol.turnall(800);
    }
}
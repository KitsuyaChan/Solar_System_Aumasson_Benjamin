package main;

public enum Type {
    NORMAL,
    TUEUSE_PLANETE
}



class Meteorite extends CorpsCeleste {
    private int id;
    private Type type;
    private Vitesse vitesse;
    private Position position;


    public Meteorite(){}
    public Meteorite(int id, Type type, Vitesse vitesse, Position position) {
        this.id = id;
        this.type = type;
        this.vitesse = vitesse;
        this.position = position;
    }



    public int getId() { return id; }
    public Type getType() { return type; }
    public Vitesse getVitesse() { return vitesse; }
    public Position getPosition() { return position; }



    public void setId(int id) { this.id = id; }
    public void setType(Type type) { this.type = type; }
    public void setVitesse(Vitesse vitesse) { this.vitesse = vitesse; }
    public void setPosition(Position position) { this.position = position; }
}

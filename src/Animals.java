public class Animals {

    protected String food;
    protected String habitat;
    protected String movement;
    protected String kind;

    public void setkind(String animalkind){ kind=animalkind;
    }
    public void setmovement(String animalmovement){ movement=animalmovement;
    }
    public void sethabitat(String animalhabitat){ habitat=animalhabitat;
    }
    public void setfood(String animalfood){ food=animalfood;
    }

    void talk(){System.out.println("I'm "+kind+"I live in "+habitat+". I can "+ movement+". I'm "+food);
    }
}

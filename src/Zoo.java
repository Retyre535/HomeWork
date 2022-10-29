public class Zoo {
    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        deer deer = new deer();
        Carp carp = new Carp();
        Lion lion = new Lion();
        elephant.setkind("Elephant");
        elephant.setmovement("Slowly walk on 4 paws");
        elephant.sethabitat("savannas");
        elephant.setfood("herbivorous");
        deer.setkind("Deer");
        deer.setmovement("walk or run on 4 paws");
        deer.sethabitat("forest");
        deer.setfood("herbivorous");
        carp.setkind("Carp");
        carp.setmovement("swim");
        carp.sethabitat("water");
        carp.setfood("omnivorous");
        lion.setkind("Lion");
        lion.setmovement("lie or run on 4 paws");
        lion.sethabitat("savannas");
        lion.setfood("Predator");


        elephant.slowly_talk();
        deer.horned_talk();
        carp.gurgling_talk();
        lion.growling_talk();
        
    }
}

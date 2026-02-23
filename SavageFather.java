public class SavageFather extends Person {
    // Изначально он просто "Пленник"
    public SavageFather(int initialHealth) { 
        super("Пленник", initialHealth); 
    }

    @Override
    public void performAction() {
        if (health < 20) {
            System.out.println("Старик лежал на дне лодки, почти не подавая признаков жизни.");
        } else {
            System.out.println("Старик с трудом попытался приподняться.");
        }
    }
    
    public void drinkRum() {
        this.health += 25;
        if (health > 100) health = 100;
        System.out.println("Живительная влага подействовала. Старик закашлялся, но в его глазах появился блеск.");
    }
    public void revealIdentity() {
        this.name = "Отец Пятницы";
    }
}

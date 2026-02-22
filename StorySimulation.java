import java.util.Random;

public class StorySimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int initialHealth = 10 + random.nextInt(31); 
        int rumAmount = random.nextInt(100);    

  
        Robinson robinson = new Robinson();
        Friday friday = new Friday();
        SavageFather father = new SavageFather(initialHealth);
        Item rumBottle = new Item("бутыль с ромом", rumAmount);

        System.out.println("История начинается. Робинзон и Пятница нашли на берегу лодку со связанным человеком.");
        
        if (!father.isAlive()) {
            System.out.println("Но было уже поздно. Пленник был мертв.");
            return;
        }

        robinson.giveCommand(friday, father);
        friday.giveDrink(father, rumBottle);

        
        try {
            friday.examineFace(father);
        } catch (EmotionalOverloadException e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("Надо было видеть, что сделалось с Пятницей!");
            for (int i = 0; i < 2; i++) {
                friday.goCrazy();
            }
            System.out.println("Наконец, он немного успокоился.\n");
        }

       
        if (father.getName().equals("Отец Пятницы") && father.isAlive()) {
            System.out.println("Нельзя было смотреть без слез на эту радость дикаря.");
            Caregiver healer = friday; 
            healer.warmUp(father);
            healer.rubLimbs(father);
        }
        
        System.out.println("\nКонец истории.");
    }
}
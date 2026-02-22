import java.util.Random;

public class Friday extends Person implements Caregiver {
    public Friday() { super("Пятница", 95); }

    @Override
    public void performAction() {
        System.out.println("[Пятница] Ожидает указаний.");
    }

    public void receiveOrder(Person target) {
        System.out.println("[Пятница] Кивнул и подошел к " + target.getName());
    }

    public void giveDrink(SavageFather target, Item rum) {
        try {
            System.out.println("[Пятница] Пытается дать ром...");
            rum.consume(50); 
            target.drinkRum();
        } catch (ResourceExhaustedException e) {
            System.out.println("[!] ОШИБКА: " + e.getMessage());
            System.out.println("[Пятница] В панике ищет воду (альтернативный сценарий)...");
            target.health += 5; 
        }
    }


public void examineFace(SavageFather target) throws EmotionalOverloadException {
    System.out.println("Пятница вгляделся в изможденное лицо спасенного...");
    boolean recognizes = new java.util.Random().nextInt(100) < 80; 

    if (recognizes) {
        this.emotion = EmotionalState.SHOCKED;
        target.revealIdentity(); 
        throw new EmotionalOverloadException(this, "Это же мой отец!");
    } else {
        System.out.println("...но не узнал в нем никого. Он просто помог чужаку.");
    }
}

    @Override
    public void warmUp(Person target) {
        System.out.println("[Пятница] Расстегнул куртку и прижал голову " + target.getName() + " к груди.");
        VitalSigns vs = target.checkVitals();
        System.out.println("Температура цели: " + vs.bodyTemperature());
    }

    @Override
    public void rubLimbs(Person target) {
        System.out.println("[Пятница] Растирает руки и ноги " + target.getName() + ".");
    }
    
    public void goCrazy() {
        String[] crazyActions = {"прыгает", "плачет", "смеется", "бьет себя", "танцует"};
        Random rnd = new Random();
        System.out.println("[Пятница] " + crazyActions[rnd.nextInt(crazyActions.length)] + " вокруг лодки!");
    }
}
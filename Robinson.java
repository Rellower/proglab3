public class Robinson extends Person {
    public Robinson() { super("Робинзон", 100); }

    @Override
    public void performAction() {
        System.out.println("[Робинзон] Наблюдает за ситуацией.");
    }

    public void giveCommand(Friday subordinate, Person target) {
        System.out.println("[Робинзон] Приказывает Пятнице помочь человеку: " + target.getName());
        subordinate.receiveOrder(target);
    }
}
public class Item {
    private String name;
    private int volume; // В мл, если жидкость

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }



public void consume(int amount) {
    if (volume < amount) {
        throw new ResourceExhaustedException("В предмете " + name + " недостаточно ресурса!");
    }
    
    // Если все хорошо, отнимаем объем
    volume -= amount;
}

    public boolean isEmpty() { return volume <= 0; }

    @Override
    public String toString() { return name + " (" + volume + "мл)"; }
}
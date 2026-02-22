public class EmotionalOverloadException extends Exception {
    private final Person source;

    public EmotionalOverloadException(Person source, String cause) {
        super(cause);
        this.source = source;
    }

    @Override
    public String getMessage() {
        return String.format(" Перегрузка эмоций[%s]: %s", source.getName(), super.getMessage());
    }
}

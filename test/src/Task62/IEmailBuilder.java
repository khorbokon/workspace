package Task62;

public interface IEmailBuilder {
    EmailBuilder setFto(String valTo);

    public Email build();
}

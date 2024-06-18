package actors;

public enum User {
    STANDARD_USER("standard_user","secret_sauce", "julian", "Doe","110045", "A normal user");

    private final String username;
    private final String password;
    private final String name;
    private final String lastName;
    private final String postalCode;
    private final String description;

    User(String username, String password, String name, String lastName, String postalCode, String description) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.postalCode = postalCode;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}

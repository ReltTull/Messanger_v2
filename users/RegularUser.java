package users;

import message.TextMessage;

public class RegularUser extends User{
    public RegularUser(String name) {
        super(name, "Regular user");
    }

    @Override
    public TextMessage fillMessage() {
        return super.fillMessage();
    }
}

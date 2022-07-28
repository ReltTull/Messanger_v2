package users;

import message.TextMessage;

public class RegulatUser extends User{
    public RegulatUser(String name) {
        super(name, "Regular user");
    }

    @Override
    public TextMessage fillMessage() {
        return super.fillMessage();
    }
}

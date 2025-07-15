public class Account {
    protected int id;
    protected String name;
}

public class User extends Account {

    public User(int _id, String _name) {
        id = _id;
        name = _name;
    }
}

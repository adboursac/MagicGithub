package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://avatarfiles.alphacoders.com/222/222101.jpg"),
            new User("002", "Paul", "https://avatarfiles.alphacoders.com/230/230575.jpg"),
            new User("003", "Phil", "https://avatarfiles.alphacoders.com/450/45051.jpg"),
            new User("004", "Guillaume", "https://avatarfiles.alphacoders.com/450/45048.jpg"),
            new User("005", "Francis", "https://avatarfiles.alphacoders.com/450/45047.jpg"),
            new User("006", "George", "https://avatarfiles.alphacoders.com/233/233093.jpg"),
            new User("007", "Louis", "https://avatarfiles.alphacoders.com/448/44825.png"),
            new User("008", "Mateo", "https://avatarfiles.alphacoders.com/445/44543.jpg"),
            new User("009", "April", "https://avatarfiles.alphacoders.com/519/51908.png"),
            new User("010", "Louise", "https://avatarfiles.alphacoders.com/450/45050.jpg"),
            new User("011", "Elodie", "https://avatarfiles.alphacoders.com/460/46084.png"),
            new User("012", "Helene", "https://avatarfiles.alphacoders.com/247/247692.png"),
            new User("013", "Fanny", "https://avatarfiles.alphacoders.com/464/46418.jpg"),
            new User("014", "Laura", "https://avatarfiles.alphacoders.com/471/47140.jpg"),
            new User("015", "Gertrude", "https://avatarfiles.alphacoders.com/470/47022.jpg"),
            new User("016", "Chloé", "https://avatarfiles.alphacoders.com/845/84582.png"),
            new User("017", "April", "https://avatarfiles.alphacoders.com/916/91630.jpg"),
            new User("018", "Marie", "https://avatarfiles.alphacoders.com/115/115278.png"),
            new User("019", "Henri", "https://avatarfiles.alphacoders.com/443/44329.jpg"),
            new User("020", "Rémi", "https://avatarfiles.alphacoders.com/235/235451.jpg")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://avatarfiles.alphacoders.com/762/76262.png"),
            new User("022", "Geoffrey", "https://avatarfiles.alphacoders.com/242/242417.png"),
            new User("023", "Simon", "https://avatarfiles.alphacoders.com/284/284754.jpg"),
            new User("024", "André", "https://avatarfiles.alphacoders.com/462/46282.jpg"),
            new User("025", "Leopold", "https://avatarfiles.alphacoders.com/215/215750.jpg")
    );
}

package store;

import model.Post;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private static final Store INST = new Store();

    private Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Java Job", "Need Java developer", LocalDate.now()));
        posts.put(2, new Post(2, "PHP Job", "Need PHP developer", LocalDate.now()));
        posts.put(3, new Post(3, "C++ Job", "Need C++ developer", LocalDate.now()));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}

package lnu.se;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This is a singleton class.
 * Singleton is good in some instances but not always because
 * it does not allow flexibility.
 * <p>
 * It is good when you do not want to create multiple instances of an object.
 * In this example, it is a database, and that is understandable since a program may have
 * one database, therefore, it does not make any sense to create many instances of the database and
 * it is good to make one instance and protect the information.
 * <p>
 * It is also good for UTIL classes when they do not hold values rather they provide
 * functionalities, and these functionalities often do not change over time.
 */
public class Database {

    /**
     * A private field for the database.
     */
    private static Database database;

    private final ArrayList<String> myDatabase = new ArrayList<>();

    /**
     * A private constructor, to prevent creating instances.
     */
    private Database() {

    }

    /**
     * It returns the instance of the database.
     * If it is null, we initialize it. Other wise we return the instance.
     *
     * @return database.
     */
    public static Database getInstance() {
        return Objects.requireNonNullElseGet(database, Database::new);
    }

    public void addInfo(String info) {
        myDatabase.add(info);
    }

    public String getInfo(int index) {
        return myDatabase.get(index);
    }
}

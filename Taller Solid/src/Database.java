public interface Database {
    void insert(String statement);
    void select(String statement);
    void delete(String statement);
    void update(String statement);
    // Otros métodos relacionados con la base de datos
}
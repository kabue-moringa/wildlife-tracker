import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DataBaseRule extends ExternalResource{
    private Connection con;
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "moringa", "Access");
    @Override
    public void before(){
        con=sql2o.open();
    }
    @Override
    public void after(){
        con.createQuery("DELETE FROM animals *;").executeUpdate();
        con.createQuery("DELETE FROM sightings *;").executeUpdate();
        con.close();
    }
    public Connection getCon(){
        return this.con;
    }

}

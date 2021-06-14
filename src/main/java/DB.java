


import org.sql2o.Sql2o;


public class DB {
    //use the line below if you want to run locally replacing user with db username and pass with db password
    // The line below runs app on heroku comment the line below if you want to run your app locally these are my
    // credentials so they  will not work for you
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "moringa", "Access");
}


//    public Connection getCon(){
//        return con;
//    }
//    public  String executeCommand(String sql){
//        try{
//            con.createQuery(sql).executeUpdate();
//        }
//        catch (Exception ex) {
//            return "Error insertion";
//        }
//        return "Complete";
//    }
//    public List<Animal> allData(){
//        return con.createQuery("SELECT id,name,category,health,age,status FROM animals").executeAndFetch(Animal.class);
//    }
//
//    public Animal getAnimal(double id){
//        return (Animal) con.createQuery("SELECT id,name,category,health,age,status FROM animals WHERE id=:id;")
//                .addParameter("id",id)
//                .executeAndFetchFirst(Animal.class);
//    }
//    public List<Sighting> getSightings(double id) {
//        return  con.createQuery("SELECT id, ranger_name, location,doing,animals,date,month FROM sightings WHERE animals=:id;")
//                .addParameter("id", id)
//                .executeAndFetch(Sighting.class);
//    }
//
//    public List<Sighting> getSighting(double id) {
//        return con.createQuery("SELECT id,ranger_name,location,doing,animal,date,month FROM sightings WHERE animal=:id;")
//                .addParameter("id", Double.toString(id))
//                .executeAndFetch(Sighting.class);
//    }
//
//}
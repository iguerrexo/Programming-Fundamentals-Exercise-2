public class PlayerSystem{

    public static void main(String[] args){
        
        System.out.println(" ------- Player System -------");
        
        Player messi = new Player("Lionel Messi","Argintina",125487.25); // object
        //mess.name="Lionel Messi"
        //messi.setName("Lionel Messi");
        //messi.setNationality("Argentina");
        //messi.salary= $14578939.23;
        
        messi.printPlayer();

        //create an object
        Player cr7 = new Player("Cristiano Ronaldo","Portuguese",124857.25);

        //asign vaules to the atribute
        // cr7.setName("Cristiano Ronaldo");
        // cr7.setNationality("Portuguese");
        //cr7.salary= 31000000.00;
        
        //display the vaules (use the method)
        cr7.printPlayer();

            }
    }


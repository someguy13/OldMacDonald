class Farm  {     
   private Animal[] farmAnimals = new Animal[3];    
   public Farm()     {       
      farmAnimals[0] = new NamedCow("cow","moo","Elsie");           
      farmAnimals[1] = new Chick("chick","cluck","cheep");       
      farmAnimals[2] = new Pig("pig","oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < farmAnimals.length; nI++)       {          
       System.out.println( "The " + farmAnimals[nI].getType() + " goes " + farmAnimals[nI].getSound());       
      }
      	System.out.println("The cow is named " + ((NamedCow)farmAnimals[0]).getName());    
    } 
} 
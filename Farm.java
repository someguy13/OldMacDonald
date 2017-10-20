class Farm  {     
   private Animal[] farmAnimals = new Animal[3];    
   public Farm()     {       
      farmAnimals[0] = new NamedCow("cow","moo","Elsie");           
      farmAnimals[1] = new Chick("chick","cluck","cheep");       
      farmAnimals[2] = new Pig("pig","oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < farmAnimals.length; nI++)       {      
       System.out.println("Old MacDonald had a farm");
       System.out.println("E-I-E-I-O");
       System.out.println("And on his farm he had a " + farmAnimals[nI].getType());
       System.out.println("E-I-E-I-O");
       System.out.println("With a " + farmAnimals[nI].getSound() +" "+ farmAnimals[nI].getSound() + " here"); 
       System.out.println("And a " + farmAnimals[nI].getSound() +" " + farmAnimals[nI].getSound() + " there"); 
       System.out.println("Everywhere a " + farmAnimals[nI].getSound() +" " + farmAnimals[nI].getSound());
       System.out.println("Old MacDonald had a farm");
       System.out.println("E-I-E-I-O");     
      }
      	System.out.println("The cow is named " + ((NamedCow)farmAnimals[0]).getName());    
    } 
} 
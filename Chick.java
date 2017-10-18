class Chick implements Animal
{         
    private String mySound;
    private String myType;

   	public Chick(String type, String sound){
   		mySound = sound;
   		myType = type;
   	}
   	public Chick(String type, String sound1, String sound2){
   		if(Math.random() < 0.5){
   			mySound = sound1;
   		}
   		else{
   			mySound = sound2;
   		}
   		myType = type;
   	}
   	public Chick(){
   		mySound = "unknown";
   		myType = "unknown";
   	}
   	public String getSound(){return mySound;}
   	public String getType(){return myType;}
}



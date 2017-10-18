class NamedCow extends Cow
{
	private String myType,mySound,myName;
	public NamedCow(String type, String sound, String name){
		myType = type;
		mySound = sound;
		myName = name;
	}
	public String getName(){return myName;}
}
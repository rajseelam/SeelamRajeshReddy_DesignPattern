package Creational_Patterns;

public class get_Trip_Factory {
public plan get_Trip(String City)
{
	if(City.equals("Banglore"))
	{
		return new Banglore();
	}
	else if(City.equals("Goa"))
	{
		return new Goa();
	}
	else if(City.equals("Delhi"))
	{
		return new Delhi();
	}
	else if(City.equals("Hyderabad"))
	{
		return new Hyderabad();
	}
	return null;
}

}

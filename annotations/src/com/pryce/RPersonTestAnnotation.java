package com.pryce;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(value=RetentionPolicy.RUNTIME)
abstract @interface person
{
	public abstract String personFirstNAme();
	public abstract String personlastNAme();
	public abstract String personEmailId();
	public abstract String personAddress()
	default"Bangalore";
	public abstract int personAge()
	default 23;
}	
@person(personFirstNAme="ABC",
		personlastNAme="XYZ",
		personEmailId="abcxyz@laratechnology.com",
		personAddress="Bangalore",
		personAge=23)
		public class RPersonTestAnnotation
		{
		}

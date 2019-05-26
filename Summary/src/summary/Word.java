package Summary;
import java.io.*;
import java.util.*;
public class Word
	{ 
		public String value;
		public int tf;
		public double df;
		public double tfidf;
		public Word(){
			value = null;
			tf =0;
			df= 1.0;
			tfidf=0.0;
			}

		public Word(String value,int tf)
		{
			this.value = new String(value);
			this.tf = tf;
			df=1.0;
			tfidf=0.0;
		}
	}
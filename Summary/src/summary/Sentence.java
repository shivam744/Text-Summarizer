package Summary;
import java.io.*;
import java.util.*;
public class Sentence{
	public int number;
	public double score =0.0;
	public String value;

	public Sentence(int number, String value){
		this.number = number;
		this.value = new String(value);
		score = 0.0;
	}
}

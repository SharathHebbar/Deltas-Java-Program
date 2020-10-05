import java.util.*;
public class morsecode
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any digit between 0 to 9 or alphabets between A to Z");
char input = in.next().charAt(0); 
switch(input)
{
case 'a':
case 'A':
System.out.println(".-");
break;
case 'b':
case 'B':
System.out.println("-...");
break;
case 'c':
case 'C':
System.out.println("-.-.");
break;
case 'd':
case 'D':
System.out.println("-..");
break;
case 'e':
case 'E':
System.out.println(".");
break;
case 'f':
case 'F':
System.out.println("..-.");
break;
case 'g':
case 'G':
System.out.println("--.");
break;
case 'h':
case 'H':
System.out.println("....");
break;
case 'i':
case 'I':
System.out.println("..");
break;
case 'j':
case 'J':
System.out.println(".---");
break;
case 'k':
case 'K':
System.out.println("-.-");
break;
case 'l':
case 'L':
System.out.println(".-..");
break;
case 'm':
case 'M':
System.out.println("--");
break;
case 'n':
case 'N':
System.out.println("-.");
break;
case 'o':
case 'O':
System.out.println("---");
break;
case 'p':
case 'P':
System.out.println(".--.");
break;
case 'q':
case 'Q':
System.out.println("--.-");
break;
case 'r':
case 'R':
System.out.println(".-.");
break;
case 's':
case 'S':
System.out.println("...");
break;
case 't':
case 'T':
System.out.println("-");
break;
case 'u':
case 'U':
System.out.println("..-");
break;
case 'v':
case 'V':
System.out.println("...-");
break;
case 'w':
case 'W':
System.out.println(".--");
break;
case 'x':
case 'X':
System.out.println("-..-");
break;
case 'y':
case 'Y':
System.out.println("-.--");
break;
case 'z':
case 'Z':
System.out.println("--..");
break;

case '1':
System.out.println(".----");
break;

case '2':
System.out.println("..---");
break;

case '3':
System.out.println("...--");
break;

case '4':
System.out.println("....-");
break;

case '5':
System.out.println(".....");
break;

case '6':
System.out.println("-....");
break;

case '7':
System.out.println("--...");
break;

case '8':
System.out.println("---..");
break;

case '9':
System.out.println("----.");
break;

case '0':
System.out.println("-----");
break;

default : System.out.println("Rerun the program and Enter a valid value ");
break;
}

}
}
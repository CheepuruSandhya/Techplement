import java.nio.file.*;
import java.util.*;
public class Game
{
private static ArrayList<Question>questions=new ArrayList<Question>();
private static void init()
{
try
{
List<String> lines = Files.readAllLines(Paths.get("data.txt"));
for(int i=0;i<lines.size();i+=5)
{
Question q=new Question(lines.get(i),lines.get(i+1),lines.get(i+2),lines.get(i+3),lines.get(i+4));
questions.add(q);
}}

catch(Exception e)
{
System.out.println("Couldn't read file data.txt.System will now exit");
System.exit(-1);
}}

private static void loop()
{
Scanner scan=new Scanner(System.in);
while(questions.size()>0)
{
Question q=questions.remove(0);
System.out.println(q.text);
for(int i=0;i<q.answers.length;i++)
{
System.out.println(i + " " +q.answers[i]);
}
int input=scan.nextInt();
if(input< 0 || input > q.answers.length - 1)
{
System.out.println("input is invalid");
System.exit(-2);
}
if(q.rightAnswer.equals(q.answers[input]))
{
System.out.println("Right");}
else
{
System.out.println("Wrong");
}
}}
public static void main(String args[])
{
init();
loop();
}}

















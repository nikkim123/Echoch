import java.io.*;
import java.net.*;
public class EchoServer
{
public static void main(String args[]) throws Exception
{
try
{
int Port;
BufferedReader Buf =new BufferedReader(new
InputStreamReader(System.in));
System.out.print(" Enter the Port Address : " );
Port=Integer.parseInt(Buf.readLine());
ServerSocket sok =new ServerSocket(Port);
System.out.println(" Server is Ready To Receive a Message. ");
System.out.println(" Waiting ..... ");
Socket so=sok.accept();
if(so.isConnected()==true)
            System.out.println(" Client Socket is Connected Succecfully. ");
InputStream in=so.getInputStream();
OutputStream ou=so.getOutputStream();
PrintWriter pr=new PrintWriter(ou);
BufferedReader buf=new BufferedReader(new
InputStreamReader(in));
String str=buf.readLine();
 

:wq



:q














:wq


:w
:wq
:wq
:wq
A
A
A
A
A
A
A

B
B
B
B
B
B
B
B
B
B
B
B
B
B
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A
A

